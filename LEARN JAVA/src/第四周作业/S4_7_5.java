package 第四周作业;

import java.util.Scanner;//Scanner is in the java.util package
public class S4_7_5 {

	public static void main(String[] args) {
		// 输入键盘缓冲区,并获取数字；
		System.out.print("Enter 10 numbers:");
		Scanner input=new Scanner(System.in);
		int number,index=0,flag=0;
		int[] num=new int[10];
		//获取数字并进行重复判断；
		for (int i=0;i<num.length;i++) {
			number=input.nextInt();
			flag=0;
			for(int j=0;j<index;j++) {
				if(num[j]==number) {
					flag=1;
				}
			}
			if(flag==0) {
				num[index]=number;
				index++;
			}
		}
		//输出最后结果；
		System.out.print("The number of distinct number is ");
		System.out.println(index);
		System.out.print("The distinct nummbers are:");
		for(int i=0;i<index;i++) {
			System.out.print(num[i]+" ");
		}

	}

}
