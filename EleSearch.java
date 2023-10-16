
public class EleSearch {
public static int search(int a[],int n) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==n) {
			return i+1;
		}
	}
	return -1;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {2,3,4,5,6};
    int n=4;
    int r=search(a,n);
    if(r==-1) {
    	System.out.println("Iteam Not Found  ");
    }
    else {
    	System.out.println("Item Found  ");
    }
	}

}
