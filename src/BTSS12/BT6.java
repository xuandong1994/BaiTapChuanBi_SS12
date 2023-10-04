package BTSS12;

import java.util.TreeMap;

public class BT6 {
    /**
     * B1: Viết chương trình Java để sắp xếp một mảng các phần tử nguyên theo
     * thứ tự tăng dần và lưu trữ chúng trong TreeMap.
     * B2: Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng.
     * Với TreeMap, các phần tử sẽ được sắp xếp theo thứ tự tăng dần của khóa.
     * B3: Sử dụng một vòng lặp để đưa các phần tử của mảng vào TreeMap.
     * Đối với mỗi phần tử trong mảng, thêm nó vào TreeMap với giá trị là 0.
     * B4: Kiểm tra kết quả bằng cách in ra các phần tử trong TreeMap.
     * Chú ý rằng các phần tử sẽ được in ra theo thứ tự tăng dần của khóa.
     * **/
    public static void main(String[] args) {
        int[] arr = {9,2,8,5,7,6,1};
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer,Integer>();
        for (Integer e : arr) {
            treeMap.put(e,0);
        }
        System.out.println("Các phần tử trong TreeMap");
        for (Integer key : treeMap.keySet()) {
            System.out.println(key);
        }
    }
    
}
