package Factorial;

public class FactorialDemo {
    // xu ly bai toan giai thua
    // cach 1 : khong dung de quy
    public static long tinhGiaiThua(int n){
        // n : so tu nhien nguyen duong
        if (n < 0) {
            return 0;
        }
        if (n == 0 || n == 1){
            return 1;
        }
        long gt = 1;
        for (int i = 1; i <= n; i++){
            gt *= i; // gt = gt * i;
        }
        return gt;
    }
    // cach 2 : su dung De Quy
    public static long tinhGiaiThuaDeQuy(int number){
        // buoc 1 : khu de quy(dung de quy) - cac truong hop suy bien huu han
        if (number == 0 || number == 1) {
            return 1;
        }
        // buoc xu ly de quy : n! = (n-1)! * n
        return number * tinhGiaiThuaDeQuy(number - 1);// goi lai chinh ten ham trong ham -de quy
    }
    // viet ct de quy tinh tong cac so tu 1 den N
    public static long tongCacSoTu1DenN(int n){
        // buoc 1 : khu de quy - dung chuong trinh
        if (n == 1){
            return 1;
        }
        // goi ham de quy
        return n + tongCacSoTu1DenN(n - 1);
    }
    public static double tongCacPhanSo(int n){
        // khu de quy
        if (n == 1) {
            return 1.0;
        }
        // goi ham de quy
        return 1.0/n + tongCacPhanSo(n - 1);
    }
    public static int timUSCLN(int a, int b){
        // b1 : khu de quy
        if (b == 0) {
            return a;
        }
        // b2  - xu ly de quy
        return timUSCLN(b, a % b);
    }
    public static int giaiThuaKep(int n){
        // n!! = (n - 2)!! * n;
        // b1 - khu de quy
        if (n == 1 || n == 0) {
            return 1; // giai thua kep so le
        }
        if (n == 2) {
            return 2; // giai thua kep cua so chan
        }
        // 1!! = 1; 0!! = 1
        // 2!! = 2;
        // 0! = 1; 1! = 1;
        return n * giaiThuaKep(n - 2);
    }
    public static int giaiThuaKepV2(int n){
        // khong su de quy - su dung cac vong lap co ban
        if (n < 0) {
            return 0;
        }
        int gtk = 1;
        // n la chan hay le thi giam 2 don vi
        for (int i = n; i > 0; i -= 2) {
            gtk *= i;
        }
        return gtk;
    }
}
