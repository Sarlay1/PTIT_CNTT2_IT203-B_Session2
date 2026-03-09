//# Lựa chọn Functional Interface phù hợp
//
//## 1. Kiểm tra xem một User có phải là Admin hay không
//Functional Interface: Predicate<User>
//
//Lý do: Predicate dùng để kiểm tra một điều kiện và trả về giá trị boolean (true/false).
//
//Ví dụ:
//Predicate<User> isAdmin = user -> user.getRole().equals("ADMIN");
//
//---
//
//        ## 2. Chuyển đổi một đối tượng User thành chuỗi String chứa username
//Functional Interface: Function<User, String>
//
//Lý do: Function dùng để chuyển đổi một dữ liệu đầu vào thành một dữ liệu đầu ra khác.
//
//Ví dụ:
//Function<User, String> getUsername = user -> user.getUsername();
//
//---
//
//        ## 3. In thông tin chi tiết của User ra màn hình Console
//Functional Interface: Consumer<User>
//
//Lý do: Consumer dùng khi chỉ thực hiện một hành động với dữ liệu mà không trả về kết quả.
//
//Ví dụ:
//Consumer<User> printUser = user -> System.out.println(user);
//
//---
//
//        ## 4. Khởi tạo một đối tượng User mới với giá trị mặc định
//Functional Interface: Supplier<User>
//
//Lý do: Supplier dùng khi không có đầu vào nhưng trả về một đối tượng.
//
//Ví dụ:
//Supplier<User> createUser = () -> new User();
//
//---
//
//        ## Tổng kết
//
//Kiểm tra điều kiện → Predicate<User>
//Chuyển đổi dữ liệu → Function<User, String>
//Thực hiện hành động → Consumer<User>
//Tạo đối tượng mới → Supplier<User>