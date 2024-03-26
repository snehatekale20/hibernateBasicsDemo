package com.practiceDemo.l2CacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY, region="country")
@Table(name="country")
public class Country {
	
	@Id
	@GeneratedValue
	@Column(name="countryId")
	int countryId;
	
	@Column(name="country_Code")
	int CountryCode;
	
	@Column(name="country_name")
	String countryName;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(int countryCode) {
		CountryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", CountryCode=" + CountryCode + ", countryName=" + countryName
				+ "]";
	}
	
	

}
