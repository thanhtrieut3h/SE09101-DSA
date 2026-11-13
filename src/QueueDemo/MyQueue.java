package QueueDemo;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
    // viet phuong thuc de tao 1 Queue
    public Queue<String> createQueue(){
        // Queue<String> queue1 = new LinkedList<>(); // cach 1
        Queue<String> queue2 = new ArrayDeque<>(); // cach 2 (su dung nhieu)
        // Queue<String> queue3 = new PriorityQueue<>(); // cach 3
        return queue2;
    }
    // viet phuong thuc them du lieu vao Queue
    public void insertQueue(Queue<String> queue){
        queue.offer("Money");
        queue.offer("Donekey");
        queue.offer("Mouse");
        queue.offer("Cat");
        queue.offer("Dog");
        // print Queue
        System.out.println("My Queue : " + queue);
    }
    // viet phuong thuc xem phan tu o dau Queue
    public String getElementQueue(Queue<String> queue){
        return queue.peek(); // phan se duoc phuc vu tiep theo
    }
    // viet phuong thuc xem phan tu vua ra khoi Queue
    public String getElement(Queue<String> queue){
        return queue.poll();
    }
}
