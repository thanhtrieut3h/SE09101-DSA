package Maps;

import java.util.*;

public class MyMap {
    // Key : dịnh danh tên gọi duy nhất(ko trùng nhau) cho phần tử trong Map
    // Value: Giá trị được quản lý bởi các "key", có thể trùng nhau
    //-------------------------------------------------------------------------------
    // HashMap: không đảm bảo thứ tự của các phần tử trong Map khi duyệt
    // HashMap : cho phep 1 "key" duy nhất có gía trị null và nhiều "value" có giá trị
    //--------------------------------------------------------------------------------
    // TreeMap: Không cho phép "key" là null nhưng cho phep "value" là null
    // TreeMap: cho phép sắp xếp các phần tử theo "key" khi duyệt Map
    //--------------------------------------------------------------------------------
    // LinkedHashMap: khi thêm phần tử vào Map muốn giữ đúng thứ tụ thì dùng nó
    // HasgTable : không cho phép cả "key" và "value" là null.
    public static void main(String[] args){
        // 1 - HashMap de trien khai Map
        Map<String, String> captial = new HashMap<>();
        // 1.2 - them du lieu vap hashmap
        captial.put("vn", "Ha Noi");
        captial.put("cn", "Bac Kinh");
        captial.put("fr", "Pari");
        captial.put("ru", "Mat-co-va");
        // co tinh tao trung key
        captial.put("vn", "Tp Ha Noi");// ghi de gia tri len key cu
        System.out.println("Map sau khi tao : " + captial);
        // them gia kiem tra key
        captial.putIfAbsent("us", "Newyork");
        captial.putIfAbsent("kr", "Binh Nhuong");
        // 1.3 - lay ra gia tri
        System.out.println("Thu do cua VN la : " + captial.get("vn"));
        System.out.println("Thu do cua Lao la: " + captial.getOrDefault("lao", "Vien chan")); // trong map chua co "key" nao la "lao"
        // 1.4 - dem so luong phan tu trong map
        System.out.println("So luong Quoc gia trong MAP = " + captial.size());
        // 1.5 - xoa phan tu trong map
        captial.remove("kr"); // xoa theo key
        System.out.println("Map sau khi da xoa bot phan tu : " + captial);
        System.out.println("So luong Quoc gia trong MAP sau khi xoa Trieu Tien = " + captial.size());
        // 1.6 - Duyet Map
        System.out.println("------- Duyet Map ----------");
        for (Map.Entry<String, String> entry : captial.entrySet()) {
            System.out.println("Key -> " + entry.getKey() + " | Value -> " + entry.getValue());
        }

        // 2 - LinkedHashMap
        Map<String, String> shoppingCart = new LinkedHashMap<>();
        shoppingCart.put("Quan", "300k");
        shoppingCart.put("Giay", "950k");
        shoppingCart.put("Ao", "350k");
        shoppingCart.put("Mu", "105k");
        System.out.println("Danh sach SP trong gio hang : " + shoppingCart);
        // giu dung thu tu khi them phan tu vao Map
        shoppingCart.put("Ao", "250k");
        System.out.println("SP trong gio hang da cap nhat : " + shoppingCart);
        // duyet map
        System.out.println("------- Duyet Linked Map ----------");
        for (Map.Entry<String, String> entry : shoppingCart.entrySet()) {
            System.out.println("Key -> " + entry.getKey() + " | Value -> " + entry.getValue());
        }
        // 3 - TreeMap
        TreeMap<String, Integer> scoreBoard = new TreeMap<>();
        // key se duoc tu dong sap xep
        scoreBoard.put("Trieu", 8);
        scoreBoard.put("Bao", 9);
        scoreBoard.put("An", 10);
        scoreBoard.put("Long", 8);
        scoreBoard.put("Yen", 9);
        System.out.println("Diem hoc sinh : " + scoreBoard);
        // lay ra map con trong map cha ban dau
        SortedMap<String, Integer> myFr = scoreBoard.subMap("Long", "Yen");
        System.out.println(myFr); // khong bao gom key "Yen", chi lay gia tri cua key dung truoc "Yen"
    }
}
