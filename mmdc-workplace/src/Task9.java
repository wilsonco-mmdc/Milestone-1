
import java.util.Scanner;
public class Task9 {

	 // https://www.sss.gov.ph/sss/DownloadContent?fileName=2023-Schedule-of-Contributions.pdf 
	// basis for the calculation of SSS
	// For conveniency purpose i did not include all of the range of compensation
	
	public static double calculateSss(double salary) {
		double sssValue = 0;
		if(salary <= 10000)
		{
			sssValue = 450;
		}
		else if (salary <=15000 && salary > 12500 ) {
			sssValue = 550;
		}
		else if (salary <=17500 && salary >15000) {
			sssValue = 750;
		}
		else if (salary <=20000 && salary >17500) {
			sssValue = 900;
		}
		else if (salary <=22500 && salary >20000) {
			sssValue = 950;
		}
		else if (salary <=25000 && salary >22500) {
			sssValue = 1050;
		}
		else if (salary <=27500 && salary >25000)
		{
			sssValue = 1150;
		}
		else if (salary <=30000 && salary >27500) {
			sssValue = 1250;
		}
		else if (salary >30000)
		{
			sssValue = 1350;
		}
		return sssValue;
	}
	
	public static double calculatePhilhealth(double salary) {
		double philhealth = (salary*0.045)/2;
		return philhealth;
	}
	
	//https://cloudcfo.ph/blog/taxes/withholding-tax-compensation
	//reference for calculating withholding tax
	
	public static double calculateWithholdingTax(double salary) {
		double withholdingTax = 0;
		if (salary < 20833) {
			withholdingTax = 0;
			return withholdingTax;
		}
		else if ( salary >= 20833 && salary <33332 ) {
			withholdingTax = (salary-20833)*0.2;
			return withholdingTax;
		}
		else if ( salary >= 33332 && salary <66666) {
			withholdingTax = 2500+(salary-33333)*0.25;
			return withholdingTax;
		}
		else if ( salary >= 66666 && salary <166666) {
			withholdingTax = 10833.33+(salary-66666)*0.30;
			return withholdingTax;
		}
		else if ( salary >=166666 && salary <666666) {
			withholdingTax = 40833.33+(salary-166666)*0.32;
			return withholdingTax;
		}
		else if ( salary >666666) {
			withholdingTax = 200833.33+(salary-666666)*0.35;
			return withholdingTax;
		}
		return withholdingTax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input the monthly salary");
		Scanner strScanner = new Scanner(System.in);
		Double salary = strScanner.nextDouble();
		Student student1 = new Student();

		student1.setSss(calculateSss(salary));
		System.out.println("The calculated SSS is equivalent to:" + student1.getSss());

		student1.setPhilhealth(calculatePhilhealth(salary));
		System.out.println("The calculated PhilHealth is equivalent to:" +student1.getPhilhealth());

		student1.setWithholdingTax(calculateWithholdingTax(salary));
		System.out.println("The calculated Withholding Tax is equivalent to:" + student1.getWitholdingTax());


		
	

	}

}
