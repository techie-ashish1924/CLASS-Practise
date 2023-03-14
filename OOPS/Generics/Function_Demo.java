package Generics;

public class Function_Demo {


    public static void main(String[] args) {

        // int arr[] = { 10, 20, 30, 40, 50 };
       
        Integer arr[] = { 10, 20, 30, 40, 50 };
        Display(arr);
        String arr1[] = { "Ram", "Raj", "Riya", "Rahul", "Priya", "Pankaj" };
        Display(arr1);
    }
    
    public static <T>void Display(T arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //

    /* 
    public static void Display(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    */
    
}
