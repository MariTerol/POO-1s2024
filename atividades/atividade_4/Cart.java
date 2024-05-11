package atividades.atividade_4;

import java.util.ArrayList;

public class Cart extends productHolder{
	private Double cartTotal;
	
	public Cart() {
		this.cartTotal = 0.0;
	}
	
	public void addToCart(Product product) {
		this.products.add(product);
		this.cartTotal += product.price;
	}
	
	public void removeFirstItem(Product product) {
		for (Product p : this.products) {
			if (p == product) {
				this.products.remove(product);
				break;
			}
		}
	}
	
	public void listProducts() {
		String cartItems = "";
		
		for(Product p : this.products) {
			cartItems += p.name + "\n";
		}
		System.out.println(cartItems);
	}
	
	public void placeOrder(Client client) {
		if (client.balance >= cartTotal){
		this.products.clear();
		this.cartTotal = 0.0;
		System.out.println("your items will be delivered soon enough");
		}
	}
}