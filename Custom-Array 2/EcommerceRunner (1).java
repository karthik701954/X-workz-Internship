class EcommerceRunner{
	public static void main(String args[]){
		Ecommerce ec = new Ecommerce();
		
		Product pr = new Product();
		
		pr.productId = 200;
	    pr.productName = "Bag";
	    pr.productBrand ="American Tourister";
		pr.price = 1000;
		pr.productColor = "Red";
		
		ec.saveProduct(pr);
		Product pr1 = new Product();
		pr1.productId = 201;
		pr1.productName = "Bag";
		pr1.productBrand = "American Tourister";
		pr1.price = 1000;
		pr1.productColor = "Red";
		ec.saveProduct(pr1);

		Product pr2 = new Product();
		pr2.productId = 202;
		pr2.productName = "Shoes";
		pr2.productBrand = "Nike";
		pr2.price = 2500;
		pr2.productColor = "Black";
		ec.saveProduct(pr2);

		Product pr3 = new Product();
		pr3.productId = 203;
		pr3.productName = "Watch";
		pr3.productBrand = "Fossil";
		pr3.price = 5000;
		pr3.productColor = "Brown";
		ec.saveProduct(pr3);

		Product pr4 = new Product();
		pr4.productId = 204;
		pr4.productName = "Mobile";
		pr4.productBrand = "Samsung";
		pr4.price = 15000;
		pr4.productColor = "Blue";
		ec.saveProduct(pr4);

		Product pr5 = new Product();
		pr5.productId = 205;
		pr5.productName = "Laptop";
		pr5.productBrand = "Dell";
		pr5.price = 55000;
		pr5.productColor = "Silver";
		ec.saveProduct(pr5);

		Product pr6 = new Product();
		pr6.productId = 206;
		pr6.productName = "Headphones";
		pr6.productBrand = "Sony";
		pr6.price = 3000;
		pr6.productColor = "White";
		ec.saveProduct(pr6);

		Product pr7 = new Product();
		pr7.productId = 207;
		pr7.productName = "Backpack";
		pr7.productBrand = "Skybags";
		pr7.price = 1200;
		pr7.productColor = "Green";
		ec.saveProduct(pr7);

		Product pr8 = new Product();
		pr8.productId = 208;
		pr8.productName = "Sunglasses";
		pr8.productBrand = "RayBan";
		pr8.price = 4000;
		pr8.productColor = "Black";
		ec.saveProduct(pr8);

		Product pr9 = new Product();
		pr9.productId = 209;
		pr9.productName = "Wallet";
		pr9.productBrand = "Wildcraft";
		pr9.price = 800;
		pr9.productColor = "Brown";
		ec.saveProduct(pr9);

		Product pr10 = new Product();
		pr10.productId = 210;
		pr10.productName = "T-Shirt";
		pr10.productBrand = "Puma";
		pr10.price = 900;
		pr10.productColor = "Yellow";
		ec.saveProduct(pr10);

		Product pr11 = new Product();
		pr11.productId = 211;
		pr11.productName = "Jeans";
		pr11.productBrand = "Levis";
		pr11.price = 2000;
		pr11.productColor = "Blue";
		ec.saveProduct(pr11);

		Product pr12 = new Product();
		pr12.productId = 212;
		pr12.productName = "Bottle";
		pr12.productBrand = "Milton";
		pr12.price = 600;
		pr12.productColor = "Red";
		ec.saveProduct(pr12);

		Product pr13 = new Product();
		pr13.productId = 213;
		pr13.productName = "Keyboard";
		pr13.productBrand = "Logitech";
		pr13.price = 1500;
		pr13.productColor = "Black";
		ec.saveProduct(pr13);

		Product pr14 = new Product();
		pr14.productId = 214;
		pr14.productName = "Mouse";
		pr14.productBrand = "HP";
		pr14.price = 700;
		pr14.productColor = "Grey";
		ec.saveProduct(pr14);
		
		ec.getProduct();
		
	}
	
}