package DataLists.Models;

public class Student {
    private String id; // ma sinh vien
    private String fullName; // ho ten sinh vien
    private double avgPoint; // diem trung binh

    public Student(String id, String fullName, double avgPoint) {
        this.id = id;
        this.fullName = fullName;
        this.avgPoint = avgPoint;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString(){
        // hien thi thong bao 1 chuoi
        return String.format("ID: %-8s | Full name: %-20s | Point : %.2f", id, fullName, avgPoint);
    }
}
