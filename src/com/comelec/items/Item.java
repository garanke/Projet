package com.comelec.items;

public class Item {
	
	public long id ;
	public String ItemName ;
	public double Tva ; 
	public int Stock ;
	public  String Description ;
	public double Price ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public double getTva() {
		return Tva;
	}
	public void setTva(double tva) {
		Tva = tva;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
}
