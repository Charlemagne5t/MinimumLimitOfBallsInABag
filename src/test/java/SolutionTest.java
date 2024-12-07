import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minimumSizeTest1() {
        int[] nums = {9};
        int maxOperations = 2;
        int output = 3;
        Assert.assertEquals(output, new Solution().minimumSize(nums, maxOperations));
    }

    @Test
    public void minimumSizeTest2() {
        int[] nums = {2, 4, 8, 2};
        int maxOperations = 4;
        int output = 2;
        Assert.assertEquals(output, new Solution().minimumSize(nums, maxOperations));
    }

    @Test
    public void minimumSizeTest3() {
        int[] nums = {431,922,158,60,192,14,788,146,788,775,772,792,68,143,376,375,877,516,595,82,56,704,160,403,713,504,67,332,26};
        int maxOperations = 80;
        int output = 129;
        Assert.assertEquals(output, new Solution().minimumSize(nums, maxOperations));
    }
}
