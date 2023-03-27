public class Client_HAshMap {



    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();


        map.put("Riya", 90);
        map.put("Nitish", 77);
        map.put("Akash", 67);
        map.put("Zaid", 76);
        map.put("Omika", 88);
        map.put("Puneet", 77);

        System.out.println(map);

        map.put("Omika", 8);
        System.out.println(map);

        System.out.println(map.remove("Omika"));

    }
    
}
