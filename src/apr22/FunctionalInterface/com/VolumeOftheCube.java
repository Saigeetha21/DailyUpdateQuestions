package apr22.FunctionalInterface.com;

@FunctionalInterface
interface CubeVolume {
    double calculate(int side);
}
public class VolumeOftheCube {

	public static void main(String[] args) {
		CubeVolume volumeCalculator = side -> Math.pow(side, 3);

        // Using the volumeCalculator operation
        System.out.println("Volume of a cube with side 4: " + volumeCalculator.calculate(4)); // Should print 64.0
        System.out.println("Volume of a cube with side 6: " + volumeCalculator.calculate(6));
		 
	}

}
