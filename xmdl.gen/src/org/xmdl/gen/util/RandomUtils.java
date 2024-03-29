package org.xmdl.gen.util;

import java.util.List;
import java.util.Random;

/**
 * @author hd
 */
public class RandomUtils {

    public static final RandomUtils INST = new RandomUtils();

    protected RandomUtils() {
        super();
    }

    private static int RandomAdjuster = 0;
    private Random random = new Random();

    public String randomString(int length) {
        // Generate a random String
        String result = "";

        String chars = "Lz23456789AaBbCcDdEeFfGgHhJjKkMmNnMkPpQqRrSsTtUuVvWwXxYyZzf52abc";

        seed();
        byte[] passByte = new byte[length];
        random.nextBytes(passByte);
        int nextSpace = 3 + randomInt(10);
        for (int i = 0; i < passByte.length; i++) {
            result += chars.charAt(passByte[i] & 0x3f);
            if (i == nextSpace) {
            	result += " ";
                nextSpace = 3 + randomInt(10) + ++i;
            }
        }

        return result;
    }

    private void seed() {
        int seed = (int) (System.currentTimeMillis() % 20) + 1
                + RandomAdjuster++;

        random.setSeed(System.currentTimeMillis() * seed);
    }

    public double randomDouble(double limit) {
        seed();
        return random.nextDouble() % limit;
    }

    public int randomInt(int limit) {
        seed();
        return random.nextInt(limit);
    }

    public long randomLong() {
        seed();
        return random.nextLong();
    }

    public boolean randomBoolean() {
        seed();
        return random.nextBoolean();
    }

    public Object randomObject(List<?> choices) {
        int size = choices.size();
        int rnd = randomInt(size);
        Object object = choices.get(rnd);
        return object;
    }

    public Object randomLong(long limit) {
        long l = randomLong();
        if (l < 0)
            l = -l;
        return l % limit;
    }

}