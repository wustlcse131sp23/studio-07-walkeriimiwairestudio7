package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width  = width;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double findArea(){
		return this.getWidth() * this.getLength();
	}
	
	public double findPerimeter () {
		return 2*this.getWidth() + 2*this.getLength();
	}
	
	public boolean compareAreas(Rectangle newRectangle) {
		if (this.findArea() < newRectangle.findArea()) {
			return true; 
		}
		else {
			return false;
		}
	}
	
	public boolean square() {
		if (this.getLength() ==this.getWidth()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle trial1= new Rectangle(3,4);
		System.out.println(trial1.square());
		Rectangle trial2= new Rectangle(5,5);
		System.out.println(trial1.compareAreas(trial2));
	}
	
}
