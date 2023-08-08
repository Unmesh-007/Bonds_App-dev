package com.BondApplication.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

enum redemption {
   Active ,
   Matured
  }

@Entity
@Table(name = "Security")
public class Security {
	
	@Id
	@Column(name="securityid")
	private long securityId ;
	@Column(name="securityisin")
	private String securityIsin;
	@Column(name="securitycusip")
	private String securityCusip;
	@Column(name="securityissuer")
	private String securityIssuer;
	@Column(name="securitymaturitydate")
	private Date securityMaturityDate;
	@Column(name="securitycoupon")
	private double securityCoupon;
	@Column(name="securityfacevalue")
	private double securityFaceValue ;
	@Column(name="securitytype")
	private String securityType;
	
	@Column(name="securitystatus")
	private String securityStatus;
	
	
	
	public Security() {
	}



	public Security(long securityId, String securityIsin, String securityCusip, String securityIssuer,
			Date securityMaturityDate, double securityCoupon, double securityFaceValue, String securityType,
			String securityStatus) {
		this.securityId = securityId;
		this.securityIsin = securityIsin;
		this.securityCusip = securityCusip;
		this.securityIssuer = securityIssuer;
		this.securityMaturityDate = securityMaturityDate;
		this.securityCoupon = securityCoupon;
		this.securityFaceValue = securityFaceValue;
		this.securityType = securityType;
		this.securityStatus = securityStatus;
	}



	public long getSecurityId() {
		return securityId;
	}



	public void setSecurityId(long securityId) {
		this.securityId = securityId;
	}



	public String getSecurityIsin() {
		return securityIsin;
	}



	public void setSecurityIsin(String securityIsin) {
		this.securityIsin = securityIsin;
	}



	public String getSecurityCusip() {
		return securityCusip;
	}



	public void setSecurityCusip(String securityCusip) {
		this.securityCusip = securityCusip;
	}



	public String getSecurityIssuer() {
		return securityIssuer;
	}



	public void setSecurityIssuer(String securityIssuer) {
		this.securityIssuer = securityIssuer;
	}



	public Date getSecurityMaturityDate() {
		return securityMaturityDate;
	}



	public void setSecurityMaturityDate(Date securityMaturityDate) {
		this.securityMaturityDate = securityMaturityDate;
	}



	public double getSecurityCoupon() {
		return securityCoupon;
	}



	public void setSecurityCoupon(double securityCoupon) {
		this.securityCoupon = securityCoupon;
	}



	public double getSecurityFaceValue() {
		return securityFaceValue;
	}



	public void setSecurityFaceValue(double securityFaceValue) {
		this.securityFaceValue = securityFaceValue;
	}



	public String getSecurityType() {
		return securityType;
	}



	public void setSecurityType(String securityType) {
		this.securityType = securityType;
	}



	public String getSecurityStatus() {
		return securityStatus;
	}



	public void setSecurityStatus(String securityStatus) {
		this.securityStatus = securityStatus;
	}



	@Override
	public String toString() {
		return "Security [securityId=" + securityId + ", securityIsin=" + securityIsin + ", securityCusip="
				+ securityCusip + ", securityIssuer=" + securityIssuer + ", securityMaturityDate="
				+ securityMaturityDate + ", securityCoupon=" + securityCoupon + ", securityFaceValue="
				+ securityFaceValue + ", securityType=" + securityType + ", securityStatus=" + securityStatus + "]";
	}

	


	
	
}
