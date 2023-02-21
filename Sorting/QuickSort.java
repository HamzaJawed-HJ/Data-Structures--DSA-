package com.company;

public class QuickSort {

    public void sort(int[] array, int start, int end){
        if (start > end) {
            return;
        }
        int boundary = partition(array,start,end);
        sort(array,start,boundary-1);
        sort(array,boundary+1,end);
    }

    private int partition(int[] array, int start, int end){
        int pivot = array[end];
        int boundary = start-1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot){
                swap(array,i,++boundary);
            }
        }
        return boundary;
    }

    private void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public void sort(char[] array, int start, int end){
        if (start > end) {
            return;
        }
        int boundary = partition(array,start,end);
        sort(array,start,boundary-1);
        sort(array,boundary+1,end);
    }

    private int partition(char[] array, int start, int end){
        int pivot = array[end];
        int boundary = start-1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot){
                swap(array,i,++boundary);
            }
        }
        return boundary;
    }

    private void swap(char[] array, int index1, int index2){
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void sort(float[] array, int start, int end){
        if (start > end) {
            return;
        }
        int boundary = partition(array,start,end);
        sort(array,start,boundary-1);
        sort(array,boundary+1,end);
    }

    private int partition(float[] array, int start, int end){
        float pivot = array[end];
        int boundary = start-1;
        for (int i = start; i <= end; i++) {
            if (array[i] <= pivot){
                swap(array,i,++boundary);
            }
        }
        return boundary;
    }

    private void swap(float[] array, int index1, int index2){
        float temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }



}
