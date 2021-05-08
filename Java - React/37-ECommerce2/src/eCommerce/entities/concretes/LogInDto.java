package eCommerce.entities.concretes;

import eCommerce.entities.abstracts.Dto;

public class LogInDto implements Dto {
	private String eMail;
	private String password;
	
	public LogInDto() {
		
	}

	public LogInDto(String eMail, String password) {
		this.eMail = eMail;
		this.password = password;
	}

	public String getEMail() {
		return eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
