package stram.object.vo;

import java.io.Serializable;

public class Car implements Serializable{
	private String model;
	private int price;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + "]";
	}	
}
