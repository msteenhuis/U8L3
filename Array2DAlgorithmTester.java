public class Array2DAlgorithmTester
{
    public static void main(String[] args)
    {
        int[][] testArr4 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 0));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 1));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 2));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 3));
        System.out.println(Algorithm2DArrays.sumForColumn(testArr4, 4));
    }
}

