package OOPV2;

public class Cat extends Animal {
    // constructor method (phuong thuc khoi tao)
    public Cat(){
        // constructor
        // phuong thuc se tu dong chay dau tien khi khoi tao doi tuong cho class
        System.out.println("Constructor of class Cat is running");
    }
    @Override
    public String makeSound() {
        // tinh da hinh
        return "Meow - Meow";
    }
    public String getSound(){
        // return makeSound(); // ? Meow cua class con
        // makeSound : method cua class cha hay con ?
        return super.makeSound(); // class cha
    }
    // setter
    public int setAge(int age){
        return this.age = age;
    }
    // getter
    public int getAge(){
        return this.age;
    }
}
