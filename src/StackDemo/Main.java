package StackDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        MyStack animals = new MyStack();
        var stack = animals.createStack(); // tao dc 1 cai stack
        animals.addElement(stack);
        String topElement = animals.getTopElement(stack);
        System.out.println(topElement); // phan tu tren dinh cua stack (view xem - khong xoa phan tu)
        // duyet Stack
        for (String item : stack){
            System.out.println(item);
        }
        System.out.println(stack);
        String removeEl = animals.removeElement(stack);
        System.out.println(removeEl); // xoa phan tu tren dinh cua stack : Dog
        int search = animals.searchElement(stack, removeEl); // tim kiem phan tu da xoa
        System.out.println(search); // -1 : khong tim thay phan tu

        // chuyen so thap phan 25 sang so nhi phan
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so : ");
        int number = scanner.nextInt();
        String binary = ConvertBinaryToTen.ConvertToBinary(number);
        System.out.println("So nhi phan cua so "+ number +" la : " + binary);
    }
}
