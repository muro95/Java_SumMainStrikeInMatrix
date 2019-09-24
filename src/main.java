import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row = input.nextInt();
        System.out.println("Enter the number of column; ");
        int column = input.nextInt();
        int[][] array = createArray(row, column);
        display(array);
        int result = cal(array);
        System.out.print("The total: " + result);
    }

    static int cal(int[][]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if (arr[i] == arr[j]){
                   sum += arr[i][j];
               }
            }
        } return sum;
    }

    static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] createArray(int row, int column) {
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        return array;
    }
}
