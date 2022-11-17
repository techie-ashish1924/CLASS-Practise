package Inheritance;

public class Client {
    

    public static void main(String[] args) {
        
        // Case 1

 /*        P obj = new P();
        System.out.println(obj.d);   // 1
        System.out.println(obj.d1);  // 10

        // obj.fun1();
        // obj.fun2();


*/
        // CASE 2

/*         P obj = new C();
        System.out.println(obj.d);   // 1
        System.out.println(obj.d1);  // 10

        // System.out.println(obj.d2); // Error generate

        System.out.println(((C) (obj)).d);

        obj.fun();
        obj.fun1();

        ((C) (obj)).fun2();

*/

        // CASE 3

        // C obj = new P();
        // System.out.println(obj.d);
        // System.out.println(obj.d1);
        // System.out.println(obj.d2);


        // CASE 4

        C obj = new C();
        System.out.println(obj.d);   // 2
        System.out.println(obj.d1);  // 10
        System.out.println(obj.d2);  // 20

        System.out.println(((P)(obj)).d);

        obj.fun();
        obj.fun1();
        obj.fun2();



    }
}
