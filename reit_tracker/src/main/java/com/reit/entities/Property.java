package com.reit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "property")
public class Property {
	
	public enum PropertyType { HOTEL, BUILDING, APPARTMENT, HOUSE, NULL}
	
	@Id
	private long id;
	
	@Column(name = "property_type")
	private PropertyType propertyType;
	
	@Column(name = "property_number")
	private int propertyNumber;
	
	@Column(name = "property_owner")
	private String propertyOwner;
	
	public Property (long id, PropertyType tempType, int tempNumber, String tempOwner){
		
		this.id = id;
		this.propertyType = tempType;
		this.propertyNumber = tempNumber;
		this.propertyOwner = tempOwner;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
