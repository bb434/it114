public class recursion {
  
	public static int sum(int num) {
		int result = 0;
		for(int i= num; i >= 0; i--) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(sum(10));
	}
}