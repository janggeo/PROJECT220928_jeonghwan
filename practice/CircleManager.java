package PROJECT220928.practice;
import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void show() {
		System.out.print("("+x+","+y+")"+radius);
	}
	public int getRadius() {
		return radius;
	}
}
public class CircleManager {
	public static void main(String[] args) {
		int temp=0;
		int idx=0;
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle[3];
		for(int i=0; i<3;i++) {
			System.out.print("x,y,radius>>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
			
		}
		for(int i=0; i<3; i++) {
			if(temp<c[i].getRadius()) {
				temp=c[i].getRadius();
				idx=i;
		}
	}
		System.out.print("가장 면적이 큰 원은 ");
		c[idx].show();
		
		scanner.close();
	
	
}
}
