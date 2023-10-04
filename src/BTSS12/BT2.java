package BTSS12;

import java.util.ArrayList;
import java.util.HashMap;

public class BT2 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "a", "c", "d", "s", "f", "a", "c", "f", "h", "a", "g", "h"};
        ArrayList<String> arrayList =new ArrayList<>();
        HashMap<String,Integer> hashMap = new HashMap<>();
        // Bước 2: Đếm số lần xuất hiện và lưu kết quả vào HashMap
        for (String s : arr) {
            if (hashMap.containsKey(s)){
                hashMap.put(s,hashMap.get(s)+1);
            }else {
                hashMap.put(s,1);
            }
        }
        // Bước 3: Lưu trữ các phần tử duy nhất vào một mảng mới
        for (String s: hashMap.keySet()) {
            if (hashMap.get(s) == 1){
                arrayList.add(s);
            }
        }
        // Bước 4: In ra các phần tử duy nhất
        for (String s : arrayList) {
            System.out.println("Phần tử duy nhất: " + s);
        }
    }
}
