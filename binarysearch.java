import java.util.*;
class binarysearch{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=sc.nextInt();

		int a[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		System.out.println("enter the target value");
		int key=sc.nextInt();

		int lb=0;
		int ub=a.length-1;

		int mid= lb+(ub-lb)/2;

		boolean found=false;
		while(lb<=ub){
			if(a[mid]==key){
				System.out.println("element found"+ mid);
				found=true;
				break;
			}

			else if(a[mid]<key){
				lb=mid+1;
			}
			else{
				ub=mid-1;
			}
			
		}
		if(!found){
			System.out.println("the element is not present");
		}

	}
}