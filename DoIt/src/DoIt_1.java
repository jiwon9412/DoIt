import java.util.Scanner;

public class DoIt_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String sNum = sc.next();
		char [] aNum = sNum.toCharArray();
		int sum=0;
		
		for(int i=0; i<n; i++) {
			
			sum += aNum[i] - '0';
		}
		
		System.out.println(sum);

	}

}