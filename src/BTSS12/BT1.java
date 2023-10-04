package BTSS12;



import java.util.HashMap;

public class BT1 {
    public static void main(String[] args) {
        String[] arr = {"a","b","a","c","d","s","f","a","c","f","h","a","g","h"};
        HashMap<String ,Integer> hashMap = new HashMap<String, Integer>();
        for (String s : arr) {
            if (hashMap.containsKey(s) ){
                hashMap.put(s,hashMap.get(s)+1);
            }else {
                hashMap.put(s,1);
            }
        }
        for (String s : hashMap.keySet()) {
            int string = hashMap.get(s);
            System.out.println("Phần tử "+ s + " xuất hiện " + string + " lần ");

        }
    }
}
