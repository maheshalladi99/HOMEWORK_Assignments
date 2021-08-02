package Spring;

public class Department {
	int DptId;
	String DptName;
	String DptHead;
	//Methods
	public Department() {
		
	}
	public Department(int dptId, String dptName, String dptHead) {
		DptId = dptId;
		DptName = dptName;
		DptHead = dptHead;
	}
	public int getDptId() {
		return DptId;
	}
	public void setDptId(int dptId) {
		DptId = dptId;
	}
	public String getDptName() {
		return DptName;
	}
	public void setDptName(String dptName) {
		DptName = dptName;
	}
	public String getDptHead() {
		return DptHead;
	}
	public void setDptHead(String dptHead) {
		DptHead = dptHead;
	}
	@Override
	public String toString() {
		return "Department [DptId=" + DptId + ", DptName=" + DptName + ", DptHead=" + DptHead + "]";
	}
}
