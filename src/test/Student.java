package test;

public class Student {
    private String id;
    private String name;
    private double marks;
    private String ranking;

    // Constructor khởi tạo thông tin sinh viên
    public Student(String id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.ranking = calculateRanking(marks);
    }

    // Phương thức phân loại học lực dựa theo bảng quy định[cite: 1]
    private String calculateRanking(double marks) {
        if (marks >= 0 && marks < 5.0) {
            return "Fail";
        } else if (marks >= 5.0 && marks < 6.5) {
            return "Medium";
        } else if (marks >= 6.5 && marks < 7.5) {
            return "Good";
        } else if (marks >= 7.5 && marks < 9.0) {
            return "Very Good";
        } else if (marks >= 9.0 && marks <= 10.0) {
            return "Excellent";
        }
        return "Invalid";
    }

    // Các phương thức Getter và Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getMarks() { return marks; }
    public void setMarks(double marks) {
        this.marks = marks;
        this.ranking = calculateRanking(marks); // Tự động cập nhật xếp loại khi điểm thay đổi
    }

    public String getRanking() { return ranking; }

    // Ghi đè phương thức toString() để hiển thị thông tin sinh viên đẹp mắt
    @Override
    public String toString() {
        return String.format("ID: %-10s | Họ tên: %-20s | Điểm: %-5.2f | Xếp loại: %-10s",
                id, name, marks, ranking);
    }
}
