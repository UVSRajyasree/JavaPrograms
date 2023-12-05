package javaprogram;

class Sorting2{
	public static void insertionSortAscending(int num[], int size) {
		for(int i=1;i<size;i++) {
			int key = num[i];
			int j=i-1;
			while(j>=0 && key < num[j]) {
				num[j+1]=num[j];
				j--;
			}
			num[j+1]=key;
		}
	}
	public static void insertionSortDescending(int num[], int size) {
		for(int i=1;i<size;i++) {
			int key = num[i];
			int j=i-1;
			while(j>=0 && key > num[j]) {
				num[j+1]=num[j];
				j--;
			}
			num[j+1]=key;
		}
	}
	
}
public class InsertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {5,1,3,8,6,2,4,9,7,10};
		System.out.println("Before sort");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		Sorting2.insertionSortAscending(num, num.length);
		System.out.println();
		System.out.println("After sort in Ascending");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		Sorting2.insertionSortDescending(num, num.length);
		System.out.println();
		System.out.println("After sort in Descending");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
