        

// { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] a, int n) {
        // code here
        long max=a[0];
        long min=a[0];
        long res=a[0];
        for(int i=1;i<n;i++){
           if(a[i]==0){
               min=1;
               max=1;
           }
           long t1=max*a[i];
           long t2=min*a[i];
           max=Math.max(t1,t2);
           max=Math.max(max,a[i]);
           min=Math.min(t1,t2);
           min=Math.min(min,a[i]);
           res=Math.max(res,max);
        }
        return res;
    }
}