import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ArrTest {

    private final String result = "1, 2, 3, 5, 6, 7";
    List<String> items = Arrays.asList(result.split("\\s*,\\s*"));

    @Test
    public void checkArrSorted() {
        Assert.assertEquals(items, Arr.sortedArr());
    }

    public static void main(String[] args) {
        System.out.println(Arr.sortedArr());
    }
}
