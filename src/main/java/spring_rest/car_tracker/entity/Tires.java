package spring_rest.car_tracker.entity;

import javax.persistence.Id;

public class Tires {
	@Id
	public String vin;
	public String frontLeft;
	public String frontRight;
	public String rearLeft;
	public String rearRight;
	public String getFrontLeft() {
		return frontLeft;
	}
	public void setFrontLeft(String frontLeft) {
		this.frontLeft = frontLeft;
	}
	public String getFrontRight() {
		return frontRight;
	}
	public void setFrontRight(String frontRight) {
		this.frontRight = frontRight;
	}
	public String getRearLeft() {
		return rearLeft;
	}
	public void setRearLeft(String rearLeft) {
		this.rearLeft = rearLeft;
	}
	public String getRearRight() {
		return rearRight;
	}
	public void setRearRight(String rearRight) {
		this.rearRight = rearRight;
	}
	public Tires(String frontLeft, String frontRight, String rearLeft, String rearRight) {
		super();
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.rearLeft = rearLeft;
		this.rearRight = rearRight;
	}
	
}
