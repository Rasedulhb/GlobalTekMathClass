package global.ny.test;

public class MathClass {
	
	void addition () {
		int num1 = 20;
		double num2 = 30.65;
		double num3 = num1 + num2 ;
		//System.out.println("Addition of num1 & num2 is: " + num3);
	}
	
	 double addition2 ()
	{
		int num1 = 20;
		double num2 = 30.65;
		double num3 = num1 + num2 ;
		return num3;
		
	}
	 
	 public int Salary (int salary, int salary2) {
		return salary + salary2;
		 
		 
	 }
	
	
	public static void main(String[] args) {
		
			double num4;
		
		MathClass add = new MathClass();
		add.addition();
		num4 = add.addition2();
		
		System.out.println("Addition of return method: " + num4);
		System.out.println(add.Salary(10000, 9000));
	
	
	}

}
