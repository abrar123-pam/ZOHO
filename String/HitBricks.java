import java.util.Arrays;

public class HitBricks {

    public static void main(String[] args) {
        int[][] grid = {
            {1, 0, 0, 0},
            {1, 1, 1, 0}
        };

        int[][] hits = {{1, 0}};

        HitBricks hitBricks = new HitBricks();
        int[] result = hitBricks.hitBricks(grid, hits);

        System.out.println("Result: " + Arrays.toString(result));
    }

    public int[] hitBricks(int[][] grid, int[][] hits) {
        int n = grid[0].length;
        int m = hits.length;
        int[] res = new int[m];

        for (int[] hit : hits) {
            int r = hit[0];
            int c = hit[1];
            if (grid[r][c] == 1) grid[r][c] = 0;
            else grid[r][c] = -1;
        }

		for (int j = 0; j < n; j++) {
            getConnectedCount(grid, 0, j);
        }

        for (int i = m - 1; i >= 0; i--) {
            int r = hits[i][0];
            int c = hits[i][1];
            if (grid[r][c] == -1) continue;
            grid[r][c] = 1;
            if (isConnectedToTop(grid, r, c)) {
                res[i] = getConnectedCount(grid, r, c) - 1;
            }
        }

        return res;
    }

    public boolean isConnectedToTop(int[][] grid, int i, int j) {
        if (i == 0) return true;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int[] dir : directions) {
            int nx = i + dir[0];
            int ny = j + dir[1];
            if (nx >= 0 && nx < grid.length && ny >= 0 && ny < grid[0].length && grid[nx][ny] == 2) {
                return true;
            }
        }
        return false;
    }

    public int getConnectedCount(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) return 0;
        int count = 1;
        grid[i][j] = 2;
        count += getConnectedCount(grid, i + 1, j) +
                getConnectedCount(grid, i - 1, j) +
                getConnectedCount(grid, i, j + 1) +
                getConnectedCount(grid, i, j - 1);
        return count;
    }
}
