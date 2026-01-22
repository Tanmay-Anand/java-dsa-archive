package dsa.matrix;

//1 2 3        1 2 3
//4 5 6   ->   8 9 4
//7 8 9        7 6 5

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public void spiralMatrix(int[][] input, int n) {

        List<Integer> ans = new ArrayList<>();

        int m = input[0].length;

        int top = 0;
        int right = m-1;
        int bottom = n-1;
        int left = 0;

        while(top <= bottom && left <= right) {

            //left to right
            for(int i=left; i<= right; i++)
                ans.add(input[top][i]);
            top ++;

            //top to bottom
            for(int i=top; i<= bottom; i++)
                ans.add(input[i][right]);
            right--;

            //right to left
            if(top<=bottom) {
                for(int i=right; i>= left; i--)
                    ans.add(input[bottom][i]);
                bottom--;
            }

            //bottom to top
            if(left <= right) {
                for(int i=bottom; i>= top; i--)
                    ans.add(input[i][left]);
                left++;
            }
        }
        for (int i=0; i< ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        SpiralMatrix sm = new SpiralMatrix();

        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int n = input.length;

        System.out.println("Input matrix:");
        System.out.println();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Output matrix:");
        System.out.println();

        sm.spiralMatrix(input, n);
    }
}
