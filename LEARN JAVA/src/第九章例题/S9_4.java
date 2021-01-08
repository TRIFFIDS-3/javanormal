package 第九章例题;

import java.util.Random;

public class S9_4 {

	public static void main(String[] args) {
		Random random1=new Random(1000);//创建种子为1000的random数；
		for(int i=0;i<10;i++) {
			System.out.print(random1.nextInt(100)+" ");
		}

	}

}
