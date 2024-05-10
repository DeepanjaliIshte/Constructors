
public class Student 
{
int rno;
String name;
float marks;

Student (int r,String n,float m)
{
	rno=r;
	name=n;
	marks=m;
}
Student (int r,String n)
{
	rno=r;
	name=n;
}
Student (int r)
{
	rno=r;
}
void display1()
{
	System.out.println("Roll No. :- "+rno);
	System.out.println("Name :- "+name);
	System.out.println("Marks :- "+marks);
}
void display2()
{
	System.out.println("Roll No. :- "+rno);
	System.out.println("Name :- "+name);	
}
void display3()
{
	System.out.println("Roll No. :- "+rno);
}
}
