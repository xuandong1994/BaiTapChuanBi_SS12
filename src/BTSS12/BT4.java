package BTSS12;

import java.util.HashMap;

public class BT4 {
    public static void main(String[] args) {
        // Bước 1: Khai báo và khởi tạo HashMap gốc và tạo dữ liệu
        HashMap<String ,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",3);
        hashMap.put("c",5);
        hashMap.put("d",7);
        hashMap.put("e",9);
        hashMap.put("f",2);
        hashMap.put("g",4);
        hashMap.put("t",6);
        // Bước 2: Khai báo một HashMap mới và sao chép dữ liệu từ HashMap gốc vào HashMap mới
        HashMap<String, Integer>   newHashMap = new HashMap<>(hashMap);
        // Bước 3: Kiểm tra xem HashMap mới đã sao chép chính xác tất cả các phần tử từ HashMap gốc hay chưa
            if (newHashMap.equals(hashMap)){
                System.out.println("mảng cũ " + hashMap);
                System.out.println("Mảng mới sao chép " + newHashMap);
            }
    }
}
