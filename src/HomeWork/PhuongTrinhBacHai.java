package HomeWork;

public class PhuongTrinhBacHai {
    // doi tuong : ptbh = ax2 + bx + c = 0
    // thuoc tinh : cac he so
    private double a;
    private double b;
    private double c;
    public PhuongTrinhBacHai(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        // gan gia tri nhap tu ban phim cho cac he so
    }
    private String giaiPT(){
        if (a == 0){
            // lai la PTBN
            PhuongTrinhBacNhat pt = new PhuongTrinhBacNhat((int) b,(int) c);
            return pt.showResult();
        }
        // da la PTBH
        double delta = (b*b) - (4*a*c);
        if (delta < 0){
            return "PT vo nghiem";
        }
        if (delta == 0){
            return "PT co nghiem kep x1 = x2 = " + (-b/(2*a));
        }
        double x1 = (-b + Math.sqrt(delta)) / (2*a);
        double x2 = (-b - Math.sqrt(delta)) / (2*a);
        return "PT co 2 nghiem phan biet x1 = " + x1 + " va x2 = " + x2;
    }
    public String showResult(){
        return giaiPT();
    }
}
