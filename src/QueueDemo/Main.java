package QueueDemo;

public class Main {
    public static void main(String[] args){
        MyQueue queue = new MyQueue();
        var animalQueue = queue.createQueue();
        queue.insertQueue(animalQueue);
        String peekEl = queue.getElementQueue(animalQueue);
        System.out.println(peekEl);
        String pollEl = queue.getElement(animalQueue);
        System.out.println(pollEl);
        while (!animalQueue.isEmpty()){
            System.out.println("Dang phuc vu : " + animalQueue.poll());
        }
    }
}
