// { Driver Code Starts
    import java.io.*;

    class max_subarr_vimp {
        
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                //size of array
                int n = Integer.parseInt(br.readLine().trim());
                int arr[] = new int[n];
                String inputLine[] = br.readLine().trim().split(" ");
                
                //adding elements
                for(int i=0; i<n; i++){
                    arr[i] = Integer.parseInt(inputLine[i]);
                }
                
                Solution obj = new Solution();
                
                //calling maxSubarraySum() function
                System.out.println(obj.maxSubarraySum(arr, n));
            }
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution{
    
        // arr: input array
        // n: size of array
        //Function to find the sum of contiguous subarray with maximum sum.
        long maxSubarraySum(int a[], int n){
            long min=10;
            int f=1;
            // Your code here
           // ArrayList<Integer> l=new ArrayList<>();
           long cm=0,ms=0;
           for(int i=0;i<n;i++){
               cm=cm+a[i];
               
               if(ms<cm){
                   ms=cm;
               }
               if(cm<0){
                   cm=0;
               }
               if(a[i]<0){
                    if(f==1){
                        min=a[i];
                        f=0;
                    }
                    else{
                        if(a[i]>min){
                            min=a[i];
                        }
                    }
                }
           }
           
            /*for(int i=0;i<n;i++){
                if(a[i]>0){
                    sum+=a[i];
                }
                if(a[i]<0){
                    if(f==1){
                        min=a[i];
                        f=0;
                    }
                    else{
                        if(a[i]<min){
                            min=a[i];
                        }
                    }
                }
                //l.add(a[i]);
            }*/
            if(ms<=0){
                //long t=Collections.min(l);
                return min;
            }
            else 
                return ms;
        }
        
    }