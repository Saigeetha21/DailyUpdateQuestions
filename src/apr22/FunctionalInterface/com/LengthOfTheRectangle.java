package apr22.FunctionalInterface.com;

@FunctionalInterface
interface RectangleArea{
	double calculate(int length,int width);
}

public class LengthOfTheRectangle {

	public static void main(String[] args) {
		RectangleArea area = (length, width) ->length*width;
		System.out.println("Area of the rectangle" +area.calculate(3, 4));
		System.out.println("Area of the rectangle"+area.calculate(33,21));
		
		 

	}

}
