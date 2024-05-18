package com.toystore.toystore.model;

import javax.validation.constraints.NotBlank;

 
public class ProductVO {

	@NotBlank(message = "Product Name cannot be blank")
	private String pname;

	private String pimage;

	private String pdescription;

	@NotBlank(message = "Username cannot be blank")
	private Integer price;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
