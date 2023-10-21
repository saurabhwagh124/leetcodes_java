class onlyonce{

	public static void main(String[] sau){
	
		int arr[] = new int[]{4,2,1,2,1};
		for(int i=0;i<arr.length;i++){
		
			int flag=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
				
					flag++;
					//System.out.println(flag+"flag");
				}
			}
			if(flag==1){
			
				System.out.println(arr[i]);
			}
			//flag=0;
		}
	}
}
