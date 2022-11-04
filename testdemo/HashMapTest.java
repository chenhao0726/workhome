package testdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("小明","成都");
        hashMap.put("小米","自贡");
        hashMap.put("小李", "泸州");

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        entries.forEach(System.out::println);

        System.out.println("=============");

        for (Map.Entry<String,String> entry: entries) {
            System.out.println(entry.getKey() + "==" + entry.getValue());
        }

        System.out.println("===迭代器====");
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next);
        }

        System.out.println("======拿到key，通过get(key)获取value=======");
        Set<String> strings = hashMap.keySet();
        for (String key: strings) {
            System.out.println(key + "==" + hashMap.get(key));
        }
    }
}
