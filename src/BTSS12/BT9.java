package BTSS12;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class BT9 {
    /**
     * B1: Khởi tạo TreeMap với Comperator. reverseOrder()
     * B2: thêm các phần tử vào TreeMap
     * B3: in ra các phần tử của treemap
     * */
    public static void main(String[] args) {
        TreeMap<String , Integer> treeMap =new TreeMap<>(Comparator.reverseOrder());
        treeMap.put("a",1);
        treeMap.put("b",2);
        treeMap.put("c",3);
        treeMap.put("d",4);
        treeMap.put("e",5);
        for (String s :treeMap.keySet()) {
            System.out.println(s + " - " + treeMap.get(s));
        }
    }
}
