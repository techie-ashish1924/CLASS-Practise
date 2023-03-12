package Interface;

public interface DSAI {

    public void display();

    public boolean isfull();

    default void Sayhey()
    {
        System.out.println("Hey");
    }
    
}
