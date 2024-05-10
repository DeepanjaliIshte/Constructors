
public class Student_Data {
	class StudentInfo 
	 { 
	 int rollno; 
	 int marks1; 
	 int marks2; 
	 int total; 

	 StudentInfo() //no-arg constructor 
	 { 
	 rollno=2; 
	 marks1=30; 
	 marks2=40; 
	 } 
	 //method to calculate total 
	 int Total() 
	 { 
	 total = marks1 + marks2; 
	 return total; 
	 } 
	 //method to display the result 
	 void displayResult() 
	 { 
	 System.out.println("Roll no of student is" + rollno ); 
	 System.out.println("marks1 are" + marks1 ); 
	 System.out.println("marks2 are" + marks2); 
	 System.out.println("total is" + total); 
	 } 
	 } 
}
