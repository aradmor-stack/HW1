public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        boolean[] visited = new boolean[m.length];
        int result = findShortestPath_rec(m, i, j, visited);
        if (result == Integer.MAX_VALUE) {
            return -1;
        } else {
            return result;
        }
    }

    public static int findShortestPath_rec(int[][] m, int i, int j, boolean[] visited) {
        if (i == j) {
            return 0;
        }
        visited[i] = true;
        int min_dist = Integer.MAX_VALUE;
        for (int k = 0; k < m.length; k++) {
            if (m[i][k] == 1 && !visited[k]) {
                int distK = findShortestPath_rec(m, k, j, visited);
                if (distK != Integer.MAX_VALUE) {
                    min_dist = Math.min(min_dist, 1 + distK);
                }
            }
        }
        visited[i] = false;

        return min_dist;
    }

    public static void main(String[] args) {
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 0, 1)); // -1
        System.out.println(
                findShortestPath(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }, 1, 1)); // 0
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 }, { 1, 0, 0, 0 } }, 0, 2)); // 2
        System.out.println(
                findShortestPath(new int[][] { { 0, 1, 0, 1 }, { 0, 0, 0, 1 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 } }, 0, 2)); // 2
    }
}