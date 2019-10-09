import java.util.Scanner;
public class Tx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请依次输入两个复数方程:x1,x2,x3,x4");
		System.out.println("按照实数、虚数顺序输入");
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
		System.out.println("请输入一个数字选择需要输出的对应参数0 退出 1 加法 2 减法 3 乘法 4 除法");
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
