package com.company;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {2,5,7,1,3,9,4,8};
        quickSort.sort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
        char[] array1 = {'a','d','e','b','c'};
        quickSort.sort(array1,0, array1.length-1);
        System.out.println(Arrays.toString(array1));
        float[] array2 = {2.2f,3.5f,1.1f,2.2f,3.3f};
        quickSort.sort(array2,0, array2.length-1);
        System.out.println(Arrays.toString(array2));

    }
}
