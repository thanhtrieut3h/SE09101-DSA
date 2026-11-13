package DataLists;

import DataLists.Models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    public static void showStudentList(List<Student> list){
        if (list.isEmpty()){
            System.out.println("Danh sach sinh vien trong");
            return;
        }
        for (Student st : list){
            System.out.println(st);
        }
    }
    public static Student searchStudent(List<Student> list, String idStudent){
        for (Student st : list) {
            if (st.getId().equalsIgnoreCase(idStudent)){
                return st;
            }
        }
        return null;
    }

    public static void main(String[] args){
        // khai bao Array List chua cac doi tuong la sinh vien
        List<Student> studentList = new ArrayList<>();
        // 1 - Them sinh vien vao danh sach
        studentList.add(new Student("BH001", "Nguyen Van A", 8.5));
        studentList.add(new Student("BH002", "Tran Thi B", 6.8));
        studentList.add(new Student("BH003", "Le Van C", 9.2));
        studentList.add(new Student("BH004", "Pham Hoang D", 7.4));
        // 2 - Hien thi thong tin sinh vien
        System.out.println("========== Danh Sach Sinh Vien ===========");
        showStudentList(studentList);
        // 3 - tim kiem sinh vien
        System.out.println("========== Tim Kiem Sinh vien ============");
        System.out.println("Moi nhap ma sinh vien : ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next(); //string
        Student search = searchStudent(studentList, id);
        if (search != null) {
            System.out.println("Tim thay sinh vien : " + search);
        } else {
            System.out.println("Khong co sinh nao co ma = " + id);
        }
        // 4 - loc danh sach sinh vien theo thang diem
        System.out.println("============= Loc Danh sach sinh vien theo diem TB ================");
        System.out.println("Moi nhap so diem de loc sinh vien : ");
        double point = scanner.nextDouble(); // loc ra sinh vien co diem cao hon hoac bang diem nhap
        List<Student> filterStudent = new ArrayList<>();
        for (Student st : studentList) {
            if (st.getAvgPoint() >= point) {
                filterStudent.add(st);
            }
        }
        showStudentList(filterStudent);

    }
}
