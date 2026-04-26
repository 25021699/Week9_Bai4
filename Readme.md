# Bài 1: Quản lý Dependency với Maven

1. Giải pháp:
- Cập nhật `pom.xml`: Thêm `logback-classic` (1.4.11) và `hibernate-core` (6.2.0.Final).
- Xóa dependency JUnit 4 cũ và cấu hình `junit-jupiter` (5.9.2) với thẻ `<scope>test</scope>` để biến nó thành công cụ kiểm thử duy nhất.
- Refactor code: Khởi tạo `org.slf4j.Logger` thay thế `System.out.println` và cập nhật import JUnit 5 trong file Test.

2. Lý do:
- Việc đổi sang SLF4J giúp ghi log có cấu trúc.
- Việc loại bỏ JUnit 4 giúp tránh xung đột "multiple bindings" khi build Maven.

