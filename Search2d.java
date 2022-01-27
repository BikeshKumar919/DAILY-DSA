class Search2d {
    public boolean searchMatrix(int[][] m, int t) {
        int r=m.length;
        int c=m[0].length;
        for(int i=0;i<r;i++){
            if(m[i][c-1]>=t){
                if(m[i][c-1]==t){
                    return true;
                }
                
                else{
                    for(int j=0;j<c;j++){
                           if(m[i][j]==t){
                                return true;
                        } 
                    }    
                }
            } 
        
        }
        return false;
    }
}