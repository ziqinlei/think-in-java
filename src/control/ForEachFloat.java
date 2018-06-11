package control;

import java.util.Random;

/**
 * @author ziqin.lei
 * @since 2018/6/11
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float[] floats = new float[10];
        for (int i = 0; i < 10; i++) {
            floats[i] = rand.nextFloat();
        }
        for (float f : floats) {
            System.out.println(f);
        }
    }
}
