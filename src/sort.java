import java.util.Arrays;

public class sort {
	public static void main(String[] args) {
		int a[]={42,45,12,34,56,78,89,32,10,58};
		for(int i=1;i<a.length;i++){
			int key=a[i];
			int j;
				for(j=i-1;j>=0&&a[j]>key;j--){
					a[j+1]=a[j];	
			}
				a[j+1]=key;
		}
		System.out.println(Arrays.toString(a));
	}
}
	

