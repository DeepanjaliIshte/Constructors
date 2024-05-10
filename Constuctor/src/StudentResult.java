 
class StudentResult 
{ 
	public static void main(String args[]) 
	{ 
	 float total1,total2;
	 StudentInfo student1 =new StudentInfo(1,"Ram",49.76f,46.08f);
	 StudentInfo student2 =new StudentInfo(2,"sham",48.99f,44.90f); 
	 total1=student1.Total(); 
	 total2=student2.Total();  
	 student1.displayResult(); 
	 student2.displayResult(); 
 	} 
} 