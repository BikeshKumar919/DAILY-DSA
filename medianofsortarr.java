class medianofsortarr {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<n1.length;i++){
            l.add(n1[i]);
        }
        for(int i=0;i<n2.length;i++){
            l.add(n2[i]);
        }
        Collections.sort(l);
        int n=l.size();
        int m=n/2;
        if(n%2==1){
            return (double)(l.get(m));
        }
        else{
            return (double)((double)(l.get(m)+(double)l.get(m-1))/2);
        }
    }
}