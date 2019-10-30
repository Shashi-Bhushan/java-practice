package in.shabhushan.practice.dsalgowithpython.recursionandbacktracking;

import java.util.*;

class Node {
    private int row;
    private int column;
    private int value;

    public Node(int row, int column, int value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node[] getSameValueNeighbours(Node[][] matrix) {
        List<Node> nodes = new ArrayList<>();

        int row = this.getRow();
        int column = this.getColumn();

        // Left bound check
        if(row - 1 >= 0) {
            nodes.add(matrix[row-1][column]);
        }

        return nodes.toArray(new Node[0]);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return getRow() == node.getRow() &&
                getColumn() == node.getColumn() &&
                getValue() == node.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRow(), getColumn(), getValue());
    }

    @Override
    public String toString() {
        return "Node{" +
                "row=" + row +
                ", column=" + column +
                ", value=" + value +
                '}';
    }
}

class NodeUtil {
    public static Node[][] toNodeMatrix(int[][] matrix) {
        Node[][] nodeMatrix = new Node[matrix.length][];

        for (int row = 0; row < matrix.length; row++) {
            nodeMatrix[row] = new Node[matrix[row].length];

            for (int column = 0; column < matrix[row].length; column++) {
                nodeMatrix[row][column] = new Node(row, column, matrix[row][column]);
            }
        }

        return nodeMatrix;
    }

    public static List<Node> getConnectedNodes(Node node, Node[][] matrix, Set<Node> visitedMatrix) {
        List<Node> nodes = new ArrayList<>();

        if(null == visitedMatrix) {
            visitedMatrix = new HashSet<>();
        }

        Node[] neighbours = node.getSameValueNeighbours(matrix);

        for(Node neighbour: neighbours) {
            if(!visitedMatrix.contains(neighbour)) {
                visitedMatrix.add(neighbour);

                nodes.add(neighbour);

                nodes.addAll(getConnectedNodes(neighbour, matrix, visitedMatrix));
            }
        }

        return nodes;
    }
}

public class ConnectedRegions {
    public static int getMaxRegion(Node[][] matrix) {
        int max = 0;

        for(Node[] row: matrix) {
            for(Node node: row) {
                if(node.getValue() != 0) {
                    List<Node> nodes = NodeUtil.getConnectedNodes(node, matrix, null);

                    nodes.add(node);

                    if(max < nodes.size()) {
                        max = nodes.size();
                    }
                }
            }
        }

        return max;
    }
}
