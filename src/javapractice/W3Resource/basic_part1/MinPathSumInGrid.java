package javapractice.W3Resource.basic_part1;

import java.util.Arrays;

/**
 * manipulating 2D array
 * get the first row length
 * get the first column length
 * create a new 2D array
 * initialize the first element
 * complete first row by adding previous cell value
 * complete first column by adding previous cell value
 * complete remaining cell values
 */
public class MinPathSumInGrid {
    public static int getMinPathSumInGrid(int[][] grid){
        //check if grid is not null
        if ((grid.length==0) || (grid==null) || (grid[0].length==0)){
            return 0;
        }
        //get the row length
        int row = grid.length;
        //get the column length
        int col = grid[0].length;
        //create a new 2D array
        int[][] result = new int[row][col];
        //initialize the first element
        result[0][0] = grid[0][0];
        //fill the first row by adding previous cell value
        for (int i = 1; i<row; i++){
            result[0][i] = result[0][i-1]+grid[0][i];
        }
        //fill the first column values
        for (int j = 1; j<col; j++){
            result[j][0]=result[j-1][0]+grid[j][0];
        }
        //fill the rest of cell values
        for (int i= 1; i<row; i++){
            for (int j = 1; j<col; j++){
                result[i][j] = Math.min(result[i-1][j], result[i][j-1]);
            }
        }
       //return the minimum sum
        return result[row-1][col-1];
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {{7,4,2},
                                    {0,5,6},
                                    {3,1,2}};
        System.out.println(getMinPathSumInGrid(grid));
    }
}
