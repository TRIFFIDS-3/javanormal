package 第四周作业;
import java.util.Scanner;
public class S4_7_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] integers = new int[101];
		for(int i=0;i<integers.length;i++)
				integers[i]=0;
		System.out.print("Enter the integers between 1 and 100:");
		while(integers[0]==0) {
			Scanner input=new Scanner(System.in);
			int t=input.nextInt();
			integers[t]++;
			
		}
		for(int j=0;j<integers.length;j++) {
			if(integers[j]==1) {
				System.out.println(j+" occurs "+integers[j]+" time");
			}
			else if(integers[j]>1){
				System.out.println(j+" occurs "+integers[j]+" times");
			}
		}

	}
}
