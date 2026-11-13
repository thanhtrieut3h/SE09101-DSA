package StackDemo;

import java.util.Stack;

public class ConvertBinaryToTen {
    public static String ConvertToBinary(int number){
        // viet phuong thuc chuyen 1 so he co so 10 sang he nhi phan
        if (number == 0) return  "0";
        // co tinh nhap so 0 khong xu ly
        Stack<Integer> stack = new Stack<>();
        // lay so he co so 10 can chuyen doi chia cho 2 va luu phan du vao trong Stack
        while (number > 0){
            stack.push(number % 2);
            number = number / 2 ;
        }
        // lay phan du da luu trong stack va dao nguoc thu tu lai
        StringBuilder binary = new StringBuilder();
        // gan cac gia tri phan du trong stack vao String builder
        while (!stack.isEmpty()){
            // kiem tra Stack khong duoc rong
            binary.append(stack.pop());
        }
        return binary.toString();
    }
}
