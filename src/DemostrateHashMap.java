import java.util.HashMap;
import java.util.Map;

public class DemostrateHashMap {

    public static void main(String[] args){

        // No need to mention the Generic type twice
//        HashMap<Integer, String> hm1 = new HashMap<>();
//
//        // Initialization of a HashMap using Generics
//        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
//
//        // Adding elements using put method
//        // Custom input elements
//        hm1.put(1, "one");
//        hm1.put(2, "two");
//        hm1.put(3, "three");
//
//        hm2.put(4, "four");
//        hm2.put(5, "five");
//        hm2.put(6, "six");
//
//        // Print and display mapping of HashMap 1
//        System.out.println("Mappings of HashMap hm1 are : " + hm1);
//
//        // Print and display mapping of HashMap 2
//        System.out.println("Mapping of HashMap hm2 are : " + hm2);

//        // No need to mention the
//        // Generic type twice
//        HashMap<Integer, String> hm1 = new HashMap<>(10);
//
//        // Initialization of a HashMap using Generics
//        HashMap<Integer, String> hm2
//                = new HashMap<Integer, String>(2);
//
//        // Adding elements to object of HashMap
//        // using put method
//
//        // HashMap 1
//        hm1.put(1, "one");
//        hm1.put(2, "two");
//        hm1.put(3, "three");
//
//        // HashMap 2
//        hm2.put(4, "four");
//        hm2.put(5, "five");
//        hm2.put(6, "six");
//
//        // Printing elements of ahshMap 1
//        System.out.println("Mappings of HashMap hm1 are : "
//                + hm1);
//
//        // Printing elements of HashMap 2
//        System.out.println("Mapping of HashMap hm2 are : "
//                + hm2);

//        // No need to mention the generic type twice
//        HashMap<Integer, String> hm1
//                = new HashMap<>(5, 0.75f);
//
//        // Initialization of a HashMap using Generics
//        HashMap<Integer, String> hm2
//                = new HashMap<Integer, String>(3, 0.5f);
//
//        // Add Elements using put() method
//        // Custom input elements
//        hm1.put(1, "one");
//        hm1.put(2, "two");
//        hm1.put(3, "three");
//
//        hm2.put(4, "four");
//        hm2.put(5, "five");
//        hm2.put(6, "six");
//
//        // Print and display elements in object of hashMap 1
//        System.out.println("Mappings of HashMap hm1 are : "
//                + hm1);
//
//        // Print and display elements in object of hashMap 1
//        System.out.println("Mapping of HashMap hm2 are : "
//                + hm2);

//        // No need to mention the
//        // Generic type twice
//        Map<Integer, String> hm1 = new HashMap<>();
//
//        // Add Elements using put method
//        hm1.put(1, "one");
//        hm1.put(2, "two");
//        hm1.put(3, "three");
//
//        // Initialization of a HashMap
//        // using Generics
//        HashMap<Integer, String> hm2
//                = new HashMap<Integer, String>(hm1);
//
//        System.out.println("Mappings of HashMap hm1 are : "
//                + hm1);
//
//        System.out.println("Mapping of HashMap hm2 are : "
//                + hm2);


        HashMap<String, Integer> map = new HashMap<>();

        // Add elements using put method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Iterate the map using
        // for-each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    }

}
