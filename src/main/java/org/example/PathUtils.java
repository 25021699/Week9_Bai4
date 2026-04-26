package org.example;

import java.nio.file.Paths;

public class PathUtils {
    public String getConfigPath() {
        // Sử dụng Paths.get để tự động chọn dấu / hoặc \ tùy theo OS
        return Paths.get("config", "settings.txt").toString();
    }
}