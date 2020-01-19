package Homework2;

public class Task4 {
    public static void main(String[] args) {

        int[][] doubleArr = new int[11][11];
        for (int i = 0; i <doubleArr.length ; i++) {
            for (int j = 0; j <doubleArr.length ; j++) {
                if(i == j)   {
                    doubleArr[i][j] = 1;
                }
                System.out.print(doubleArr[i][j] + " ");
            }
            System.out.print("\r\n");
        }

    }
}
