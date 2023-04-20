package lv.venta.model;

public class Product {
	private String Title;
	private String Description;
	private float Price;
	private int quantity;
	private long ID;
	private static long IDCounter;
	
	
	
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getID() {
		return ID;
	}
	public void setID() {
		ID = IDCounter++;
	}
	public static long getIDCounter() {
		return IDCounter;
	}
	public static void setIDCounter(long iDCounter) {
		Product.IDCounter = iDCounter;
	}
}
