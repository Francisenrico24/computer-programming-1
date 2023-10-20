package activity2.java;

public class main {
	public static void main(String[] args) {
		
		
		String name = "Francis Enrico V. Go ";
		int age = 19;
		double Perhr =  500.0;
		
		System.out.println("Name : " + name);
		System.out.println("Age: " + age);
		System.out.println("Per Hour : " + Perhr);
		
		System.out.println("************************************");
		
		Double sss, pag_Ibig, philHealth;
		
		sss = 550.0;
		pag_Ibig = 200.0;
		philHealth = 250.0;
		
		Double deductions = sss + pag_Ibig + philHealth;
		
		int total_Hours = 8;
		
		double total_Payment = Perhr * total_Hours;
		
		System.out.println("Total Hour Render :" + total_Hours);
		
		System.out.println("Total Deduction :" + deductions);
		
		double net = total_Payment - deductions;
		
		System.out.println("Net Salary :" + net );
	
		
	}

}
