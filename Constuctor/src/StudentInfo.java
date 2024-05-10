
	public class StudentInfo
	{ 
	 int rollno; 
	 String name;
	 float marks1;
	 float marks2;
	 float total; 
	 StudentInfo(int roll_no,String n,float m1,float m2) 
	 { 
	 rollno=roll_no; 
	 name=n;
	 marks1=m1; 
	 marks2=m2; 
	 } 
	 float Total() 
	 { 
	 total = marks1 + marks2; 
	 return total; 
	 } 
	 void displayResult() 
	 { 
	 System.out.println("Roll no of student is " + rollno ); 
	 System.out.println("Name of the Student is "+name);
	 System.out.println("marks1 are " + marks1 ); 
	 System.out.println("marks2 are " + marks2); 
	 System.out.println("total is " + total); 
	 System.out.println("-----------------------------------------");
	 } 
     }

