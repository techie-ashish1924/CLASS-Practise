package Interface;

public interface StackI extends DSAI,DynamicStackI{

    void push();

    int pop();
    
    public int size();

    default void Sayher()
    {
        System.out.println("Hey");
    }

    public static void Sayhey1()
    {
        System.out.println("Hey1");
    }

    private int fun1()
    {
        return 9;
    }
}
