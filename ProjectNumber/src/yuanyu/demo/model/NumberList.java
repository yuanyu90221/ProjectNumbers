package yuanyu.demo.model;

import java.util.ArrayList;
import java.util.List;

public class NumberList {
	
	private List<Integer> leftList;
		
	public NumberList(int number){
		leftList = new ArrayList<Integer>(number);
		for(int i = 1 ; i <= number ;i++){
			leftList.add(i);
		}
	}
	
    public int getLast(){
    	return leftList.get(0);
    }
	public void removeN(int N){
	   leftList.remove(N);
	   echoLeft();
	}
	
	public int leftSize(){
		if(leftList!=null){
			return leftList.size();
		}
		else
			return 0;
	}
	
	public void echoLeft(){
		for(int i : leftList){
			System.out.print(i + ", ");
		}
		System.out.println();
	}
}
