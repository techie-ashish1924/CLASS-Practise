import java.util.Scanner;

public class Books_Allocation {

    public static boolean IsPossible(int pages[],int mid,int no_students)
    {
        int s1 = 1;
        int read_page = 0;
        int i = 0;
        while(i<pages.length)
        {
            if(read_page + pages[i]  <= mid)
            {
                read_page = read_page + pages[i];
                i++;
               
            }
            else{
                read_page = 0;
                s1++;
            }
            if(s1 > no_students)
            {
                return false;
            }
        }
            
       
       
       
       
        return true;

    }

    public static int Find(int pages[] ,int no_books,int no_students)

    {
        int n = pages.length;
        int low = 0;
        int high = 0;
        for (int i = 0; i < pages.length; i++) {
            high = high + pages[i];
        }
        int ans = 0;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(IsPossible(pages,mid,no_students) == true)
            {
                ans = mid;
                // low = mid + 1;
                high = mid - 1;
            }
            else{
                // high = mid - 1;
                low = mid + 1;
            }
        }
        // System.out.println("bbbbbbbbbbbbbbbbbbbbbbbb");
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t_case = sc.nextInt();

        while(t_case > 0)
        {
            int no_books = sc.nextInt();
            int no_students = sc.nextInt();

            int pages[] = new int[no_books];
            for (int i = 0; i < pages.length; i++) {
                pages[i] = sc.nextInt();
            }

            System.out.println(Find(pages, no_books, no_students));
            t_case--;
        }
    }
    
}
