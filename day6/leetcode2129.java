import java.util.*;
import java.io.*;
class capitalize{

	public static void main(String [] sau)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Title/String to capitalize:");
		String str = br.readLine();
		System.out.println(str);
		
		
		StringTokenizer strtok = new StringTokenizer(str," ");
		while(strtok.hasMoreTokens()){
			String token1 = strtok.nextToken();
			char arr[] = token1.toCharArray();
	
			int n = arr.length;
	
			if(n>2){
			
				for(int i=0;i<n;i++){
		
					if(arr[0]>=97&&arr[0]<=122){
					
						arr[0]=(char)(arr[0]-32);
					}
					else if(arr[i]<=90&&arr[i]>=65){
					
						arr[i]=(char)(arr[i]+32);
					}
					else if(arr[i]==' '){
				
					}
					else{
				
						arr[i]=(char)(arr[i]);
					}
				}
			}
			else{
		
				for(int j=0;j<n;j++){
			
					if(arr[j]>=65&&arr[j]<=90){
						arr[j]=(char)(arr[j]+32);
					}

				}
			}

			for(int k=0;k<arr.length;k++){
		
				System.out.print(arr[k]);
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}
