package lv.venta.model;

public class Product {
	private String title;
	private String description;
	private float price;
	private int quantity;
	private long id;
	private static long idCounter;
	
	public Product(String title, String description, float price, int quantity) {
		setID();
		this.title = title;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	public Product() {}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getID() {
		return id;
	}
	public void setID() {
		id = idCounter++;
	}
	public static long getIDCounter() {
		return idCounter;
	}
	public static void setIDCounter(long iDCounter) {
		Product.idCounter = iDCounter;
	}
	
	
	@Override
	public String toString() {
		return "Product [title=" + title + ", description=" + description + ", price= " + price + ", quantity= " + quantity + ", ID= "+id+ "]";
	
	}
}
