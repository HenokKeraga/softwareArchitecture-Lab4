package shop.order.service;

public class OrderLineDTO {
	int quantity;
	ProductDTO product;

	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderLineDTO{" +
				"quantity=" + quantity +
				", product=" + product +
				'}';
	}
}
