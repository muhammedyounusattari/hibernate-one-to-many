package younus.attari;

import java.util.ArrayList;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	static SessionFactory factory = null;

	static {
		Properties prop = new Properties();
		prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		prop.setProperty("hibernate.connection.url", "jdbc:mysql://abc");
		prop.setProperty("hibernate.connection.username", "user");
		prop.setProperty("hibernate.connection.password", "pass#123");
		prop.setProperty("hibernate.connection.driver", "com.mysql.jdbc.Driver");
		prop.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		prop.setProperty("show_sql", "true");
		prop.setProperty("format_sql", "true");

		factory = new Configuration().addPackage("younus.attari").addAnnotatedClass(Employee.class)
				.addAnnotatedClass(EmployeeDetail.class).addAnnotatedClass(Address.class).addProperties(prop)
				.buildSessionFactory();

	}

	public static Employee returnEmployeeList() {

		Address address1 = new Address();
		address1.setStreet1("street1");
		address1.setStreet2("street2");
		address1.setCity("city");
		address1.setState("state");
		address1.setPincode("pincode");
		
		Address address2 = new Address();
		address2.setStreet1("street1");
		address2.setStreet2("street2");
		address2.setCity("city");
		address2.setState("state");
		address2.setPincode("pincode");
		
		ArrayList<Address> address = new ArrayList<>();
		address.add(address1);
		address.add(address2);

		EmployeeDetail empDetail = new EmployeeDetail();
		empDetail.setEmpFirstName("Satish");
		empDetail.setEmpLastName("Mandava");
		empDetail.setEmpDOJ("22-11-2014");
		empDetail.setEmpManager("Bhaskar");
		empDetail.setAddress(address);

		Employee emp = new Employee();
		emp.setEmpDesig("Admin");
		emp.setEmpProject("Reliance");
		emp.setEmpReporting("Anil");
		emp.setEmpDetail(empDetail);

		return emp;
	}

	public static void main(String[] args) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(returnEmployeeList());
		trans.commit();
	}
}
