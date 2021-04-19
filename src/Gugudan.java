//2-7
//클래스로 구구단 구현
public class Gugudan {
	public static int[] calculate(int stage) {
		int[] loop = new int[9];

		for (int i=0; i<loop.length; i++) {
			loop[i] = stage * (i+1);
		}
		
		return loop;
	}

	public static void output(int[] num) {
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
