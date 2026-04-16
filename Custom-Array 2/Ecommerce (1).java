class Ecommerce{
	Product products[] = new Product[15];
	Product product = new Product();
	int index;
	
	public void saveProduct(Product product){
		products[index++]= product;
	}
	
	public void getProduct(){
		for(Product product:products){
			System.out.println("Product Id is"+ product.productId);
			System.out.println("Product Name is"+ product.productName);
			System.out.println("Product Brand is"+ product.productBrand);
			System.out.println("Product Price is"+ product.price);
			System.out.println("Product Color is"+ product.productColor);
			System.out.println("***************************************");
			
		}
	}
}