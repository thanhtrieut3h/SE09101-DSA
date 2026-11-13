package DataLists;

public class Main {
    public static void main(String[] args){
        ArrayListDemo arrayList = new ArrayListDemo(); // khoi tao doi tuong
        // tao Array List
        var myList = arrayList.createArrayList();
        // them du lieu vao array list
        arrayList.addElement(myList, "Lion"); // 0
        arrayList.addElement(myList, "Tiger"); // 1
        arrayList.addElement(myList, "Cat"); // 2
        arrayList.addElement(myList, "Dog"); // 3
        arrayList.addElement(myList, "Monkey"); //4
        System.out.println(myList); // hien thi array list
        // lay gia tri phan tu trong array list
        arrayList.getElement(myList, 0); // lion
        // cap nhat
        arrayList.setDataEmelent(myList, 1, "Mouse");
        arrayList.setDataEmelent(myList, 3, "Donkey");
        System.out.println(myList);
        // xoa du lieu
        arrayList.removeEmlement(1, myList);
        arrayList.removeEmlement("Donkey", myList);
        System.out.println(myList);
        // kiem tra so luong phan tu
        int count = arrayList.countElement(myList);
        System.out.println("Count element = " + count);
        // tim kiem phan tu
        boolean searched = arrayList.searchElement(myList, "Donkey");
        System.out.println(searched); // true - tim thay / false - khong tim thay
        // duyet array list
        arrayList.loopElement(myList);
    }
}
