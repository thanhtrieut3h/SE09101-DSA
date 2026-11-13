package OOPV2;

public class Main {
    public static void main(String[] args){
        Cat tom = new Cat(); // method constructor se chay
        System.out.println(tom.getSound()); // goi phuong thuc ben trong class
        Cat tom2 = new Cat();  // method constructor se chay
        tom2.setAge(3);
        System.out.println(tom2.getAge());

        Dog jex = new Dog("Jex", 5, "Black");
        // truyen tham so vao constructor

    }
}
