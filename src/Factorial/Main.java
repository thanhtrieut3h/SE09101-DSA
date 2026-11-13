package Factorial;

public class Main {
    public static void main(String[] args){
        int number = 6;
        long result = FactorialDemo.tinhGiaiThua(number);
        System.out.println("Giai thua cua " + number + " = " + result);
        long result2 = FactorialDemo.tinhGiaiThuaDeQuy(number);
        System.out.println("Giai thua cua " + number + " tinh theo de quy = " + result2);
        int myNumber = 100;
        long result3 = FactorialDemo.tongCacSoTu1DenN(myNumber);
        System.out.println("Tong tu 1 den " + myNumber + " = " + result3);
        int mauSo = 4;
        double result4 = FactorialDemo.tongCacPhanSo(mauSo);
        System.out.println("Tong cac phan so tu : 1/" + mauSo + " + ... + 1 = " + result4);
        int a = 84;
        int b = 36;
        int res = FactorialDemo.timUSCLN(a, b);
        System.out.println("USCLN cua " + a + " va " + b + " = " + res);
        int n = 8;
        int r = FactorialDemo.giaiThuaKep(n);
        System.out.println("Giai thua kep cua " + n + "!! = " + r);
        int r2 = FactorialDemo.giaiThuaKepV2(n);
        System.out.println("Giai thua kep khong de quy cua " + n + "!! = " + r2);
    }
}
