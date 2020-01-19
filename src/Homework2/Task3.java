package Homework2;

public class Task3 {

    public static void main(String[] args) {
    // Решение 1


    int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    int MaxArr = arr.length;
    for (int i = 0; i < MaxArr; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println("\r\n");
    for (int i = 0; i < MaxArr; i++)
        if (arr[i] < 6) arr[i]*=2;
    for (int i = 0; i < MaxArr; i++) {
        System.out.print(arr[i] + " ");
    }

    System.out.println("\r\n");

    // Решение 2
    int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int c : arr1) {
        System.out.print(c +" ");

    }
    System.out.println("\r\n");

    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] < 6) arr1[i] *= 2;
        System.out.print(arr1[i] + " ");
    }
}
}
