package algorithm_practice;

import java.util.*;

public class SAWsw {
	static int[] solution(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer i : arr) {
            if(!list.isEmpty() && list.getLast()==i)
                continue;
            list.add(i);
        }
        return list.stream().mapToInt(i->i).toArray();
    }

	
	
	public static void main(String args[]) {
//        String path = System.getProperty("user.dir");
//        System.out.println("°æ·Î: " + path);
		 int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
	        int[] r = solution(arr);
	        for (int i : r)
	            System.out.print(i+" ");    
    }
}



