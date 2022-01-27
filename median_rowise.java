class median_rowise {
    int median(int m[][], int r, int c) {
        // code here   
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                l.add(m[i][j]);
            }
        }
        Collections.sort(l);
        
        int me=(r*c)/2;
        return l.get(me);
    }
}