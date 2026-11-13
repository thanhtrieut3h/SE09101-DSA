package HomeWork;

public class PhuongTrinhBacNhat {
    // ax + b = 0
    // khai bao thuoc tinh cua doi tuong
    // doi tuong : phuong trinh bac nhat
    private int hsa;
    private int hsb;
    public PhuongTrinhBacNhat(int a, int b){
        this.hsa = a;
        this.hsb = b;
    }
    private String giaiPT(){
        if (hsa == 0) {
            // 0x + b = 0
            if (hsb == 0){
                // 0x + 0 = 0
                return "PT co vo so nghiem";
            }
            return "PT Vo nghiem";
        }
        return "PT co nghiem : " + (-hsb/hsa);
    }
    public String showResult(){
        return giaiPT();
    }
}
