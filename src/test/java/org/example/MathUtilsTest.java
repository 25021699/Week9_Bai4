package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    public void testAdd() {
        MathUtils utils = new MathUtils();
        assertEquals(10, utils.add(5, 5), "5 + 5 bang 10");
    }
}
