package younus.attari;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue
	private Long id;

	private String empProject, empReporting, empDesig;

	
	@OneToOne(cascade=CascadeType.ALL)
	private EmployeeDetail empDetail;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmpProject() {
		return empProject;
	}

	public void setEmpProject(String empProject) {
		this.empProject = empProject;
	}

	public String getEmpReporting() {
		return empReporting;
	}

	public void setEmpReporting(String empReporting) {
		this.empReporting = empReporting;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public EmployeeDetail getEmpDetail() {
		return empDetail;
	}

	public void setEmpDetail(EmployeeDetail empDetail) {
		this.empDetail = empDetail;
	}

}
