package p1;

public class LargestNum {
	public static void main(String[] args) {
     int a[]= {10,7,15,28,25};
     int largeNum=a[0];
     int smallNum=a[0];
     
     for(int i=1;i<=4; i++) {
    	 if(a[i]>largeNum) {
    		 largeNum=a[i];
    	 }
    	  else if(a[i]<smallNum) {
    		 smallNum=a[i];
    	 }
    	 
     }
     System.out.println("Largest number "+largeNum);
     System.out.println("smallest number "+smallNum);
	}
}
