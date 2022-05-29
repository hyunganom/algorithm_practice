package algorithm_practice;

import java.util.ArrayList;

public class SAWsw {
	public int[] solution(int[] arr) {
		int[] answer = new int[0];
		ArrayList<Integer> arrList = new ArrayList();
		int num = 10;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] != num) {
				arrList.add(arr[i]);
				num = arr[i];
			}
		}

		answer = new int[arrList.size()];
		int i;
		for (i = 0; i < answer.length; ++i) {
			answer[i] = (Integer) arrList.get(i);
		}

		return answer;
	}
	public static void main(String args[]) {
        String path = System.getProperty("user.dir");
        System.out.println("현재 작업 경로: " + path);
    }
}



