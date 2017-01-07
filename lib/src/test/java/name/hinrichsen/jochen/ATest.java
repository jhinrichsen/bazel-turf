package name.hinrichsen.jochen;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// Bazel requirement
//@org.junit.runner.RunWith
public class ATest {
    @Test
    public void testTwice() {
        assertEquals(4, A.twice(2));
    }
}