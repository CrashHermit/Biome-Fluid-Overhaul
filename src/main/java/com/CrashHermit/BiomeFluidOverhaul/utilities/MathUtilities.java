package com.CrashHermit.BiomeFluidOverhaul.utilities;

import net.minecraft.util.math.MathHelper;

/**
 * Created by joshua on 4/13/17.
 */
public class MathUtilities
{

    /*************************************************************************************************
     Custom clamp function that takes a value and assigns a min and max for that value
     *************************************************************************************************/

    /*public float clamp(float value, float minimum, float maximum)
    {
        return Math.max(minimum, Math.min(maximum, value));
    }
    */

    /*************************************************************************************************
     A custom sin function that is used to model periodic processes such as temperature and humidity
     The function takes on the values between -1 and 1.

     timeCount:         is the value that changes, this is usually some kind of time measurement like ticks
     timeMax is the length of that time period; an example would be 1 day is 24 hours timeCount is your hours and timeMax is 24, the total length of the day.
     offsetX is clamped between 0 and 1 to be able to shift the phase of the graph, example: offsetX = .5 will shift the whole function 1/2 a period, and the beginning value will be 1 instead of 0
     amplitude:         value that increases or decreases the range of the graph, positive numbers
     *************************************************************************************************/

    public float sinFunctionTime(int timeCounter, int timeMax, float offsetX, float offsetY, float amplitude)
    {
        offsetX = MathHelper.clamp_float(offsetX, 0.0F, 1.0F);

        float sinFunction = amplitude * (float)Math.sin( 2 * Math.PI * ((timeCounter) / timeMax) - offsetX ) + offsetY;

        return sinFunction;
    }

    /*************************************************************************************************
     Custom quadratic growth function where you can specify the degree, shape, x offset and y offset of the graph
     The function is designed to be intuitive for users to control, with positive values increasing factors and negative ones decreasing factors

     polynomialValue:       the main input, it will vary between -1 and 1 and return some value between 0 and 1
     offsetX:               moves the graph to the left if negative and to the right if positive, values between -1 and 1
     offsetY:               moves the graph up if positive and down if negative
     polynomialMultiplier:  increases the width of the graph if positive and decrease the width of the graph if negative and a 0 value will create a flat graph that only returns the offsetY.
     polynomialDegree:      adjusts the degree of the polynomial, even values create a U shaped graph and odd values create a different shape, values -inf to +inf integers
     polynomialFlipped:     inverts the shape of the graph, for example a U shaped graph will be turned upside down when this is true, values true or false
     *************************************************************************************************/

    public float quadraticFunctionGrowth(float polynomialMultiplier, boolean polynomialFlipped, int polynomialDegree, float polynomialValue, float polynomialOffsetX, float polynomialOffsetY)
    {
        float quadraticFunction = 1.0F;
        polynomialValue = MathHelper.clamp_float(polynomialValue, -1.0F, 1.0F);

        if(polynomialFlipped == true && polynomialMultiplier < 0)
        {
            polynomialMultiplier *= -1.0F;
            quadraticFunction = -(polynomialMultiplier) * (float)(Math.pow(polynomialValue - polynomialOffsetX, polynomialDegree) + 1.0F + polynomialOffsetY);
            return quadraticFunction;
        }
        else if(polynomialFlipped == true && polynomialMultiplier > 0)
        {
            quadraticFunction = -(1 / polynomialMultiplier) * (float)(Math.pow(polynomialValue - polynomialOffsetX, polynomialDegree) + 1.0F + polynomialOffsetY);
            return quadraticFunction;
        }
        else if(polynomialFlipped == false && polynomialMultiplier < 0)
        {
            polynomialMultiplier *= -1.0F;
            quadraticFunction = polynomialMultiplier * (float)(Math.pow(polynomialValue - polynomialOffsetX, polynomialDegree) + polynomialOffsetY);
            return quadraticFunction;
        }
        else if(polynomialFlipped == false && polynomialMultiplier > 0)
        {
            quadraticFunction = -(1 / polynomialMultiplier) * (float)(Math.pow(polynomialValue - polynomialOffsetX, polynomialDegree) + 1.0F + polynomialOffsetY);
            return quadraticFunction;
        }
        else if(polynomialMultiplier == 0.0F)
        {
            quadraticFunction = polynomialOffsetY;
            return quadraticFunction;
        }

        return quadraticFunction;

    }

    /*************************************************************************************************
     Finds the maximum float value of an array and returns that as a float
     *************************************************************************************************/

    public float maximumOfArray(float inputArray[])
    {
        float maximumValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++)
        {
            if( inputArray[i] > maximumValue )
            {
                maximumValue = inputArray[i];
            }
        }

        return maximumValue;
    }

    /*************************************************************************************************
     Finds the minimum float value of an array and returns that as a float
     *************************************************************************************************/

    public float minimumOfArray(float inputArray[])
    {
        float minimumValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++)
        {
            if( inputArray[i] < minimumValue )
            {
                minimumValue = inputArray[i];
            }
        }

        return minimumValue;
    }

}
