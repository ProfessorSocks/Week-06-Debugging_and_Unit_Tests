import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTestsTests {
    @Test
    public void testMultiply() {
        UnitTests test = new UnitTests();
        int product = test.multiply(2,5);
        assertEquals(product,10);
    }
}
