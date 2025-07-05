import java.util.*;
class linearsearch{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elemets");
		int n=sc.nextInt();

		int arr[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0; i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the taregt value");
		int target=sc.nextInt();

		boolean found= false;
		for(int i=0;i<n; i++){
			if(target==arr[i]){
				System.out.println("element found: " + i);
				found = true;
				break;
			}
		}

		if(!found){
			System.out.println("not found");
		}
	}
}