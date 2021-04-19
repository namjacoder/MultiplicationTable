import java.util.ArrayList;
import java.util.Scanner;

public class MultiplicationTable {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//2-1
		//2단, 3단을 계산해 화면에 출력한다.
//		for (int j=2; j<4; j++) {		//j는 앞자리 숫자
//			for (int i=1; i<10; i++){	//i는 뒷자리 숫자
//				System.out.println( j+" x "+i + " = " + j*i);
//			}
//		}
		
		
		//2-2
		//4단, 5단 구현
		//4단은 4곱하기 1계산 결과 값을 i라는 변수에 저장하고, i라는 변수에 저장한 결과 값을 출력한다.
		//사용자가 입력한 숫자 값에 해당하는 단을 출력한다.
		//예를 들어 사용자가 4라는 숫자를 입력하면 4단 전체를 계산해 출력한다.
//		for (int j=4; j<6; j++) {
//			for (int k=1; k<10; k++) {
//				int Multipl = j * k;
//				System.out.println(j+ " x " +k+" = " + Multipl);
//				}
//			}
//		}
		

		//2-2
		//입력받은 숫자의 구구단 출력 
//		System.out.println("구구단으로 출력하고 싶은 숫자 입력 : ");
//		Scanner scanner = new Scanner(System.in);		//입력 대기
//		int inputNumber = scanner.nextInt();			//입력값 리턴
//		
//		//반복 출력
//		for(int j=1; j<10; j++) {
//			System.out.println(inputNumber+" X "+j+" = "+inputNumber * j);
//		}
		
		
		//2-3
		//while 반복문을 사용해서 6, 7단 구현
//		int m = 6;
//		int k = 1;
//
//		while(m<8) {
//			while(k<10) {
//				System.out.println(m+" X "+k+" = "+ m*k);
//				k++;
//			}
//			k = 1;
//			m++;
//		}
		

		//2-4
		//사용자가 2이상, 9이하가 아닌 값을 입력하는 경우 "2이상, 9이하의 값만 입력할 수 있습니다."라는 메시지를 출력한다.
//		System.out.println("숫자를 입력하면 구구단이 출력됨 : ");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		
//		if (num < 1 || num > 9) {
//			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
//			return;
//		}
//		
//		for (int i=1; i<10; i++) {
//			System.out.println(num+" X "+i+ " = "+ num*i);
//		}
		

		//2-5 
		//2단을 구현하기 위해 크기가 9인 배열을 생성한다.
		//for문을 돌면서 구구단 실행 결과를 배열에 저장한다.
		//배열의 크기만큼 for문을 통해 결과를 출력한다.
//		int[][] result = new int[8][9];
//
//		for (int i=0; i<result.length; i++) {
//			for (int k=0; k<result[0].length; k++) {
//				result[i][k] = (i+2)*(k+1);
//			}
//		}
//		
//		for (int i=0; i<result.length; i++) {
//			for (int k=0; k<result[0].length;k++) {
//				System.out.println(result[i][k]);
//			}
//		}
		

		//2-6
		//2-7
		//반복적으로 발생하는 부분을 메소드를 활용해 반복되는 부분을 줄인다.
//		System.out.println("숫자 입력시 구구단 출력");
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		
//		//입력한 숫자의 구구단값을 계산해서 저장.
//		int[] val = Gugudan.calculate(input);
//		
//		//구구단 출력
//		Gugudan.output(val);
		
		
		//2-8 최종 요구사항 1
		//ex) input 8 -> 8x8 까지
		//    input 19-> 19x19 까지
//		System.out.println("입력해라 휴먼 : ");
//		Scanner scanner = new Scanner(System.in);
//		int input = scanner.nextInt();
//		GugudanUpgrade.Calculate(input);
		
		//2-8 최종 요구사항 2
		//ex) "8,7"과 같은 문자열을 입력하면 팔칠단을 구현.
		//    2*1 ... 2*7 ... 3*1 ... 3*7 ... 8*1 ... 8*7
		System.out.println("입력하라 : ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();

		if (input.indexOf(",") == -1) {
			System.out.println("입력 제대로 안하냐");
		}else {
			String[] splited = input.split(",");
		
			int first = Integer.parseInt(splited[0]);
			int second= Integer.parseInt(splited[1]);
			
			for(int i=2; i<=first; i++) {
				for(int k=1; k<=second; k++) {
					System.out.println(i+"X"+k+" = "+i*k);
				}
			}
		}
	}
	
	//2-6
	//보내준 숫자의 구구단을 만든 다음 리턴
//	public static int[] calculate(int stage) {
//		int[] loop = new int[9];
//
//		for (int i=0; i<loop.length; i++) {
//			loop[i] = stage * (1);
//		}
//		
//		return loop;
//	}

	//2-6
	//배열 데이터 받아서 출력
//	public static void output(int[] num) {
//		for (int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
//	}
}
