import java.util.Scanner;
public class Tx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����������������������:x1,x2,x3,x4");
		System.out.println("����ʵ��������˳������");
		Scanner x1 = new Scanner(System.in);
		Scanner x2 = new Scanner(System.in);
		Scanner x3 = new Scanner(System.in);
		Scanner x4 = new Scanner(System.in);
		float x5,x6,x7,x8;
		x5 = x1.nextFloat();
		x6 = x2.nextFloat();
		x7 = x3.nextFloat();
		x8 = x4.nextFloat();
		ComplexNumber cn = new ComplexNumber(x5,x6,x7,x8);
		Scanner sig  = new Scanner(System.in);
		System.out.println("������һ������ѡ����Ҫ����Ķ�Ӧ����0 �˳� 1 �ӷ� 2 ���� 3 �˷� 4 ����");
		while(true){
			int sing = sig.nextInt();
			if(sing==1){
				cn.Add();
			}
			if(sing==2){
				cn.Sub();
			}
			if(sing==3){
				cn.Mul();
			}
			if(sing==4){
				cn.Div();
			}
			if(sing==0){
				break;
			}
			
		}
	}

}
