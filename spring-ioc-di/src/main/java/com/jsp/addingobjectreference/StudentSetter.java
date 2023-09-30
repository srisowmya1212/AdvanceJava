package com.jsp.addingobjectreference;

public class StudentSetter {
	PercentageSetter percentageSetter;
	
	
	
	
	public void setPercentageSetter(PercentageSetter percentageSetter) {
		this.percentageSetter = percentageSetter;
	}




	public void display() {
		percentageSetter.percentage();
	}

}
