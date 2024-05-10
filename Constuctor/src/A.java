
// 1] Write a java program to work with parameterised  constructor & default constructor.


import java.util.Date;
public class A {
int num1,num2,res;
A (int i, int j)				// parameterised constructor
{
	num1=i;
	num2=j;
	Date d = new Date();
	System.out.println(d);
}
void add()
{
	res=num1+num2;
	System.out.println("Sum = "+res);
}
}