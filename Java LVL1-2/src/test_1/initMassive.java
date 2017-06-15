package test_1;

import java.util.Arrays;

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */
public class InitMassive {
    int[] massive = new int[10];

    public void printMassive() {
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) Math.round(Math.random() * 1);
            if (massive[i] == 1)
                massive[i] = 0;
            else
                massive[i] = 0;
        }
        System.out.println(Arrays.toString(massive));
    }
}
