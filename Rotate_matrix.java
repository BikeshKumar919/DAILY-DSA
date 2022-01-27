class Rotate_matrix
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int m[][], int n) 
    { 
        // code here
                for(int i=0;i<n/2;i++){
                    for(int j=i;j<n-i-1;j++){
                        int t=m[i][j];
                        m[i][j]=m[j][n-1-i];
                        m[j][n-1-i]=m[n-1-i][n-1-j];
                        m[n-1-i][n-1-j]=m[n-1-j][i];
                        m[n-1-j][i]=t;
                }
                }
    }
}