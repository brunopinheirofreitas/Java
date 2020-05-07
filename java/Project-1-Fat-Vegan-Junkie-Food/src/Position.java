import java.math.BigDecimal;

public class Position extends Employee {
	
	private int position; //0 - Cashier, 1 - Customer Attendant, 2 - Chef, 3 - Supervisor, 4 - Manager
	
	@Override
	protected String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	protected int getEmployee_code() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void setEmployee_code(int employee_code) {
		// TODO Auto-generated method stub

	}

	@Override
	protected int getSocial_number() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void setSocial_number(int social_number) {
		// TODO Auto-generated method stub

	}

	@Override
	protected String getAdmission_date() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setAdmission_date(String admission_date) {
		// TODO Auto-generated method stub

	}

	@Override
	protected BigDecimal getSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setSalary(BigDecimal salary) {
		// TODO Auto-generated method stub

	}

	@Override
	protected String getEmployee_adress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setEmployee_adress(String employee_address) {
		// TODO Auto-generated method stub

	}

	@Override
	protected String getTelephone_number_personal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setTelephone_number_personal(String telephone_number_personal) {
		// TODO Auto-generated method stub

	}

	@Override
	protected String getTelephone_number_emergency_contact() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setTelephone_number_emergency_contact(String telephone_number_emergency_contact) {
		// TODO Auto-generated method stub

	}

	@Override
	protected int getDesignted_branch() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void setDesignted_branch(int designated_branch) {
		// TODO Auto-generated method stub

	}

	@Override
	protected int getPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void setPosition(int position) {
		this.position = position;
		System.out.println("This employee work as a:"); //0 - Cashier, 1 - Customer Attendant, 2 - Chef, 3 - Supervisor, 4 - Manager
		switch (this.position) {
			case 0:
				System.out.println("Cashier");
				break;
			case 1:
				System.out.println("Customer Attendant");
				break;
			case 2:
				System.out.println("Chef");
				break;
			case 3:
				System.out.println("Supervisor");
				break;
			case 4:
				System.out.println("Manager");
				break;
		}

	}

	@Override
	protected int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void setAge(int age) {
		// TODO Auto-generated method stub

	}

}
