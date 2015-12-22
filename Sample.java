class Sum1
{
int a,b,c;
void set()
{
a=10;
b=20;
}
void accept()
{
c=a+b;
}
void disp()
{
System.out.println("The value of a is ="+a);
System.out.println("The value of b is ="+b);
System.out.println("The Sum of a+b is ="+c);
}
}
class SumDemo1
{
public static void main(String k[])
{
Sum1 s=new Sum1();
s.set();
s.accept();
s.disp();
}
}