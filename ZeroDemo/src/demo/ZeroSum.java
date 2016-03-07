package demo;

public class ZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A[] = {-7, 1, 5, 2, -4 ,3, 0};
        System.out.println(solution(A));
	}

	public static int solution(int []A){
		int result = -1;
		int length = A.length;
		int temp[] = new int[length];
		int sum = 0;	
		for(int i =0; i < length; i++){
			sum += A[i];
			temp[i] = sum;
			
		}
		for(int i =0; i < length; i++){
			if(temp[i]-A[i]== (sum-temp[i])){
				return i;
			}
		}	
		return result;
	}
	
}
