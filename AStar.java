import java.util.*;

public class AStar {

    static class Node {
        int x, y;
        int f, g, h;
        Node parent;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static List<Node> aStar(int[][] grid, int startX, int startY, int endX, int endY) {
        int rows = grid.length;
        int cols = grid[0].length;

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.f));
        HashSet<String> visited = new HashSet<>();

        Node startNode = new Node(startX, startY);
        startNode.g = 0;
        startNode.h = heuristic(startNode, endX, endY);
        startNode.f = startNode.g + startNode.h;
        pq.add(startNode);

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            String coord = current.x + "," + current.y;
            if (visited.contains(coord)) continue;
            visited.add(coord);

            if (current.x == endX && current.y == endY) {
                return reconstructPath(current);
            }

            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (newX >= 0 && newX < rows && newY >= 0 && newY < cols && grid[newX][newY] == 0) {
                    Node neighbor = new Node(newX, newY);
                    neighbor.g = current.g + 1;
                    neighbor.h = heuristic(neighbor, endX, endY);
                    neighbor.f = neighbor.g + neighbor.h;
                    neighbor.parent = current;
                    pq.add(neighbor);
                }
            }
        }

        return null; // No path found
    }

    static int heuristic(Node node, int endX, int endY) {
        return Math.abs(node.x - endX) + Math.abs(node.y - endY);
    }

    static List<Node> reconstructPath(Node node) {
        List<Node> path = new ArrayList<>();
        while (node != null) {
            path.add(node);
            node = node.parent;
        }
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 1},
                {0, 1, 0, 0}
        };

        List<Node> path = aStar(grid, 0, 0, 3, 3);

        if (path != null) {
            for (Node node : path) {
                System.out.println("(" + node.x + "," + node.y + ")");
            }
        } else {
            System.out.println("No path found.");
        }
    }
}