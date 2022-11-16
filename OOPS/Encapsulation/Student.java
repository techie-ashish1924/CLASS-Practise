public class Student {

    private int age;
    String name;

    Student(String name,int age)
    {
        this.age = age;
        this.name = name;

    }
    public int getAge() {
        return age;
    }


    public void setAge(int age)  throws Exception{

        try{


        if(age < 0)
        {
            throw new Exception("Age is not valid");
        }
        this.age = age;
    }

    catch(Exception e){

        // System.out.println(e);

        e.printStackTrace();

    }

    finally{
        System.out.println("I am in finally block");
    }
}


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    

    
}

