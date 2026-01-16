package dsa.patterns;

import java.util.Scanner;

public class InvertedHollowTriangle {

    public void printPattern(int rows) {

        int i, j ,k;

        for(i = rows; i >= 1; i--) {

            for(j=rows; j>i; j--) {
                System.out.print(" ");
            }
            for(k=1; k<=(2*i-1); k++) {
                if(k==1 || i == rows || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedHollowTriangle iht = new InvertedHollowTriangle();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows you want: ");
        int rows = sc.nextInt();

        iht.printPattern(rows);
    }
}

//Simple solid triangle - DONE
//Hollow Simple Triangle - DONE
//Then, Inverted Hollow Triangle