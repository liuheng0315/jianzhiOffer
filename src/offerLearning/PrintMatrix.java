package offerLearning;

import java.util.ArrayList;

/**
 * Created by root on 2018/3/22.
 */
public class PrintMatrix {
    public static void main(String[] args) {
       int[][] matrix= new int[][]{ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       ArrayList<Integer> list=printMatrix(matrix);
        for (Integer n:list
             ) {
            System.out.print(n+" ");
        }
    }


    public static ArrayList<Integer> printMatrix(int[][] matrix){
        if (matrix.length <=0||matrix[0].length<=0) {
            return null;
        }
        int start=0;
        int rows=matrix.length;
        int columns=matrix[0].length;
        ArrayList<Integer> list =new ArrayList<Integer>();
        while (rows>2*start&&columns>2*start){
            ArrayList<Integer> list2 = print(matrix,rows,columns,start);
            for (Integer n:list2
                    ) {
                list.add(n);
            }
            ++start;
        }
        return list;
    }

    private static ArrayList<Integer> print(int[][] matrix, int rows, int columns, int start) {
        int endx = columns - start-1 ;
        int endy = rows - start-1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = start; i <= endx; i++) {
            int number = matrix[start][i];
            list.add(number);
        }
        if (start < endy) {
            for (int i = start + 1; i <= endy; i++) {
                int number = matrix[i][endx];
                list.add(number);
            }
        }
        if (start < endy && start < endx) {
            for (int i = endx - 1; i >= start; i--) {
                int number = matrix[endy][i];
                list.add(number);
            }
        }
        if (start < endy - 1 && start < endx) {
            for (int i = endy - 1; i >= start + 1; i--) {
                int number = matrix[i][start];
                list.add(number);
            }
        }
        return list;
    }
    }