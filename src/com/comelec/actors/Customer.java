package com.comelec.actors;

public class Customer extends BaseUtilisateur {

	private  String Address ;
	private  String ZipCode ;
	private  String Country ;
	private String  Town ;
	
	
	public Customer(){
		
	}
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getTown() {
		return Town;
	}
	public void setTown(String town) {
		Town = town;
	}
}
