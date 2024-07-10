package pack1;
public class First
{
private int a=100;
int b=200;
protected int c=300;
public int d=400;

void show1()
{
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("c="+c);
System.out.println("d="+d);
}
public static void main(String args[])
{
First f1=new First();
f1.show1();
}
}

