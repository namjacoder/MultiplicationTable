//2-8
public class GugudanUpgrade {
	public static void Calculate(int num) {
//		int[] nArr = new int[num];
//		
//		for(int i=0; i<nArr.length; i++) {
//		}
		
		for (int i=2; i<=num; i++) {
			for (int k=1; k<=num; k++) {
				System.out.println(i+"x"+k+" = "+i*k);
			}
		}
	}
}
