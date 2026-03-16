class ShopingMall{
	
	static String products[]={"electricitem","foods","sportsitem","fruits","vegitables"};
	public static void getproducts(){
		System.out.println("shoping mall products are available:");
		
		for(String product:products){
			System.out.println(product);
		}
	}
}