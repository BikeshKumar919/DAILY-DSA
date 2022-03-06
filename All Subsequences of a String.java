import java.io.*;

class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		sub("abc","",0);
	}
	public static void sub(String in,String out,int index){
	    if(index==in.length()){
	        for (int i=0;i<out.length() ;i++ ){
	            System.out.print(out.charAt(i));
	        } 
	        System.out.println();
	        return;
	    }
	    out+=in.charAt(index);
	    sub(in,out,index+1);
	    out=out.substring(0,out.length()-1);
	    sub(in,out,index+1);
	}
}