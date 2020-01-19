package Homework2;

public class Task2 {
    public static void main(String[] args) {


        int[] array;
        array = new int[8];
        for (int i = 0, j = 0; array.length > i; i++, j += 3) {
            array[i] = j;
            System.out.print(array[i] + " ");
        }
    }
}
