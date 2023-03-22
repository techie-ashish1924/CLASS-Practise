import java.util.HashMap;



public class Demo {
    
    public static void main(String[] args) {
        

        HashMap<String, Integer> map = new HashMap<>();


        // add

        map.put("Riya", 90);
        map.put("Nitish", 77);
        map.put("Aksh", 67);
        map.put("Zaid", 76);

        System.out.println(map);

        // get O(1)

        System.out.println(map.get("Raj"));
        System.out.println(map.get("Riya"));

        // contains O(1)


        System.out.println(map.containsKey("Raju"));
        System.out.println(map.containsKey("Riya"));

        // remove

        System.out.println(map.remove("Faraz"));
        System.out.println("Riya");
    }
}