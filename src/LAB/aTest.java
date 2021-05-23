package LAB;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class aTest {

    @Test(expected=IllegalArgumentException.class)
    public void testSmaller() {
        a.main(0.9);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testBigger() {
        a.main(91);
}