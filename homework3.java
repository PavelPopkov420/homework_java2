import java.util.Scanner;

public class homework3 {

    public static int unique_Paths(int m, int n) {

        if (n <= 0 || m <= 0) {
            return 0;
        }

        int[][] grid = new int[n][m];

        for (int i = n - 1; i >= 0; --i) {
            for (int j = m - 1; j >= 0; --j) {
                grid[i][j] = get_Paths(grid, i, j);
            }
        }
        return grid[0][0];
    }

    private static int get_Paths(int[][] grid, int i, int j) {
        if (i >= grid.length - 1 || j >= grid[0].length - 1) {
            return 1;
        }
        return grid[i][j + 1] + grid[i + 1][j];
    }

    public static void main(String[] args) {

        Scanner isacn = new Scanner(System.in);
        System.out.println("Введите значение m: ");
        int m = isacn.nextInt();
        System.out.println("Введите значение n: ");
        int n = isacn.nextInt();
        System.out.println("Количество уникальных путей : " + unique_Paths(m, n));
        isacn.close();
    }
}
