package Homework2;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxArr = arr.length;
        for(int i = 0; i < maxArr; i++){
            System.out.print (arr[i]);
        }

        System.out.println("\r\n");

        for(int i = 0; i < maxArr; i++)
            if(arr[i] == 1) {
                arr[i] = 0;
            }else arr[i] = 1;
        for (int i = 0; i < maxArr; i++){
            System.out.print ( arr[i]);
        }
    }

}
