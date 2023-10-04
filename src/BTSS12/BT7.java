package BTSS12;

import java.util.Map;
import java.util.TreeMap;

public class BT7 {
    /**
     * B1: Khai báo và khởi tạo một mảng các số nguyên.
     * B2: Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng.
     * --Với TreeMap, các phần tử sẽ được sắp xếp theo thứ tự tăng dần của khóa.
     * B3: Sử dụng một vòng lặp để đưa các phần tử của mảng vào TreeMap.
     * --Đối với mỗi phần tử trong mảng, thêm nó vào TreeMap với giá trị là 0.
     * B4: Lấy giá trị của phần tử lớn nhất trong TreeMap.
     * B5: Xóa phần tử lớn nhất khỏi TreeMap.
     * B6: lúc này phần tử lớn nhất trong treemap sẽ là phần tử lớn thư 2 trong mảng ban đầu,
     * --ta dung phương thức lastKey() để lấy nó ra.**/
    public static void main(String[] args) {
        int[] arr = {10,1,5,2,7,6,9};
        TreeMap<Integer, Integer>  treeMap = new TreeMap<>();
        for (Integer element : arr) {
            treeMap.put(element,0);
        }
        Integer maxElement = treeMap.lastKey();
        System.out.println("Phần tử lớn nhất trong mảng " + maxElement);
        Integer deleteMax = treeMap.remove(maxElement);
        Integer maxElement2 = treeMap.lastKey();
        System.out.println("Phần tử lớn thứ 2 trong mảng là "+ maxElement2);

    }
}
