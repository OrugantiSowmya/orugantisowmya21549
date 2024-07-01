import java.util.*;
class String
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
      String s1=s.next();
      String s2[]=s1.toCharArray();
      System.out.println(s1);
       System.out.println(Array.toString(s2));
for(int i=0;i<s2.length();i++)
{
      System.out.println(s2[i]);
    }
  }
}
