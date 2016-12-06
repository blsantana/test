package org.fiveware.test.model.enums;

public enum GenreType {
	
	MALE("male","M"),FAMALE("Famale","F");
	
	private String name;
	private String initials;
	
	private GenreType(String name, String initials) {
		
		this.name  = name;
		this.initials = initials;
		
	}

	public String getName() {
		return name;
	}

	public String getInitials() {
		return initials;
	}

	
	public static GenreType getValue(String valor){
		
	if ("M".equalsIgnoreCase(valor) ){
			
			return GenreType.MALE;
		}  else {
			return  GenreType.FAMALE;
		}
		
		
		
		
		
	}
	

}
