package �ھ�������;

import java.util.Random;

public class S9_4 {

	public static void main(String[] args) {
		Random random1=new Random(1000);//��������Ϊ1000��random����
		for(int i=0;i<10;i++) {
			System.out.print(random1.nextInt(100)+" ");
		}

	}

}
