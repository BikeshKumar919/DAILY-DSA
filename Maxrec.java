import java.util.*;

class Maxrec
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public static int findmax(int a[],int n){
        int res=0,i=1;
        int he=0,p=0;
        Stack<Integer> pos=new Stack<Integer>();
        Stack<Integer> h=new Stack<Integer>();
        pos.push(0);
        for(i=0;i<n;i++){
            if(h.isEmpty()|| a[i]>h.peek()){
                h.push(a[i]);
                pos.push(i);
            }
            else if(a[i]<h.peek()){
                while(!h.isEmpty() && a[i]<h.peek()){
                    he=h.pop();
                    p=pos.pop();
                    res=Math.max(res,he*(i-p));
                }
                pos.push(p);
                h.push(a[i]);
            }
            
        }
        while(!h.isEmpty()){
                 he=h.pop();
                    p=pos.pop();
                    res=Math.max(res,he*(i-p));
            }
            return res;
        }
    
    public int maxArea(int ma[][], int m, int n) {
        // add code here.
        int a[]=new int[n];
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(ma[i][j]==0)
                    a[j]=0;
                else{
                    a[j]=a[j]+ma[i][j];
                }
              }
              res=Math.max(res,findmax(a,n));
              }
              return res;
    }
}