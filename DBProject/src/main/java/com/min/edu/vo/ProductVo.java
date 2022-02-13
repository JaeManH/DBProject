package com.min.edu.vo;

import java.io.Serializable;

public class ProductVo implements Serializable{
	

	private static final long serialVersionUID = 7009860660814190571L;
	
	private int product_id;
	private String product_name;
	private int product_price;
	private int product_inventory;
	private String product_detail;
	private String product_sold;
	private String product_regdate;
	
	public ProductVo() {
	}

	public ProductVo(String product_name, int product_price, int product_inventory,
			String product_detail, String product_sold, String product_regdate) {
		super();
//		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_inventory = product_inventory;
		this.product_detail = product_detail;
		this.product_sold = product_sold;
		this.product_regdate = product_regdate;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public int getProduct_inventory() {
		return product_inventory;
	}

	public void setProduct_inventory(int product_inventory) {
		this.product_inventory = product_inventory;
	}

	public String getProduct_detail() {
		return product_detail;
	}

	public void setProduct_detail(String product_detail) {
		this.product_detail = product_detail;
	}

	public String getProduct_sold() {
		return product_sold;
	}

	public void setProduct_sold(String product_sold) {
		this.product_sold = product_sold;
	}

	public String getProduct_regdate() {
		return product_regdate;
	}

	public void setProduct_regdate(String product_regdate) {
		this.product_regdate = product_regdate;
	}

	@Override
	public String toString() {
		return "ProductVo [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_inventory=" + product_inventory + ", product_detail=" + product_detail
				+ ", product_sold=" + product_sold + ", product_regdate=" + product_regdate + "]";
	}
	
	
}
