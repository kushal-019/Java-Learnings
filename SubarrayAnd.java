import java.util.*;

class SubarrayAnd{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[32]; 
		int n = scanner.nextInt();
		int ans = -1;

		for(int i=0;i<n;i++){
			int ele = scanner.nextInt();
			int index = 0;
			while(ele > 0){
				arr[index] += ele&1;
				ele = ele>>1;
				index++;
                ans = Math.max(ans , arr[index]);
			}
		}

		System.out.println(ans);

        return ;

	}

}