package project;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {

	public static int findLIS(int[] nums){
		if(nums == null|| nums.length == 0) {
			return 0;
		}
		
		int n = nums.length;
		int[] listLengths = new int[n];
		Arrays.fill(listLengths, 1);
		
		//Dynamic Programming
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(nums[i] > nums[j] && listLengths[i] < listLengths[j] + 1) {
					listLengths[i] = listLengths[j] + 1;
				}
			}
		}
		
		//Find Maximum
		int maximumLength = 1;
		for(int i=0; i<n; i++) {
			if(listLengths[i] > maximumLength) {
				maximumLength = listLengths[i];
			}
		}
		return maximumLength;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//Input The Length Of The Array
		System.out.print("Enter the length of the array: ");
		int length = scanner.nextInt();
		
		//Input The Elements Of The Array
		int[] nums = new int[length];
		System.out.print("Enter the Elements of the Array Seperated by Spaces : ");
		for(int i=0; i<length; i++) {
			nums[i] = scanner.nextInt();
		}
		scanner.close();
		
		//Find And Display The Length Of Longest Increasing Subsequence
		int listLength = findLIS(nums);
		System.out.println("Length of the Longest Increasing Subsequence: " + listLength);
	}

}
