package com.study.aktu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_quantum")
public class Quantum {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String course;
	private String name;
	private String branch;
	private String sem;
	private String subcode;
	private String image;
	private String url;
	private float price;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public String getSubcode() {
		return subcode;
	}
	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Quantum [id=" + id + ", course=" + course + ", name=" + name + ", branch=" + branch + ", sem=" + sem
				+ ", subcode=" + subcode + ", image=" + image + ", url=" + url + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}
