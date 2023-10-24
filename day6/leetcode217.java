import java.io.*;
class checkdistinct{

	public static void main(String [] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of array: ");
		int a = Integer.parseInt(br.readLine());
		int arr[] = new int [a];
		System.out.println("Enter Elements: ");
		for (int i=0;i<a;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
		}

		int flag =0;
		for(int j=0;j<a;j++){
		
			int temp = arr[j];
			for(int k=j+1;k<a;k++){
		
				if(arr[j]==arr[k]){
				
					flag=1;
				}
			}
		}
		if(flag==1){
		
			System.out.println("TRUE");
		}
		else{
		
			System.out.println("FALSE");
		}
	}
}
