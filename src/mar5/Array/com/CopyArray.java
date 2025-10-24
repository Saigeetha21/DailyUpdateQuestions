package mar5.Array.com;

public class CopyArray {

	public static void main(String[] args) {
		int sourceArray[] = {1,5,38,10};
		int targetArray[] = new int[sourceArray.length];
		for(int i = 0;i<sourceArray.length;i++) {
			targetArray[i] = sourceArray[i];
			System.out.println("Copy the Array"+targetArray[i]);
		}
	}

}
