public class ComplexNumber {
	float x1;
	float x2;
	float x3;
	float x4;
	public float getX1() {
		return x1;
	}
	public ComplexNumber() {
	}
	
	public ComplexNumber(float x1, float x2,float x3,float x4) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
	}
	public void Add(){
		float real = x1+x3;
		float ima =  x2+x4;
		System.out.println("两个复数方程相加："+"z1+z2="+real+"+"+"("+ima+")i");
	}
	public void Mul(){
		float real = (x1*x3)-(x2*x4);
		float ima = (x1*x4)+(x2*x3);
		System.out.println("两个复数方程相乘："+" z1*z2= "+real+"+"+"("+ima+")i");
	}
	public void Sub(){
		float real = x1-x3;
		float ima = x2-x4;
		System.out.println("两个复数方程相减："+" z1-z2= "+real+"+"+"("+ima+")i");
	}
	public void Div(){
		float real = (x1*x3-x2*x4)/(x3*x3-x4*x4);
		float ima = (x1*x4+x2*x3)/(x3*x3-x4*x4);
		System.out.println("两个复数方程相除："+" z1÷z2= "+real+"+"+"("+ima+")i");
	}
	
}
