package coreJava;

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = {2, 3, 7, 15, 7};
		int target = 9;
		
		for (int i = 0; i < numbers.length; i++) {
			int j= i+1;
			if (numbers[i]+numbers[j]==target) {
				System.out.println("Output:["+i+","+j+"]");
				break;
			}else {
				System.out.println("in else");
			}	
		}
	}
}
