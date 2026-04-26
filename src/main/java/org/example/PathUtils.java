package org.example;

public class PathUtils {
    public String getConfigPath() {
        // Cố tình dùng dấu \ của Windows để gây lỗi trên Ubuntu/macOS
        return "config" + "\\" + "settings.txt";
    }
}

