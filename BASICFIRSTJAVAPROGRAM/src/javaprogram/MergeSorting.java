package javaprogram;

class Sorting3{
	public static void merge1(int num[], int start, int mid, int end) {
		int leftSize = mid-start +1;
		int rightSize = end - mid;
		int leftArray[]=new int[leftSize];
		int rightArray[]= new int[rightSize];
		
		for(int i=0;i<leftSize;i++) {
			leftArray[i]=num[start+i];
		}
		
		for(int j=0;j<rightSize;j++) {
			rightArray[j]=num[mid+1+j];
		}
		int i=0,j=0,k=start;
		
		while(i<leftSize && j < rightSize) {
			if(leftArray[i]<=rightArray[j]) {
				num[k]=leftArray[i];
				i++;
			}else {
				num[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<leftSize) {
			num[k]=leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightSize) {
			num[k]=rightArray[j];
			j++;
			k++;
		}
	}
	public static void mergeSortAscending(int num[],int start, int end) {
		if(start < end) {
			int mid = (start+end)/2;
			mergeSortAscending(num, start, mid);
			mergeSortAscending(num, mid+1, end);
			merge1(num,start,mid,end);
		}
	}
	//Descending
	public static void merge(int num[], int start, int mid, int end) {
		int leftSize = mid-start +1;
		int rightSize = end - mid;
		int leftArray[]=new int[leftSize];
		int rightArray[]= new int[rightSize];
		
		for(int i=0;i<leftSize;i++) {
			leftArray[i]=num[start+i];
		}
		
		for(int j=0;j<rightSize;j++) {
			rightArray[j]=num[mid+1+j];
		}
		int i=0,j=0,k=start;
		
		while(i<leftSize && j < rightSize) {
			if(leftArray[i]>=rightArray[j]) {
				num[k]=leftArray[i];
				i++;
			}else {
				num[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<leftSize) {
			num[k]=leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightSize) {
			num[k]=rightArray[j];
			j++;
			k++;
		}
	}
	public static void mergeSortDescending(int num[],int start, int end) {
		if(start < end) {
			int mid = (start+end)/2;
			mergeSortDescending(num, start, mid);
			mergeSortDescending(num, mid+1, end);
			merge(num,start,mid,end);
		}
	}
}
public class MergeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int num[]= {5,1,3,8,6,2,4,9,7,10};
			System.out.println("Before sort");
			for(int i=0;i<num.length;i++) {
				System.out.print(num[i]+" ");
			}
			
			Sorting3.mergeSortAscending(num, 0, num.length-1);
			System.out.println();
			System.out.println("After sort in Ascending");
			for(int i=0;i<num.length;i++) {
				System.out.print(num[i]+" ");
			}		
			
			Sorting3.mergeSortDescending(num, 0, num.length-1);
			System.out.println();
			System.out.println("After sort in Descending");
			for(int i=0;i<num.length;i++) {
				System.out.print(num[i]+" ");
			}		
	}

}
