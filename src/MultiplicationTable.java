
public class MultiplicationTable {
	public static void main(String[] args) {
		
		//2단, 3단을 계산해 화면에 출력한다.
		for (int j=2; j<4; j++) {		//j는 앞자리 숫자
			for (int i=1; i<10; i++){	//i는 뒷자리 숫자
				System.out.println( j+" x "+i + "= " + j*i);
			}
		}
	}
}
