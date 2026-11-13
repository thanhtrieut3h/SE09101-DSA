package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n===== HỆ THỐNG QUẢN LÝ SINH VIÊN - SOFT DEVELOPMENT ABK =====");
            System.out.println("1. Thêm sinh viên mới");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo ID");
            System.out.println("4. Cập nhật thông tin sinh viên");
            System.out.println("5. Xóa sinh viên theo ID");
            System.out.println("6. Sắp xếp sinh viên theo điểm tăng dần (Bubble Sort)");
            System.out.println("7. Xem lịch sử thao tác gần nhất (Stack)");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng (0-7): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập số hợp lệ: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự xuống dòng

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID sinh viên: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập họ tên sinh viên: ");
                    String name = scanner.nextLine();
                    double marks = -1;
                    while (true) {
                        System.out.print("Nhập điểm sinh viên (0.0 - 10.0): ");
                        if (scanner.hasNextDouble()) {
                            marks = scanner.nextDouble();
                            if (marks >= 0.0 && marks <= 10.0) break;
                        } else {
                            scanner.next();
                        }
                        System.out.println("Điểm không hợp lệ! Vui lòng nhập lại từ 0.0 đến 10.0.");
                    }
                    scanner.nextLine();
                    manager.addStudent(new Student(id, name, marks));
                    break;

                case 2:
                    manager.displayAll();
                    break;

                case 3:
                    System.out.print("Nhập ID sinh viên cần tìm: ");
                    String searchId = scanner.nextLine();
                    Student found = manager.searchById(searchId);
                    if (found != null) {
                        System.out.println("-> Tìm thấy: " + found);
                    } else {
                        System.out.println("-> Không tìm thấy sinh viên có ID: " + searchId);
                    }
                    break;

                case 4:
                    System.out.print("Nhập ID sinh viên cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập điểm mới: ");
                    double newMarks = scanner.nextDouble();
                    scanner.nextLine();
                    manager.updateStudent(updateId, newName, newMarks);
                    break;

                case 5:
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteStudent(deleteId);
                    break;

                case 6:
                    manager.bubbleSortByMarks();
                    manager.displayAll();
                    break;

                case 7:
                    manager.showLastAction();
                    break;

                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng hệ thống của Soft Development ABK!");
                    break;

                default:
                    System.out.println("Chức năng không hợp lệ! Vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
