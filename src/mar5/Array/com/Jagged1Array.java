package mar5.Array.com;

public class Jagged1Array {

	public static void main(String[] args) {
		int num[][]= {{1,2,3,4},{4,5},{2,0,8,5}};
		int rowsum=0;
		for(int i =0;i<num.length;i++) {
			for(int j =0;j<num[i].length;j++) {
				rowsum = rowsum+num[i][j];
			}
			System.out.println("The sum is: "+rowsum);
		}
	}

}
