package test;

import java.util.ArrayList;
import java.util.Stack;

public class StudentManager {
    // Sử dụng ArrayList để lưu trữ danh sách sinh viên động
    private ArrayList<Student> studentList = new ArrayList<>();

    // Sử dụng Stack (Ngăn xếp) để lưu lịch sử thao tác (Ứng dụng cấu trúc dữ liệu nâng cao)
    private Stack<String> actionHistory = new Stack<>();

    // 1. Thêm sinh viên mới
    public void addStudent(Student student) {
        studentList.add(student);
        actionHistory.push("ADD: " + student.getId());
        System.out.println("-> Thêm sinh viên thành công!");
    }

    // 2. Hiển thị danh sách sinh viên
    public void displayAll() {
        if (studentList.isEmpty()) {
            System.out.println("-> Danh sách sinh viên hiện đang trống!");
            return;
        }
        System.out.println("\n--- DANH SÁCH SINH VIÊN TRONG HỆ THỐNG ---");
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------");
    }

    // 3. Tìm kiếm sinh viên theo ID sử dụng thuật toán Linear Search (Tìm kiếm tuyến tính)
    public Student searchById(String id) {
        for (Student s : studentList) {
            if (s.getId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null; // Không tìm thấy
    }

    // 4. Cập nhật thông tin sinh viên
    public boolean updateStudent(String id, String newName, double newMarks) {
        Student s = searchById(id);
        if (s != null) {
            s.setName(newName);
            s.setMarks(newMarks);
            actionHistory.push("UPDATE: " + id);
            System.out.println("-> Cập nhật thông tin thành công!");
            return true;
        }
        System.out.println("-> Không tìm thấy sinh viên có ID: " + id);
        return false;
    }

    // 5. Xóa sinh viên theo ID
    public boolean deleteStudent(String id) {
        Student s = searchById(id);
        if (s != null) {
            studentList.remove(s);
            actionHistory.push("DELETE: " + id);
            System.out.println("-> Xóa sinh viên thành công!");
            return true;
        }
        System.out.println("-> Không tìm thấy sinh viên để xóa!");
        return false;
    }

    // 6. Thuật toán sắp xếp nổi bọt (Bubble Sort) theo điểm số tăng dần
    public void bubbleSortByMarks() {
        int n = studentList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // So sánh điểm của 2 sinh viên liền kề
                if (studentList.get(j).getMarks() > studentList.get(j + 1).getMarks()) {
                    // Đổi chỗ (Swap)
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j + 1));
                    studentList.set(j + 1, temp);
                }
            }
        }
        System.out.println("-> Đã sắp xếp danh sách thành công theo điểm tăng dần (Bubble Sort)!");
    }

    // 7. Xem lịch sử thao tác gần nhất bằng Stack
    public void showLastAction() {
        if (!actionHistory.isEmpty()) {
            System.out.println("-> Thao tác gần nhất thực hiện trên hệ thống: " + actionHistory.peek());
        } else {
            System.out.println("-> Chưa có thao tác nào được thực hiện.");
        }
    }
}
