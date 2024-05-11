package atividades.atividade_4;

public class StoreSystem {
    
	public static void main(String[] args) {
		Store store = new Store();
		Cart cart = new Cart();
		Client c1 = new Client("Enrique", 1000);
		
		Product rice1 = new Product("Rice", 23.5);
		Product rice2 = new Product("Brown Rice", 19.9);
		Product soap1 = new Product("Soap", 9.9);
		
		store.addProduct(rice1);
		store.addProduct(rice2);
		store.addProduct(soap1);
		
		store.listProducts();
		
		cart.addToCart(rice1);
		cart.addToCart(soap1);
		
		cart.listProducts();
		
		cart.placeOrder(c1);
	}
}