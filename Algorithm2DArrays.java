public class Algorithm2DArrays
{
    /** Return true if target is found at least once in arr; false otherwise.
     *
     *  @param arr  2D array of ints
     *  @param target  target value to be searched for in arr
     *  @return  true if target is found at least once in arr; false otherwise
     */
    public static boolean isFound(int[][] arr, int target)
    {
        boolean output = false;
        for (int[] r : arr)
        {
            for (int c = 0; c < r.length; c++)
            {
                if (r[c] == target)
                {
                    output = true;
                    break;
                }
            }
        }
        return output;
    }

    /** Return the number of elements in arr that contain searchStr as a substring
     *
     *  @param arr  2D array of Strings
     *  @param   searchStr value to be searched for in each String of arr
     *  @return  the number of elements that contain searchStr as a substring
     */
    public static int countElementsWithSubstring(String[][] arr, String searchStr) {
        int counter = 0;
        for (String[] r : arr) {
            for (int c = 0; c < r.length; c++) {
                if ( r[c].indexOf(searchStr) != -1)
                {
                    counter++;
                }
            }
        }
        return counter;
    }


    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
     *
     *  THIS METHOD MODIFIES THE ORIGINAL 2D ARRAY OBJECT!
     *
     *  @param arr  2D array of ints
     */
    public static void replaceEvensWithZero(int[][] arr)
    {
        for (int[] r : arr)
            for (int c = 0; c < r.length; c++)
            {
                if (r[c] % 2 == 0)
                {
                    r[c] = 0;
                }
            }
    }

    /** Return the sum of all elements of arr that are in the one particular row
     *
     *  @param arr  2D array of ints
     *  @param row  the row to add up
     *  @return  the sum of all elements in row
     *
     *  PRECONDITION:  0 <= row < arr.length (i.e. row will not cause out of bounds)
     */
    public static int sumForRow(int[][] arr, int row)
    {
        int sum = 0;
        int[] r = arr[0];
        for (int c = 0; c < r.length; c++)
        {
            sum += arr[row][c];
        }
        return sum;
    }

    /** Return the sum of all elements of arr that are in the one particular column
     *
     *  @param arr  2D array of ints
     *  @param col  the column to add up
     *  @return  the sum of all elements in column
     *
     *  PRECONDITION:  0 <= col < arr[0].length (i.e. col will not cause out of bounds)
     */
    public static int sumForColumn(int[][] arr, int col)
    {
        int sum = 0;
        for (int r = 0; r < arr.length; r++)
        {
            sum += arr[r][col];
        }
        return sum;
    }
}
