package com.lab2.cars;

public class Car {
	
	private String vin;
	private double mileage;
	private double invoicePrice;
	
	public Car(String vin, double mileage, double invoicePrice) {
	    this.vin = vin;
	    this.mileage = mileage;
	    this.invoicePrice = invoicePrice;
	}
        
	public String getVin() {
		return vin;
	}
	
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	public double getMileage() {
		return mileage;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public double getInvoicePrice() {
		return invoicePrice;
	}
	
	public void setInvoicePrice(double invoicePrice) {
		this.invoicePrice = invoicePrice;
	}
	
	public String toString() {
		return vin + ", " + mileage + " (km), $ " + invoicePrice;		
	}	

}
