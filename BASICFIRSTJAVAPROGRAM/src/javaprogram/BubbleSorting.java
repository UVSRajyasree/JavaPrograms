package javaprogram;

class Sorting1{
	public static void bubbleSortAscending(int num[], int size) {
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1;j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
	}
	
	public static void bubbleSortDescending(int num[], int size) {
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1;j++) {
				if(num[j]<num[j+1]) {
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
	}
}
public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {5,1,3,8,6};
		System.out.println("Before sort");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		Sorting1.bubbleSortAscending(num, num.length);
		System.out.println();
		System.out.println("After sort in Ascending");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		Sorting1.bubbleSortDescending(num, num.length);
		System.out.println();
		System.out.println("After sort in Descending");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
	}

}
