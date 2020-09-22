
public class HW2 {
	public static void main(String[] args) {
		int[] numArray = {1, 4, 5, 6, 7, 9, 10, 12, 13, 15, 16, 17, 18, 19, 20};
		
		for(int i = 0; i < numArray.length; i++) {
			if (numArray[i]%2 == 0) {
				System.out.println(numArray[i]);
			}
		}
	}

}
