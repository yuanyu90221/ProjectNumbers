package yuanyu.demo.main;

import java.util.Scanner;

import yuanyu.demo.model.NumberList;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter test times n= ?");
		int n = Integer.parseInt(in.nextLine());
        for(int i=1;i <= n; i++)
		{
            System.out.println("The "+i +"th test:");
        	System.out.print("total student N = ?");
        	int N = in.nextInt();
        	System.out.print("frequency freq =? ");
        	int freq = in.nextInt();       	
        	//System.out.println("result = "  + findLastNum(N, freq));  
        	System.out.println("result = "  + findLastNumSec(N, freq));
        }
   
	}
		
	public static int findLastNumSec(int total, int freq){
		NumberList nl = new NumberList(total);
		int readyToRemove = 0;
		while(nl.leftSize() > 1){
			nl.echoLeft();
			readyToRemove = (readyToRemove + freq -1)% nl.leftSize();
			nl.removeN(readyToRemove);
		}
		return nl.getLast();
	}
}
