public class Chapter08 {
	public static void main(String[] args) {
		int num = 1;
		while (num < 5) {
			int d = num * num;
			System.out.println(d);
			num ++;
		}
		
		int[] array = {1, 8, 15, 22 };
		System.out.println(array.length);
		for (int num2 = 0; num2 < array.length; num2 ++) {
			System.out.println(array[num2]);		
		}
		
		for (int num3 : array) {
			if (num3 % 2 == 0) {
				continue;
			}
			System.out.println(num3);
		}
	}
}