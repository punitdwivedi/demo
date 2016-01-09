package test.concept.core;


public class JavaIsPassByValue {
public static void main(String[] args) {
	
	PaintBall red = new PaintBall("Red");
	PaintBall blue = new PaintBall("Blue");
	swap(red, blue);
	System.out.println("Color of red :"+red.getColor());
	System.out.println("Color of blue :"+blue.getColor());
	paint(blue);
	System.out.println("Color of blue :"+blue.getColor());
	
}

private static void paint(PaintBall paintBall){
	paintBall.setColor("Red");
	paintBall = new PaintBall("Green");
	paintBall.setColor("Blue");
}

private static void swap(PaintBall o1, PaintBall o2) {
	PaintBall temp = o1;
	o1=o2;
	o2=temp;
	
}


}
