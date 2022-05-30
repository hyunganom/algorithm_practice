package algorithm_practice;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		
		
		int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        ArrayList<Integer> r = solution(arr);
        
        
        for (int i : r)
            System.out.print(i);    
		
	}
	 public static ArrayList<Integer> solution(int []arr) {
	        ArrayList<Integer> arrList = new ArrayList<Integer>();
	   
	        
	        //0~9까지 10으로 초기화
	        int num = 10;
	        for(int i=0; i<arr.length; i++) {
	            if(arr[i] != num) {
	            	arrList.add(arr[i]);
	                num = arr[i];
	            }
	        }
	        return arrList;
	    }
	
	
	
}
