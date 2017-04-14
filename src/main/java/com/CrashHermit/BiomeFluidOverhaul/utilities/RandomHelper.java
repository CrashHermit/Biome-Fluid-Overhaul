package com.CrashHermit.BiomeFluidOverhaul.utilities;

import java.util.Random;

/**
 * Created by joshua on 4/13/17.
 */
public class RandomHelper
{
    public static final Random random = new Random();

    public static int getRandomIntFromRange(int min, int max)
    {
        return min + (max > min ? random.nextInt(1 + max - min) : 0);
    }

    //random.nextFloat() returns a float value between 0.0 and 1.0
    //bound sets the limit (example random.nextFloat() * 2.0 = 0.0 - 2.0)
    public static float nextFloat(Random random, float bound)
    {
        return random.nextFloat() * bound;
    }
}
