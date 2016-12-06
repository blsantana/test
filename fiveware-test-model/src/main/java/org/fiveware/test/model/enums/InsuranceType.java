package org.fiveware.test.model.enums;

public enum InsuranceType {
	
	AUTOMOTIVE("automotive","auto"),RESIDENTIAL("Residential","resi"),LIFE("life","lf");
	
	private String type;
	private String initials;
	
	private InsuranceType(String type,String initials) {

		this.type = type;
		this.initials = initials;
	}

	public String getType() {
		return type;
	}

	

	public String getInitials() {
		return initials;
	}

	
	public static InsuranceType getValue(String valor){
		
		if ("auto".equalsIgnoreCase(valor) ){
			
			return InsuranceType.AUTOMOTIVE;
		} else if ("resi".equalsIgnoreCase(valor) ) {
			return InsuranceType.RESIDENTIAL;
			
		} else {
			return  InsuranceType.LIFE;
		}
		
		
		
		
	}
	
	
	
}
