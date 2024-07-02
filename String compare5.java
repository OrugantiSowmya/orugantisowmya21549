import java.util.*;
public class StringComparator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        if (str1.equals(str2)){
            
            System.out.println("Strings are same");
        } 
        else
        {
           System.out.println("Strings are not same"); 
        }
    }
}
