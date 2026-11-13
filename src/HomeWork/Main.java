package HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("********** Giai PT Bac Nhat **************");
        // cho nguoi dung nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap he so a : ");
        int hsa = scanner.nextInt(); // nhap so tu ban phim
        System.out.println("Moi nhap he so b : ");
        int hsb = scanner.nextInt(); // nhap so tu ban phim

        PhuongTrinhBacNhat ptbn = new PhuongTrinhBacNhat(hsa, hsb);
        // show ket qua
        String result = ptbn.showResult();
        System.out.println(result);

        System.out.println("*********** Giai phuong trinh bac hai *****************");
        System.out.println("Nhap he so a : ");
        double a = scanner.nextDouble();
        System.out.println("Nhap he so b : ");
        double b = scanner.nextDouble();
        System.out.println("Nhap he so c : ");
        double c = scanner.nextDouble();
        PhuongTrinhBacHai ptbh = new PhuongTrinhBacHai(a, b, c);
        System.out.println(ptbh.showResult());
    }
}
