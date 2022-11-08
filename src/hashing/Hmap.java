package hashing;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hmap {
    public static void main(String[] args) {
        //country (key), population (value)
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India",10000000);
        map.put("China",15000000);
        System.out.println(map);

        //get value
        System.out.println(map.get("China"));

        //update
        map.put("China",150);
        System.out.println(map);

        //search
        if(map.containsValue("Shrilanka")){
            System.out.println("Key is present in the map");
        }
        System.out.println("Key is not present in the map");

        //replace
        map.replace("China",150,160);
        System.out.println(map);

        //get value
        System.out.println(map.get("India"));
        System.out.println(map.get("Shrilanka"));

        //iterator for array by two ways
        int arr[] = {1,2,3};
        for (int i=0;i<3; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();


        //iterator for map by two ways
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }
    }
}
