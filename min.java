class min{
	public static void main(String args[]){
		int arr[]={10,20,30,40,50};
		int min=arr[0];
		int a=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
				a=i;
			}
		}
		System.out.println(minindex);
		System.out.println(min);
		
	}
}