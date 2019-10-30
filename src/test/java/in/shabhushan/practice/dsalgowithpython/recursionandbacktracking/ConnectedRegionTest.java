package in.shabhushan.practice.dsalgowithpython.recursionandbacktracking;

import org.junit.Assert;
import org.junit.Test;

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

        Assert.assertEquals(5, ConnectedRegions.getMaxRegion(matrix));
    }
}
