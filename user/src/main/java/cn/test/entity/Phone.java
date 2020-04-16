package cn.test.entity;

public class Phone {
	private String id;
	private String color;
	private String brand;
	private String price;
	public Phone(String id, String color, String brand, String price) {
		super();
		this.id = id;
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	public Phone() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", color=" + color + ", brand=" + brand + ", price=" + price + "]";
	}
	public Phone(String id, String color) {
		super();
		this.id = id;
		this.color = color;
	}
	
	
}
