package demo;

import javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction;

import com.sun.corba.se.impl.naming.cosnaming.TransientNameServer;

public class ZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int A[] = {1,5,3,3,7};
//        System.out.println(solution(A));
		
//		Tree t1 = new Tree();
//	    Node root = new Node(3);
//	    Node n2 = new Node(4);
//	    Node n3 = new Node(6);
//	    Node n4 = new Node(8);
//	    Node n5 = new Node(7);
//	    root.setLeftNode(n2);
//	    root.setRightNode(n3);
//	    n2.setLeftNode(n4);
//	    n2.setRightNode(n5);
//	    t1.setCurrent(root);
//	    t1.trasverse();
//	    System.out.println("height = " + t1.getHeight());
//	    System.out.println("solution = " + solution(t1));
//		System.out.println("Binary Gap of " + 9 + " is " + solve(17));
		int A[] = {3,8,9,7,6};
		int result[] = cycle(A, 3);
		for(int i : result){
			System.out.print(i+",");
		}
	}

//	public static int solution(int []A){
//		int result = -1;
//		int length = A.length;
//		double temp[] = new double[length];
//		double sum = 0;	
//		for(int i =0; i < length; i++){
//			sum += A[i];
//			temp[i] = sum;
//			
//		}
//		for(int i =0; i < length; i++){
//			if(temp[i]-A[i]== (sum-temp[i])){
//				return i;
//			}
//		}	
//		return result;
//	}
	
	public static int solution(int a, int b){
		int result = 0;
	    double dB = b;
	    double dA = a;
	    double smallLast = Math.floor(Math.sqrt(dB));
	    double largeLast = Math.ceil(Math.sqrt(dA));
	    result = (int)(smallLast-largeLast+1);
		return result;
	}
	
	public static int solve(int N){
		int result = 0;
		
		double temp = N;
		double twoBase = Math.log(2);
		double appr, beforePow = 0, currentPow = 0, maxDiff = 0, diff =0;
	    double remain = temp;
		while(remain > 0){
			appr =  Math.floor(Math.log(remain)/twoBase);
			currentPow = appr;
			
			
			diff = (beforePow - currentPow-1);
			remain -= Math.pow(2, appr);
			beforePow = appr;

			if(maxDiff < diff)
				maxDiff = diff;
			
	    }
		result = (int)maxDiff;
		return result;
	}
	
	public static boolean solution(int A[]){

		int length = A.length;

		int count = 0;
		for (int i = 0; i < length; i++) {

			for (int j = i + 1; j < length - 1; j++) {
				if (count >= 2) {
					return false;
				} else if ((A[i] > A[j] && A[i] < A[j + 1]) || A[i] > A[length - 1]) {
					int after = j;
					if (A[i] > A[length - 1]) {
						after = length - 1;
					}
					count++;
					swap(A, i, after);
					i--;
				}
			}
		}
		return (count < 2);
	}
	
	public static void swap(int A[],int before,int after){
		int temp = A[before];
		A[before] = A[after];
		A[after] = temp;
	}
	
	public static int solution(Tree t){
		int result =0;
		Node n = t.getCurrent();
		trasverseAccess(n, t);
		return t.getAccessable();
	}
	
	public static void trasverseAccess(Node n,Tree t){
		int before = 0;
		if(n!=null){
			before = n.getValue();
			System.out.println("count = "+ t.getAccessable());
			System.out.println("before = " + before);
			if(n.getLeftNode()!=null){
	        	if(n.getLeftNode().getValue() > before){
	        		System.out.println("leftNode = " + n.getLeftNode().getValue());
	                int count = t.getAccessable();  
	        		t.setAccessable(++count);
	        		System.out.println("left count = "+count);
	        		trasverseAccess(n.getLeftNode(), t);
	        	}
			}
			if(n.getRightNode()!=null){
	        	if(n.getRightNode().getValue() > before){
	        		System.out.println("rightNode = " + n.getRightNode().getValue());
	        		int count = t.getAccessable();
	        		t.setAccessable(++count);
	        		System.out.println("right count = "+count);
	        		trasverseAccess(n.getRightNode(), t);
	        	}
			}
        }
        else{
        	
        	return;
        }
		
		
	}
	

	public static int[] cycle(int A[], int K){
		if(A == null)
			return null;
		if(K >= 1 && A.length > 1){
			int length = A.length;
			int T[] = new int [length];
			int offset = K % length;
			System.out.println(offset);
			for(int i = 0 ; i < length; i++){
			  T[(i+ offset)%length] = A[i];
			}
			
			for(int i=0 ; i < length; i++){
				A[i] = T[i];
			}
		}
		return A;
	}
	
}
