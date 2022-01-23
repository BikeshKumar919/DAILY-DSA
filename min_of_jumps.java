           

// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class min_of_jumps
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class Solution{
    static int minJumps(int[] a){
        // your code here
        int n=a.length;
        int max=0,jump=0,halt=0;
        if(n==1)
            return 0;
        if(a[0]==0){
            return -1;
        }
        
        for(int i=0;i<n-1;i++){
            max=Math.max(max,a[i]+i);
            if(max>=n-1){
                jump++;
                return jump;
            }
            if(i==halt){
                halt=max;
                jump++;
                
            }
            
        }
        if(halt>=n-1){
                return jump;
            }
            return -1;
        
    }
}