import java.util.Scanner;
public class Student_demo 
{
	public static void main(String[] args) 
	{
	Scanner sn=new Scanner(System.in);
	System.out.println("Enter the No. of input : ");
	int n=sn.nextInt();
	if(n==3)
	{
	int r1= sn.nextInt();
	String n1=sn.next();
	float m1=sn.nextFloat();
	Student s1=new Student(r1,n1,m1);
	s1.display1();
	}
	else if(n==2)
	{
		System.out.println("Enter Roll No., Name : ");
		int r2= sn.nextInt();
		String n2=sn.next();
		Student s2=new Student(r2,n2);
		s2.display2();
	}
	else if(n==1)
	{
		System.out.println("Enter Roll No.: ");
		int r3= sn.nextInt();
		Student s3=new Student(r3);
		s3.display3();
	}
	else
		System.out.println("Invalid no. of inputs");
		
}
}
