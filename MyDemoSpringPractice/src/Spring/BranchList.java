package Spring;

import java.util.List;

public class BranchList {

	private List branchSectionList;
	public BranchList() {
		
	}
	
	public BranchList(List branchSectionList) {
		this.branchSectionList = branchSectionList;
	}


	public List getBranchSectionList() {
		return branchSectionList;
	}

	public void setBranchSectionList(List branchSectionList) {
		this.branchSectionList = branchSectionList;
	}
	
	public void DisplayBranchList() {
		System.out.println("All Branches are: "+branchSectionList);
	}

	@Override
	public String toString() {
		return "BranchList [branchSectionList=" + branchSectionList + "]";
	}
	
}
