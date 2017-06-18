package test_1;

import java.util.Arrays;

public class Main {
    /*
    * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    * С помощью цикла и условия заменить 0 на 1, 1 на 0;
    2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
    цикла(-ов) заполнить его диагональные элементы единицами;
    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true
    если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
    checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true,
     граница показана символами ||, эти символы в массив не входят.
    7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или
    отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя
    пользоваться вспомогательными массивами.*/

    public static void main(String[] args) {
        // 1:
        InitMassive test1 = new InitMassive();
        test1.printMassive();
        // 2:
        int[] mas8 = new int[8];
        int k = 0;
        for (int i = 0; i <= 21; i = i + 3) {
            mas8[k++] = i;
            System.out.print(i + " ");
        }
        System.out.println();
        // 3:
        int[] mas6x2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mas6x2.length; i++) {
            if (mas6x2[i] < 6)
                mas6x2[i] *= 2;
        }
        System.out.println(Arrays.toString(mas6x2));
        // 4:
        int[][] mas2D = new int[9][9];
        for (int i = 0; i < mas2D.length; i++) {
            for (int j = 0; j < mas2D.length; j++) {
                if (i == j || mas2D.length - i - 1 == j) {
                    mas2D[i][j] = 1;
                } else mas2D[i][j] = 8;
            }
            System.out.println(Arrays.toString(mas2D[i]));
        }
        // 5:
        int[] mas5 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 100};
        int max = mas5[0], min = mas5[0];
        for (int i : mas5) {
            if (i < min) min = i;
            else if (i > max) max = i;
        }
        System.out.println("min-" + min + " " + "max-" + max);
        // 6:
        int[] mas6 = new int[]{1, 1};
        System.out.println(checkBalance(mas6));
        // 7:
        int[] mas7 = new int[]{1, 2, 3, 4, 0, -1, 8, 9};
        System.out.println(shiftN(mas7, 4));
    }

    public static boolean checkBalance(int[] massive) {
        int left = 0, right = 0;
        if (massive.length == 2) return (massive[0] == massive[1]);
        for (int i = 0; i < massive.length; i++) {
            if (i <= massive.length / 2 ) {
                left += massive[i];
            } else right += massive[i];
        }   //System.out.println("legt: " + left + " ; " + "right: " + right);
        return (left == right);
    }

    public static int[] shiftN(int[] massive, int n) {
        int sft = n % massive.length;
        if (sft != 0) {
            for (int i = 0; i < massive.length; i++) {
                if (i > n - 1) continue;
                int tmp = massive[i];
                massive[i] = massive[sft];
                massive[sft] = tmp;
                if (sft < massive.length - 1)
                sft++;
            }
        }
        System.out.println(Arrays.toString(massive));
        System.out.println("sft = " + sft);

        return null;
    }
}
