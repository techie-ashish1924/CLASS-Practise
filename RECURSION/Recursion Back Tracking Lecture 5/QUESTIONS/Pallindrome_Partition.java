import java.util.*;

// import org.w3c.dom.traversal.NodeIterator;
public class Pallindrome_Partition {

    public static boolean IsPalindrome(String s)
    {
        int f = 0;
        int l = s.length() - 1;

        while(f <= l)
        {
            if(s.charAt(f) != s.charAt(l))
            {
                return false;
            }
            f++;
            l--;
        }
        return true;
    }

    public static void Partition(String ques, List<String> list,List<List<String>> ans)
    {
        if(ques.length() == 0)
        {
            System.out.println(list);
            ans.add(new ArrayList<String>(list));
            // return;
        }

        for (int i = 1; i <= ques.length(); i++) {
            
            String s = ques.substring(0, i);

            if(IsPalindrome(s))
            {
                list.add(s);
                Partition(ques.substring(1),list, ans);
                list.remove(list.size()-1);
            }
        }
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = "nitin";

        ArrayList<List<String>> ans = new ArrayList<List<String>>();
        ArrayList<String> list = new ArrayList<>();
        Partition(a, list, ans);
        System.out.println(ans);
    }
}
