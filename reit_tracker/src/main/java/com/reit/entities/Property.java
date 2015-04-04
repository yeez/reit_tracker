package com.reit.entities;

public class Property {
	
	public enum PropertyType { HOTEL, BUILDING, APPARTMENT, HOUSE, NULL}
	
	private PropertyType propertyType;
	private int propertyNumber;
	private String propertyOwner;
	
	public Property (PropertyType tempType, int tempNumber, String tempOwner){
		
		propertyType = tempType;
		propertyNumber = tempNumber;
		propertyOwner = tempOwner;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(PropertyType propertyType) {
		this.propertyType = propertyType;
	}

	public int getPropertyNumber() {
		return propertyNumber;
	}

	public void setPropertyNumber(int propertyNumber) {
		this.propertyNumber = propertyNumber;
	}

	public String getPropertyOwner() {
		return propertyOwner;
	}

	public void setPropertyOwner(String propertyOwner) {
		this.propertyOwner = propertyOwner;
	}
}
