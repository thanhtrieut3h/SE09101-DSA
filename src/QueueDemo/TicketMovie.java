package QueueDemo;

import java.util.ArrayDeque;
import java.util.Queue;

public class TicketMovie {
    public static void main(String[] args){
        Queue<String> customer = new ArrayDeque<>();
        // them khach hang vao hang doi
        System.out.println("=== Bat dau xep hang mua ve =====");
        customer.offer("Huyen Trang");
        customer.offer("Bao Ngoc");
        customer.offer("Thanh Trung");
        customer.offer("Hai Long");
        System.out.println("Hang hien tai : " + customer); // co nhung ai dang doi mua ve

        //1 - Xem nguoi tiep theo chuan bi mua ve(khong xoa khoi hang doi)
        System.out.println("Nguoi sap toi luot mua ve la : " + customer.peek());
        // 2 - Tien hanh ban ve lan luot cho tung nguoi (FIFO)
        System.out.println("==== Tien hanh ban ve ======");
        while (!customer.isEmpty()){
            // phuc vu ban ve
            String cus = customer.poll();// lay ra va xoa khoi Queue
            System.out.println("Da ban ve cho khach hang : " + cus);
        }
        System.out.println("Khong con ai xep hang de mua ve " + customer.isEmpty());
    }
}
