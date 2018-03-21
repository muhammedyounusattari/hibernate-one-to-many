package younus.attari;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "emp_detail")
public class EmployeeDetail {

	@Id
	@GeneratedValue
	private Long id;

	private String empDOJ, empLastDate, empFirstName, empLastName, empManager;

	@OneToMany(cascade=CascadeType.ALL)
	
	private Collection<Address> address = new ArrayList<Address>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpDOJ() {
		return empDOJ;
	}

	public void setEmpDOJ(String empDOJ) {
		this.empDOJ = empDOJ;
	}

	public String getEmpLastDate() {
		return empLastDate;
	}

	public void setEmpLastDate(String empLastDate) {
		this.empLastDate = empLastDate;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpManager() {
		return empManager;
	}

	public void setEmpManager(String empManager) {
		this.empManager = empManager;
	}

	public Collection<Address> getAddress() {
		return address;
	}

	public void setAddress(Collection<Address> address) {
		this.address = address;
	}

}
