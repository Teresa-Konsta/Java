import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Random;

public class LinkedListClass {
	public void main(String[] args) {
	Random randomNum = new Random();
	int[] randomNumArr = new int[100];

	for (int i = 0; i < randomNumArr.length; i++) {
		randomNumArr[i] = randomNum.nextInt(100) + 1;
	}

	List<Integer> randomList = new LinkedList<Integer>();
	for (int i : randomNumArr) {
		randomList.add(i);
	}
	
	Collections.sort(randomList);
	System.out.println(randomList);
	System.out.println(CalculateSum(randomList));
	System.out.println(CalculateAverage(randomList));
}
	
	public static int CalculateSum(List<Integer> newRandomList) {
		int sum = 0;
		for (int i = 0; i < newRandomList.size(); i++) {
			sum += i;
		}
		return sum;
	}

	public static double CalculateAverage(List<Integer> newRandomList) {
		double average = 0;
		int sum = CalculateSum(newRandomList);
		int i = 0;
		while (i < newRandomList.size()) {
			i++;
		}
		average = (sum / i);
		return average;
	}
}