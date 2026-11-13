package DataLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    // viet phuong thuc tao 1 array list
    public List<String> createArrayList(){
        List<String> myList = new ArrayList<>(); // tao ra dc 1 array list (rong chua co phan tu)
        return  myList;
    }
    // viet phuong thuc(ham - function) them du lieu vao array list
    public void addElement(List<String> myList, String data){
        myList.add(data); // add : them du lieu vao trong array list
        // view array list
        // System.out.println(myList);
    }
    // viet phuong thuc truy cap vao phan tu trong array list
    public void getElement(List<String> myList, int index){
        // can truy vao vi tri cua phan tu
        String element = myList.get(index); // get : lay gia tri phan tu
        System.out.println(element);
    }
    // viet phuong thuc, thay doi gia tri cua phan tu
    public void setDataEmelent(List<String> myList, int index, String data){
        myList.set(index, data);// set : thay doi gia tri phan tu
    }
    // viet phuong thuc xoa phan tu khoi array list
    public void removeEmlement(int index, List<String> mylist){
        mylist.remove(index); // xoa phan tu theo vi tri
    }
    public void removeEmlement(String data, List<String> list){
        list.remove(data); // xoa phan tu theo gia tri
    }
    // kiem tra kich thuoc - dem so luong phan tu
    public int countElement(List<String> myList){
        return myList.size(); // tra ve so luong phan tu
    }
    // kiem tra - tim kiem phan tu co nam trong Array list hay ko ?
    public boolean searchElement(List<String> list, String element){
        return list.contains(element); // true : co tim thay va nguoc lai(false - ko thay)
    }
    // duyet qua cac phan tu trong array list
    public void loopElement(List<String> list){
        for (String item : list){
            System.out.println("value = " + item);
        }
    }
}
