class findmissing{

	public static void main(String [] sau){
	
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int flag=0;
		int arr[] = new int[]{0,3,1};
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]>max){
				
				max=arr[i];
			}
		}
		//System.out.println(max);
			
		for(int q=0;q<arr.length;q++){
			if(arr[q]<min){
	
				min=arr[q];
			//	System.out.println(min);
			}
		}
		//System.out.println(min);
		for(int j=min;j<=max;j++){
		
			for(int k=0;k<arr.length;k++){
			
				//System.out.println(arr[k]);
				//System.out.println(j);
				if(j==arr[k]){
				
					flag=1;
					//System.out.println(j);
				}
			}
			if(flag==0){
			
				System.out.println(j);
			}
			flag=0;
		}
	}
}
