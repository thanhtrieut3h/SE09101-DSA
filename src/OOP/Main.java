package OOP;

public class Main {
    public static void main(String[] args){
        // khoi tao doi tuong thuoc class sinh vien
        Student svIT = new Student(); // doi tuong sv cntt thuoc class SV
        Student svQTKD = new Student(); // doi tuong sv QTKD
        Student svTKDH = new Student();
        // co 3 doi tuong khac nhau thuoc class Student
        // tu khoa "new" de khoi tao doi tuong moi.

        // truy cap thuoc tinh va phuong thuc cua doi tuong
        String name = svIT.myName; // lay ra gia tri cua thuoc tinh
        System.out.println(name); // myName la public
        System.out.println(svTKDH.phoneNumber); // chung 1 packgae
        // System.out.println(svQTKD.myMoney); // Error - vi private

        System.out.println(svQTKD.learning()); // public
        System.out.println(svQTKD.copy()); // protected - chung 1 package
        // svQTKD.examePoint(); // Error - private

        ITStudent it = new ITStudent();
        System.out.println(it.getPhoneNumber("32131231"));
        System.out.println(it.multiplyNumber(10,21));
    }
}
