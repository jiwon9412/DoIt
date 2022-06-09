import java.util.Scanner;

public class DoIt_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long max = 0;
		long sum = 0;
		int scores[] = new int [n];
		
		for(int i=0; i<n; i++) {
			
			scores[i] = sc.nextInt();
			sum += scores[i];
			if(scores[i]>max) {
				max = scores[i];
			}
		}
		
		double result = (sum*100.0)/max/n;
		System.out.println(result);

	}

}