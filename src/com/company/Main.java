package com.company;

public class Main {

//    Assume that a two-dimensional rectangular array of
//    integers called matrix has been declared with six rows
//    and eight columns. Write a for loop to copy the contents
//    of the second column into the fifth column.

    public static void main(String[] args) {
	// write your code here

        int[][] matrix = new int[6][8];
        for(int i = 0; i < matrix.length; i++){
            matrix[i][4] = matrix[i][1];
        }
    }
}
