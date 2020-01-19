package Homework2;

public class Task5 {
    public static void main(String[] args) {
        int [] array1 = {-5,1,3,6,22,4,3,2,50,12,11};

        for (int c : array1) {
            System.out.print(c+ " ");
        }
        System.out.println("\r\n");
        for (int i = 0; i < array1.length ; i++)
            if (0 >= array1[i])
                System.out.println("Минимальным числом в массиве \nявляется " + array1[i]);

    }
}
