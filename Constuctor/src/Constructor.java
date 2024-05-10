 class Box {
	double width;
	double hight;
	double depth;
	Box(){
	System.out.println("constructing Box");
	width=10;
	hight=10;
	depth=10;
	
}
double volume() {
return width*hight*depth;
}
}
public class Constructor {
	public static void main(String args []) {
	Box myBox1= new Box();
	Box myBox2= new Box();

double vol;

//get volume first box
vol=myBox1.volume();
System.out.println("Volume is "+vol);

//get volume Second box
vol=myBox2.volume();
System.out.println("Volume is "+vol);


}
}

