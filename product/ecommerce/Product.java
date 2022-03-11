package ecommerce;

public class Product {
	private int productId;
	private String productName;
	private String productCategory;
	private int price;

	public Product(int parseInt, String parameter, String parameter2, int price) {
		// TODO Auto-generated constructor stub
	}

	public void Product(int productId, String productName, String productCategory, int price) {
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.price =price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public int price() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {

		return "Product: " + productName + "<br/>" + "Product ID: " + productId + "<br/>" + "Category: " + productCategory + "<br/>" + "price: " + price;
	}
}
