package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.File;

public class PathUtilsTest {
    @Test
    void testGetConfigPath() {
        PathUtils utils = new PathUtils();
        // File.separator sẽ tự đổi thành / trên Linux hoặc \ trên Windows
        String expected = "config" + File.separator + "settings.txt";
        assertEquals(expected, utils.getConfigPath());
    }
}