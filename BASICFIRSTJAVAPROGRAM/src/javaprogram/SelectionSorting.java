package javaprogram;

class Sorting{
	public static void selectionSortAscending(int num[], int size) {
		for(int i=0;i<size-1;i++) {
			int min=i;
				for(int j=i+1;j<size;j++) {
					if(num[j]<num[min]) {
						min=j;
					}
				}	
		int temp = num[i];
		num[i]=num[min];
		num[min]=temp;
		}
	}
	public static void selectionSortDescending(int num[], int size) {
		for(int i=0;i<size-1;i++) {
			int max=i;
				for(int j=i+1;j<size;j++) {
					if(num[j]>num[max]) {
						max=j;
					}
				}	
		int temp = num[i];
		num[i]=num[max];
		num[max]=temp;
		}
	}
}
public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {5,1,3,8,6};
		System.out.println("Before sort");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		Sorting.selectionSortAscending(num, num.length);
		System.out.println();
		System.out.println("After sort in Ascending");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		Sorting.selectionSortDescending(num, num.length);
		System.out.println();
		System.out.println("After sort in Descending");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}

}
