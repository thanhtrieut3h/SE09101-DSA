//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello and welcome!");
        // bien va kieu du lieu trong java
        // bien ???
        String fullName = "Nguyen Thanh Trieu"; // khai bao 1 bien
        // quy tac dat ten bien :
        // bien khong duoc phep bat dau bang chu so, chi bat dau bang ky _ hoac chu cac cai(abc)
        // ten bien khong duoc trung voi cac tu khoa trong lap trinh : if...else...for...while
        // ten bien phan biet, chu hoa chu thuong
        // tieu chuan : chu cai cua tu dau tien viet thuong, chu cua cac tu tiep theo hoa
        int myAge = 20;

        /******************** Kieu du lieu ****************************/
        // int : so nguyen trung binh : -2 ti den +2 ti : so nguyen co dau (4 byte = 32 bits)
        // long : so nguyen nhieu gia tri (8 byte = 64 bits)
        // short : so nguyen ngan (2 byte = 16 bits)
        // byte : rat be (1 byte = 8 bits)
        //-----------------------------------------------------------------------------------
        // float : 4 byte = 32 bit : so thuc
        float myMoney = 10.10f; // so thuc
        // double : 8 byte = 64 bit : so thuc
        double myPoint = 99.67; // so thuc
        //----------------------------------------------------------------------------------
        char text = 'a'; // kieu ky tu : 2 byte = 16 bit
        // su dung dau nhay '' de bieu dien
        //---------------------------------------------------------------------------------
        boolean checking = true;
        // logic : 1 bit( 0 hoac 1) 0 == false; 1 == true
        //--------------------------------------------------------------------------------
        String myClassName = "SE09101";
        // kieu string su dung dau nhay " "
        //--------------------------------------------------------------------------------
        /****************** CAC CAU TRUC DIEU KHIEN **********************************/
        int yourAge = 20;
        if (yourAge >= 20 ){
            // do something
            System.out.println("Ban da du tuoi truong thanh roi");
        } else {
            System.out.println("Ban con rat tre !");
        }
        int month = 9;
        if (month == 1){
            System.out.println("31 days");
        } else if (month == 2) {
            System.out.println("28 days");
        } else if (month == 9) {
            System.out.println("30 days");
        } else {
            System.out.println("Your month invalid");
        }
        // switch ... case
        switch (month){
            case 1:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Your month invalid");
        }
        /***************** CAC CAU TRUC VONG LAP ********************************/
        // 1 - for
        for(int i = 1; i < 10; i++){
            System.out.println(i);
        }
        for (int j = 9; j > 0; j--){
            if (j % 2 == 0){
                System.out.println(j);
            }
        }
        // in cac so chan tu 1 den 10
        // 2 - while : vong lap kiem tra dieu kien truoc
        int run = 1;
        while (run < 10){
            System.out.println("Gia tri cua run = " + run);
            run++;
        }
        // 3 - do ... while : vong lap kiem tra dieu kien sau
        int running = 1;
        do {
            System.out.println("Gia tri cua run = " + running);
            running++;
        } while (running < 10);

        // a++ vs ++a
        // b-- vs --b
        int a = 10;
        int b = 9;
        int c = (++a) + (++b) + (a--) - (b++) - (--b) + (--a) - (b--);
        // c  =   11  +   10  +   11  -   10  -   10  +   9   -   10;
        System.out.println(c);
        int u = 4;
        int v = 5;
        int k = (u--) + (v--) + (--u) - (++v) - (v++) - (u++) + (--v);
        // 4; =   4   +   5   +   2   -   5   -   5   -   2   +   5
        System.out.println(k);
    }
}