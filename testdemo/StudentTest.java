package testdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StudentTest {

    public static void main(String[] args) {
        // 创建HashMap对象
        TreeMap<Student, String> stuHashMap = new TreeMap<>();

        stuHashMap.put(new Student("zs",23),"成都");
        stuHashMap.put(new Student("zs",23),"南昌");
        stuHashMap.put(new Student("zw",25),"广州");
        stuHashMap.put(new Student("xi",24),"北京");


        Set<Map.Entry<Student, String>> entries = stuHashMap.entrySet();
        entries.forEach(System.out::println);
    }
}
