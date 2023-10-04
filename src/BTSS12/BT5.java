package BTSS12;

import java.util.HashMap;

public class BT5 {

        //B1: Khai báo và khởi tạo HashMap với các phần tử bên trong.
        //B2: Sử dụng phương thức containsKey() để kiểm tra xem phần tử đó có tồn tại trong HashMap hay không
        // nếu có trả về true, nếu không trả về false

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",2);
        hashMap.put("c",3);
        hashMap.put("d",4);
        hashMap.put("e",5);
        hashMap.put("f",6);
        hashMap.put("g",7);
          String keyToCheck = "c";
          String keyToCheck2 = "h";
          boolean checkContainsKey = hashMap.containsKey(keyToCheck);
          boolean checkContainsKey2 = hashMap.containsKey(keyToCheck2);

        System.out.println("Phần tử '" + keyToCheck + "'  tồn tại trong HashMap: " + checkContainsKey);
        System.out.println("Phần tử '" + keyToCheck2 + "'  tồn tại trong HashMap: " + checkContainsKey2);

    }
}
