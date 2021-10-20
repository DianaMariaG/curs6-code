package ro.fasttrackit.curs6;
//scrieti o functie care primeste un sir de numere intregi si un alt numar intreg. Returnati toate numerele mai mari decat numarul primit

import java.util.*;
public class FindNumbersBiggerThanX {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,-4,7,10,-3};
        int x = 2;
        System.out.println(Arrays.toString(findNumbersBiggerThanParameter(numbers, x)));
    }

    private static int[] findNumbersBiggerThanParameter(int[] numbers, int x) {
        int count = 0;
        for (int number : numbers) {
            if (number > x) {
                count++;
            }
        }
        int[] result = new int[count];
        int j = 0;
        for (int number : numbers) {
            if (number > x) {
                result[j] = number;
                j++;
            }
        }
        return result;
    }
}