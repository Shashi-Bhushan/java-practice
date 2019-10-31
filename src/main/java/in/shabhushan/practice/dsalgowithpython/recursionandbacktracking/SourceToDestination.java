package in.shabhushan.practice.dsalgowithpython.recursionandbacktracking;

import java.util.Objects;

public class SourceToDestination {
    public static class Node {
        private int row;
        private int column;
        private int value;

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

        public Node[] getSameValueNeighbour(Node[][] matrix) {
            return null;
        }
    }
}
