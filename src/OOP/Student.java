package OOP;

public class Student {
    // khai bao thuoc tinh cua doi tuong trong class
    // thuoc tinh : dac diem, tinh chat cua doi tuong, thong thuong dc mieu ta thong qua cac danh tu hoac tinh tu
    public String myName = "Thanh Trieu";
    // public : la 1 tu khoa(keyword) mo ta pham vi hoat dong cua thuoc tinh
    // public : cho phep thuoc tinh duoc hoat va su dung o bat ky dau trong project
    protected String phoneNumber = "0975091304";
    // protected : cho phep thuoc tinh chi hoat dong(duoc su dung) noi bo trong class va nhung class ke thua class do. Neu chung 1 package thi van hoat dong ben ngoai class dc
    private  int myMoney = 100;
    // private : chi cho phep thuoc tinh duoc hoat dong(su dung) noi bo trong class. Khong duoc phep su dung o ben ngoai class

    // khai bao phuong thuc cua doi tuong trong class
    // phuong thuc(method) : hanh vi, hanh dong cua doi tuong
    // khi lap trinh thi thuc chat la cac function(ham)
    public String learning(){
        return "Java - OOP";
    }
    protected String copy(){
        return "ASM Final - 7430";
    }
    private String examePoint(){
        return "F";
    }
}
