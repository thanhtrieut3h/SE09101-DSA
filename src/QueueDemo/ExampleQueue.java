package QueueDemo;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args){
        Queue<String> printQueue = new LinkedList<>(); // tao 1 cai Queue
        // nop cac tai lieu can in
        printQueue.offer("Bao-cao-cuoi-ky-mon-DSA-7430.pdf");
        printQueue.offer("Hinh-anh-mo-ta-san-pham.png");
        printQueue.offer("Slide-thuyet-trinh-nhom.pptx");

        System.out.println("Bat dau tien trinh in tai lieu ...");
        int pos = 1;
        while (!printQueue.isEmpty()){
            String document = printQueue.poll(); // can xu ly
            System.out.println("Luot " + pos + " : Dang in file [ " + document + " ] ... hoan thanh!");
            pos++;
        }

    }
}
