package BTSS12;

import java.util.Map;
import java.util.TreeMap;

public class BT8 {
    /**
     * B1: Khai báo và khởi tạo một đối tượng TreeMap.
     * B2: Đưa các phần tử vào TreeMap.
     * B3: Lấy giá trị của phần tử nhỏ nhất trong TreeMap bằng cách
     * sử dụng phương thức firstEntry() của đối tượng TreeMap.
     * ***/
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1,"một");
        treeMap.put(2,"hai");
        treeMap.put(3,"ba");
        treeMap.put(4,"bốn");
        treeMap.put(5,"năm");
        treeMap.put(6,"sáu");

        Map.Entry<Integer, String> entry = treeMap.firstEntry();

        System.out.println("Phần tử nhỏ nhất là : " + entry.getKey());
        System.out.println("Phần tử nhỏ nhất là : " + entry.getValue());
    }
}
