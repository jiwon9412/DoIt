import java.util.Scanner;

public class DoIt_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum=0;
        long []arr = new long[m];
        long result = 0;

        for(int i=1; i<=n; i++){
            sum = (sum + sc.nextInt())%m;
            arr[sum]++;
        }

        result = arr[0];
        for(int i=0; i<m; i++){
            result += (arr[i] * (arr[i]-1))/2;
        }

        System.out.println(result);


    }

}
