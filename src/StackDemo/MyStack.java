package StackDemo;

import java.util.Stack;

public class MyStack {
    // viet phuong thuc de tao ra 1 stack
    public Stack<String> createStack(){
        Stack<String> stack = new Stack<>(); // tao 1 cai stack
        return stack;
    }
    // viet phuong thuc them phan tu trong Stack
    public void addElement(Stack<String> stack){
        stack.push("Lion");
        stack.push("Tiger");
        stack.push("Cat");
        stack.push("Dog");
        System.out.println("My Stack " + stack);
    }
    // viet phuong thuc lay ra phan tu tren dinh cua stack
    public String getTopElement(Stack<String> stack){
        return stack.peek();// lay phan tu tren dinh cua stack : Dog
    }
    // viet phuong thuc lay phan tu ra khoi stack(xoa)
    public String removeElement(Stack<String> stack){
        return stack.pop(); // xoa phan tu tren dinh : Dog
    }
    // tim kiem phan tu trong stack - tra ve top(vi tri) cua phan tu do
    public int searchElement(Stack<String> stack, String element){
        return stack.search(element);
    }
}
