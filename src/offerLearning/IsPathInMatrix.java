package offerLearning;

/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。
 * 例如 a b c e s f c s a d e e 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，
 * 但是矩阵中不包含"abcb"路径，
 * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 */
public class IsPathInMatrix {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length != rows * cols
                || str == null || str.length == 0 || str.length > matrix.length) {
            return false;
        }
        boolean[] visited = new boolean[matrix.length];
        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < cols; i++) {
                //k=0充当str的起点
                if (dfs(matrix, rows, cols, str, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[] matrix, int rows, int cols, char[] str, int i, int j, int k, boolean[] visited) {
        if (i < 0 || i >= cols || j < 0 || j >= rows || visited[i + j * cols] || matrix[i + j * cols] != str[k]) {
            return false;
        }
        //跳出判断的条件
        if (k == str.length - 1) {
            return true;
        }
        visited[i+j*cols]=true;
        if (dfs(matrix,rows,cols,str,i,j-1,k+1,visited)
                || dfs(matrix, rows, cols, str, i + 1, j, k + 1, visited)
                || dfs(matrix, rows, cols, str, i, j + 1, k + 1, visited)
                || dfs(matrix, rows, cols, str, i - 1, j, k + 1, visited))
        return true;
        visited[i + j * cols] = false;
        return false;
    }
}
