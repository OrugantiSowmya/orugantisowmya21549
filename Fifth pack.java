package pack2;
import pack1.First;
class Fifth extends First
{
void show5()
{
First f=new First();
//System.out.println("a="+f.a);
//System.out.println("b="+f.b);
//System.out.println("c="+f.c);
System.out.println("d="+f.d);
}
public static void main(String args[])
{
Fifth f1=new Fifth();
f1.show5();
}
}
