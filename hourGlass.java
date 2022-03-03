public class hourGlass {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 2, 3, 4, 5},{1, 2, 3, 4, 5, 6},{2, 3, 4, 5, 6, 7},{3, 4, 5, 6, 7, 8}, {4 , 5, 6, 7, 8, 9}, {5 , 6, 7, 8, 9, 9}};//answer should be 28
        int sum = 0;
        int max = 0;
        for (int x = 0; x < 4; x++)
        {
            for (int c = 0; c < 4; c++)
            {
                sum = arr[x][c] + arr[x][c + 1] + arr[x][c + 2] + arr[x + 1][c + 1] + arr[x + 2][c] + arr[x + 2][c + 1] + arr[x + 2][c + 2];
                if (sum > max)
                {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
