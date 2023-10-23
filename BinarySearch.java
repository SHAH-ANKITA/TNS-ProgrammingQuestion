package dsa_Problem;
//Binary Search  Tc =o(log n). Ex:- Size is 8  Linear search TC is o(8)   Binary Search TC is o(4)
public class BinarySearch {
  static int BSearch(int[] a,int key) {
	  int s=0;
	  int e=a.length-1;
	  while(s<e) {
		int  mid=(s+e)/2;
		  if(a[mid]==key) {
			  System.out.println(mid);
		  }
		  else if(a[mid]<key) {
			  s=mid+1;
		  }
		  else {
			  e=mid-1;
		  }
	  }
	  return -1;
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {2,3,4,5,6,7};
       int key=6;
       //BSearch(a,key);
       // For Not exist key
       System.out.println(BSearch(a,key));
	}

}
