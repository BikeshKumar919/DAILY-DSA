class Spiral_matrix
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int m[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> l=new ArrayList<Integer>();
        int sr=0;
        int sc=0;
        int er=r-1;
        int ec=c-1;
        while(sr<=er && sc<=ec){
            for(int i=sc;i<=ec;i++){
                l.add(m[sc][i]);
            }
            sr++;
            
            for(int i=sr;i<=er;i++){
                l.add(m[i][ec]);
            }
            ec--;
            if(sr<=er){
               for(int i=ec;i>=sc;i--){
                l.add(m[er][i]);
            } 
            er--;
            }
            if(sc<=ec){
               for(int i=er;i>=sr;i--){
                l.add(m[i][sc]);
            } 
            sc++;
            }
        }
        return l;
    }
}
