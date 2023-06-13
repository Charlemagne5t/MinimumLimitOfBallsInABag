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
}
