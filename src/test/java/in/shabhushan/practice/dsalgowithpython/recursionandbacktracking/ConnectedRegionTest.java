package in.shabhushan.practice.dsalgowithpython.recursionandbacktracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static in.shabhushan.practice.dsalgowithpython.recursionandbacktracking.ConnectedRegions.Node;
import static in.shabhushan.practice.dsalgowithpython.recursionandbacktracking.ConnectedRegions.NodeUtil;

public class ConnectedRegionTest {
    @Test
    public void testMaxConnectedRegion() {
        Node[][] matrix = NodeUtil.toNodeMatrix(new int[][]{
                new int[]{1, 1, 0, 0, 1},
                new int[]{0, 1, 1, 0, 1},
                new int[]{0, 0, 1, 0, 1},
                new int[]{0, 0, 1, 0, 0},
                new int[]{0, 0, 0, 0, 1},
        });

        List<Node> connectedNodes = NodeUtil.getConnectedNodes(matrix[0][0], matrix, null);

        Assert.assertEquals(6, connectedNodes.size());
        Assert.assertEquals(6, ConnectedRegions.getMaxRegion(matrix));
    }
}
