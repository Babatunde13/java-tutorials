import java.util.HashMap;
import java.util.Map;

public class HashMapTuto {
    public static void main (String[] args) {
        Map <String, String> map = new HashMap<String, String>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");

        System.out.println(map.get("1"));
        System.out.println(map.get("2"));

        System.out.println("size: " + map.size());
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        
        System.out.println("hashcode: " + map.hashCode());
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("compute key: " + map.compute("6", (k, v) -> v == null ? "six" : v));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
