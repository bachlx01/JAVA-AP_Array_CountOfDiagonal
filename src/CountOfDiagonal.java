import java.util.Arrays;
import java.util.Scanner;

public class CountOfDiagonal {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("This is program to count all of number in a column");
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int count = 0;

        int myArray[][] = new int[size][size];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) Math.round(Math.random()*100);
                if (i == j){
                    count += myArray[i][j];
                }
                System.out.printf("%-5d",myArray[i][j]);
            }
            System.out.println();
        }

        System.out.printf("%-5d", count);
    }
}
