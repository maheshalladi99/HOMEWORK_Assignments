package Spring;

public class Employee {
	int eid;
	String ename;
	String eaddress;
	Department department;
	BranchList branch;
	
	public Employee() {
		System.out.println("i am in Contructor");
		}
	//Constructor injection
	public Employee(Department department,BranchList branch) {
		this.department= department;
		this.branch = branch;
	}

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public BranchList getBranch() {
		return branch;
	}
	public void setBranch(BranchList branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", department=" + department
				+ ", branch=" + branch + "]";
	}
	public void myInit() {
		System.out.println("Calling from myInit()");
	}
	
	public void myDestroy() {
		System.out.println("Calling from myDestroy()");
	}
}
