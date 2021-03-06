package w2;

/*
Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
*/

import java.util.Random;

public class Problems2_3 {
    private static final int[] ARR = new int[8];

    private static boolean checkOdd(int a) {
        return a % 2 != 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i < ARR.length; i++) {
            Random random = new Random();
            int num = 1 + random.nextInt(10);
            ARR[i] = num;
            System.out.print("  " + ARR[i] + "  ");
        }
        System.out.println("\n");
        for (int i = 0; i < ARR.length; i++) {
            if (checkOdd(i)) {
                ARR[i] = 0;
            }
            System.out.print("  " + ARR[i] + "  ");
        }
    }
}
