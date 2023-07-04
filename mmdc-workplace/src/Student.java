import java.time.LocalDate;

public class Student {

	private String name;
    private int employeeNo;
    private LocalDate birthday;
    private String address;
    private double hourlyRate;
    private String position;
    private double monthlyRate;
    private double sssValue;
    private double philhealth;
    private double withholdingTax;

    // Constructors
    public Student() {
    }

    public Student(String name, int employeeNo, LocalDate birthday, String address, double hourlyRate, String position, double monthlyRate, double sssValue, double philhealth, double withholdingTax) {
        this.name = name;
        this.employeeNo = employeeNo;
        this.birthday = birthday;
        this.address = address;
        this.hourlyRate = hourlyRate;
        this.position = position;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getSss() {
    	return sssValue;
    }
    
    public void setSss(double sssValue) {
    	this.sssValue = sssValue;
    }
    
    public double getPhilhealth() {
    	return philhealth;
    }
    
    public void setPhilhealth(double philhealth) {
    	this.philhealth = philhealth;
    }

    public double getWitholdingTax() {
    	return withholdingTax;
    }
    
    public void setWithholdingTax(double withholdingTax) {
    	this.withholdingTax = withholdingTax;
    }
    
    public double getMonthlyRate() {
    	return monthlyRate;
    }
    
    public void setMonthlyRate(double monthlyRate) {
    	this.monthlyRate = monthlyRate;
    }
    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student object1 = new Student();
		object1.setName("John");
		object1.setBirthday(LocalDate.of(1992,9,8));
		object1.setAddress("Manila");
		object1.setPosition("student");
		System.out.println("Name of the student is " + object1.getName());
		System.out.println("Birthday of the student is " + object1.getBirthday());
		System.out.println("Address of the student is " + object1.getAddress());
		System.out.println("Position of the student is " + object1.getPosition());

	}

}
