public class Client {


    public static void main(String[] args)  throws Exception{
        
        Student ob = new Student("Kunal",24);

        System.out.println(ob.getAge());
        System.out.println(ob.getName());

        ob.setAge(-19);
    }
    
}
