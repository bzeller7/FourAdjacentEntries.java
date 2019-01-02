/*
    File Name: FourAdjacentEntries.java
    Author: Brea Zeller
    Programming Assignment 2
    
    Description: that tests whether a two-dimensional array has four
    adjacent numbers with the same value. The method should return true 
    if the array does have four adjacent numbers with the same value, and false otherwise.
*/

public class FourAdjacentEntries {
    public static void main( String[] args ) {
        System.out.println( "Test 1 = " + isAdjacentFour( test_1() ) );
        System.out.println( "Test 2 = " + isAdjacentFour( test_2() ) );
        System.out.println( "Test 3 = " + isAdjacentFour( test_3() ) );
        System.out.println( "Test 4 = " + isAdjacentFour( test_4() ) );
        System.out.println( "Test 5 = " + isAdjacentFour( test_5() ) );
        System.out.println( "Test 6 = " + isAdjacentFour( test_6() ) );
        System.out.println( "Test 7 = " + isAdjacentFour( test_7() ) );
        System.out.println( "Test 8 = " + isAdjacentFour( test_8() ) );
        System.out.println( "Test 9 = " + isAdjacentFour( test_9() ) );
        System.out.println( "Test 10 = " + isAdjacentFour( test_10() ) );
        System.out.println( "Test 11 = " + isAdjacentFour( test_11() ) );
        System.out.println( "Test 12 = " + isAdjacentFour( test_12() ) );
        System.out.println( "Test 13 = " + isAdjacentFour( test_13() ) );
        System.out.println( "Test 14 = " + isAdjacentFour( test_14() ) );
        System.out.println( "Test 15 = " + isAdjacentFour( test_15() ) );
        System.out.println( "Test 16 = " + isAdjacentFour( test_16() ) );
        System.out.println( "Test 17 = " + isAdjacentFour( test_17() ) );
    }
    
    // determines if a 2D array contains
    // four consecutive equal numbers
    // in a row, a column, or on a diagonal.
    public static boolean isAdjacentFour( int[][] a ) {
       
        // TODO: REPLACE THE BODY OF THIS METHOD
        int total_ROW = a.length;
        int total_COLS = a[0].length;
        int row_NUM, col_NUM;
      
        
        for (row_NUM = 0; row_NUM < total_ROW; row_NUM++)
         for (col_NUM = 0;
          (col_NUM + 3) < total_COLS; col_NUM++)
          if ((a[row_NUM][col_NUM] == a[row_NUM][col_NUM + 1]) && (a[row_NUM][col_NUM] == a[row_NUM][col_NUM + 2]) && (a[row_NUM][col_NUM] == a[row_NUM][col_NUM + 3]))
           return (true);
      
      
        for (col_NUM = 0; col_NUM < total_COLS; col_NUM++)
         for (row_NUM = 0;
          (row_NUM + 3) < total_ROW; row_NUM++)
          if ((a[row_NUM][col_NUM] == a[row_NUM + 1][col_NUM]) && (a[row_NUM][col_NUM] == a[row_NUM + 2][col_NUM]) && (a[row_NUM][col_NUM] == a[row_NUM + 3][col_NUM]))
           return (true);
      
      
        for (row_NUM = 0;
         (row_NUM + 3) < total_ROW; row_NUM++)
         for (col_NUM = 0;
          (col_NUM + 3) < total_COLS; col_NUM++)
          if ((a[row_NUM][col_NUM] == a[row_NUM + 1][col_NUM + 1]) && (a[row_NUM][col_NUM] == a[row_NUM + 2][col_NUM + 2]) && (a[row_NUM][col_NUM] == a[row_NUM + 3][col_NUM + 3]))
           return (true);
      
        for (row_NUM = 0;
         (row_NUM + 3) < total_ROW; row_NUM++)
         for (col_NUM = (total_COLS - 1);
          (col_NUM - 3) >= 0; col_NUM--)
          if ((a[row_NUM][col_NUM] == a[row_NUM + 1][col_NUM - 1]) && (a[row_NUM][col_NUM] == a[row_NUM + 2][col_NUM - 2]) && (a[row_NUM][col_NUM] == a[row_NUM + 3][col_NUM - 3]))
           return (true);

        return false;
    }
    
    // four in a row
    // starting at [0][0]
    public static int[][] test_1() {
        return new int[][]
            { { 3, 3, 3, 3, 1, 6, 9 },
              { 0, 1, 6, 8, 6, 0, 8 },
              { 5, 6, 2, 1, 8, 2, 7 },
              { 6, 5, 6, 1, 1, 9, 6 },
              { 1, 3, 6, 1, 4, 0, 5 },
              { 0, 1, 0, 3, 4, 0, 4 } };
    }
    
    // four in a row
    // starting at [5][0]
    public static int[][] test_2() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6 },
              { 0, 1, 6, 8, 6, 0 },
              { 5, 6, 2, 1, 8, 2 },
              { 6, 5, 6, 1, 1, 9 },
              { 1, 3, 6, 1, 4, 0 },
              { 3, 3, 3, 3, 4, 0 } };
    }
    
    // four in a row
    // starting at [2][2]
    public static int[][] test_3() {
        return new int[][]
            { { 0, -1, 1, 0, 3, 1, 6 },
              { 0, -2, 1, 6, 8, 6, 0 },
              { 5, 3, 2, 2, 2, 2, 1 },
              { 6, -3, 5, 6, 1, 1, 9 },
              { 4, 7, 3, 3, 3, 4, 0 } };
    }
    
    // four in a row
    // starting at [1][2]
    public static int[][] test_4() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6 },
              { 0, 1, 6, 6, 6, 6 },
              { 5, 2, 2, 2, 1, 2 },
              { 6, 5, 6, 1, 1, 9 },
              { 4, 3, 3, 3, 4, 0 } };
    }
    
    // four in a column
    // starting at [0][0]
    public static int[][] test_5() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
              { 0, 1, 6, 8, 6, 0, 1 },
              { 0, 5, 2, 1, 8, 2, 9 },
              { 0, 2, 6, 1, 1, 9, 1 },
              { 1, 5, 6, 1, 4, 0, 7 },
              { 3, 5, 3, 3, 4, 0, 7 } };
    }
    
    // four in a column
    // starting at [2][1]
    public static int[][] test_6() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
              { 0, 1, 6, 8, 6, 0, 1 },
              { 5, 5, 2, 1, 8, 2, 9 },
              { 6, 5, 6, 1, 1, 9, 1 },
              { 1, 5, 6, 1, 4, 0, 7 },
              { 3, 5, 3, 3, 4, 0, 7 } };
    }
    
    // four in a column
    // starting at [2][6]
    public static int[][] test_7() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 0 },
              { 0, 1, 6, 8, 6, 6, 0 },
              { 5, 5, 2, 1, 8, 3, 1 },
              { 6, 5, 6, 1, 1, 6, 1 },
              { 1, 5, 6, 1, 4, 0, 1 },
              { 3, 7, 3, 3, 4, 0, 1 } };
    }
    
    // four in a column
    // starting at [1][0]
    public static int[][] test_8() {
        return new int[][]
            { { 3, 1, 0, 3, 1, 6, 0 },
              { 0, 1, 6, 1, 6, 6, 0 },
              { 0, 5, 2, 2, 8, 3, 0 },
              { 0, 5, 6, 1, 1, 6, 1 },
              { 0, 5, 6, 1, 4, 0, 1 },
              { 2, 7, 3, 3, 4, 0, 1 } };
    }
    
    // four in a down diagonal
    // starting at [0][0]
    public static int[][] test_9() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
              { 0, 0, 6, 8, 6, 0, 1 },
              { 9, 6, 0, 7, 8, 2, 9 },
              { 6, 5, 6, 0, 1, 9, 1 },
              { 1, 3, 9, 1, 4, 7, 7 },
              { 3, 3, 3, 9, 4, 0, 7 } };
    }
    
    // four in a down diagonal
    // starting at [2][3]
    public static int[][] test_10() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
              { 0, 1, 6, 8, 6, 0, 1 },
              { 9, 6, 2, 7, 8, 2, 9 },
              { 6, 5, 6, 1, 7, 9, 1 },
              { 1, 3, 9, 1, 4, 7, 7 },
              { 3, 3, 3, 9, 4, 0, 7 } };
    }
    
    // four in a down diagonal
    // starting at [2][0]
    public static int[][] test_11() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
              { 0, 1, 6, 8, 6, 0, 1 },
              { 9, 6, 2, 7, 8, 2, 9 },
              { 6, 9, 6, 1, 6, 9, 1 },
              { 1, 3, 9, 1, 4, 7, 7 },
              { 3, 3, 3, 9, 4, 0, 7 } };
    }
    
    // four in a down diagonal
    // starting at [0][3]
    public static int[][] test_12() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
              { 0, 1, 6, 8, 3, 0, 1 },
              { 9, 6, 2, 7, 8, 3, 9 },
              { 6, 5, 6, 1, 6, 9, 3 },
              { 1, 3, 9, 1, 4, 7, 7 },
              { 3, 3, 3, 9, 4, 0, 7 } };
    }
    
    // four in a up diagonal
    // starting at [0][5]
    public static int[][] test_13() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
              { 5, 6, 2, 1, 6, 2, 9 },
              { 6, 5, 2, 6, 1, 7, 1 },
              { 1, 1, 6, 1, 9, 0, 7 },
              { 5, 2, 1, 9, 1, 2, 1 } };
    }
    
    // four in a up diagonal
    // starting at [0][3]
    public static int[][] test_14() {
        return new int[][]
            { { 0, 3, 1, 6 },
              { 2, 1, 6, 2 },
              { 1, 6, 1, 9 },
              { 6, 1, 9, 0 } };
    }
    
    // four in a up diagonal
    // starting at [1][3]
    public static int[][] test_15() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
              { 5, 6, 2, 5, 6, 2, 9 },
              { 6, 5, 5, 2, 1, 8, 1 },
              { 1, 5, 6, 1, 9, 0, 7 },
              { 5, 2, 1, 9, 1, 2, 1 } };
    }
    
    // four in a up diagonal
    // starting at [0][4]
    public static int[][] test_16() {
        return new int[][]
            { { 0, 1, 0, 3, 1, 6, 1 },
              { 5, 6, 2, 1, 5, 2, 9 },
              { 6, 5, 1, 6, 1, 9, 1 },
              { 1, 1, 6, 1, 9, 0, 7 },
              { 5, 2, 1, 9, 1, 2, 1 } };
    }
    
    // no sequence of four
    public static int[][] test_17() {
        return new int[][]
            { { 1, 1, 6, 3, 1, 6, 1, 0 },
              { 0, 1, 6, 8, 6, 0, 0, 1 },
              { 6, 9, 6, 1, 6, 6, 0, 0 },
              { 1, 3, 9, 1, 1, 0, 1, 1 },
              { 1, 3, 6, 1, 1, 0, 1, 1 } };
    }
}