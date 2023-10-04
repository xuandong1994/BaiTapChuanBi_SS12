package BTSS12;

import java.util.*;

public class BT3 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        hashMap.put("d", 4);
        hashMap.put("e", 5);
        hashMap.put("f", 6);
        //B2: Tạo một danh sách các cặp key-value từ HashMap
        List<Map.Entry<String,Integer>> list =new ArrayList<>(hashMap.entrySet());
       // B3: Sử dụng phương thức Collections.sort() để sắp xếp danh sách các phần tử theo giá trị tăng dần của chúng.
        Collections.sort(list,(Comparator.comparing(Map.Entry::getValue)));
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " - " + entry.getValue());

        }
    }
}
