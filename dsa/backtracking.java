
import java.util.ArrayList;
import java.util.Arrays;

public class backtracking {

    public static void main(String[] args) {
        // System.out.println(mazePPArray(3, 3, ""));
        // System.out.println(mazePPArrayDia(3, 3, ""));

        // System.err.println();
        // mazePrintPath(3, 3, "");
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        int[][] path = new int[board.length][board[0].length];
        // mazeWithObstacle(0, 0, "", board);
        // allWays(0, 0, "", board);
        allWaysPrint(0, 0, "", board, path, 1);
        // System.err.println(Arrays.toString(board[2]));
    }

    static int mazePathCount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = mazePathCount(r - 1, c);
        int right = mazePathCount(r, c - 1);
        return left + right;
    }

    static void mazePrintPath(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r >= 1) {
            mazePrintPath(r - 1, c, p + 'd');
        }
        if (c >= 1) {
            mazePrintPath(r, c - 1, p + 'r');
        }

    }

    static ArrayList<String> mazePPArray(int r, int c, String p) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r >= 1) {
            list.addAll(mazePPArray(r - 1, c, p + 'd'));
        }
        if (c >= 1) {
            list.addAll(mazePPArray(r, c - 1, p + 'r'));
        }
        return list;
    }

    static ArrayList<String> mazePPArrayDia(int r, int c, String p) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r >= 1 && c >= 1) {
            list.addAll(mazePPArrayDia(r - 1, c - 1, p + 'd'));
        }
        if (r >= 1) {
            list.addAll(mazePPArrayDia(r - 1, c, p + 'v'));
        }
        if (c >= 1) {
            list.addAll(mazePPArrayDia(r, c - 1, p + 'h'));
        }
        return list;
    }

    static void mazeWithObstacle(int r, int c, String p, boolean[][] maze) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            mazeWithObstacle(r + 1, c, p + 'd', maze);
        }
        if (c < maze[0].length - 1) {
            mazeWithObstacle(r, c + 1, p + 'r', maze);
        }

    }

    static void allWays(int r, int c, String p, boolean[][] maze) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allWays(r + 1, c, p + 'd', maze);

        }
        if (c < maze[0].length - 1) {
            allWays(r, c + 1, p + 'r', maze);
        }
        if (c > 0) {

            allWays(r, c - 1, p + 'l', maze);
        }
        if (r > 0) {

            allWays(r - 1, c, p + 'u', maze);
        }
        maze[r][c] = true;

    }

    static void allWaysPrint(int r, int c, String p, boolean[][] maze, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            for (int[] arr : path) {
                path[r][c] = step;
                System.err.println(Arrays.toString(arr));
            }
            System.err.println();
            System.out.println(p);
            System.err.println();

            return;
        }
        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            allWaysPrint(r + 1, c, p + 'd', maze, path, step + 1);

        }
        if (c < maze[0].length - 1) {
            allWaysPrint(r, c + 1, p + 'r', maze, path, step + 1);
        }
        if (c > 0) {
            allWaysPrint(r, c - 1, p + 'l', maze, path, step + 1);
        }
        if (r > 0) {
            allWaysPrint(r - 1, c, p + 'u', maze, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;

    }
}
