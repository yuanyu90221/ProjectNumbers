package yuanyu.demo.model;

import java.util.ArrayList;
import java.util.List;

public class SelfList {
	
	private int leftSize = 1 ;
	
	private int totalSize;
	
	private List<NumberSet> numberList;
	
	private int counterForRemove = 0;
	
	public SelfList(int number){
	   numberList = new ArrayList<NumberSet>();
	   for(int i=1; i <= number; i++){
		   numberList.add(new NumberSet(false,i));
		   setTotalSize(number);
		   setLeftSize(number);
	   }
	   printCurrentAvailable();
	}

	public int getLeftSize() {
		return leftSize;
	}

	public void setLeftSize(int leftSize) {
		this.leftSize = leftSize;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	
	public void removeN(int numberN){
		System.out.println("Removed Value : " + numberList.get(numberN-1));
		numberList.get(numberN-1).setRemoved(true);
	    counterForRemove++;
	    counterForRemove %= totalSize;
		leftSize--;
		printCurrentAvailable();
	}
	
	public void iteration(){
		System.out.println("iteration : ");
		counterForRemove++;
		counterForRemove %= totalSize;
	}
	
	private void printCurrentAvailable(){
		System.out.println("Current LeftSize : " + leftSize);
		System.out.print("Current List : ");
		for(NumberSet num: numberList){
			if(num.isRemoved()!=true){
				System.out.print(num);
			}
		}
		System.out.println("");
	}

    public NumberSet getCurrentNum(){
    	return numberList.get(counterForRemove);
    }
}
