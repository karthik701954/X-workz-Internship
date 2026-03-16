class Cafe{
public static void main(String args[])
{
	String cafeName = "Bring cafeName";
	
	//String teaNames[] = {"BlackTea","MasalaTea","AmruthTea","GreenTea","LemonTea","GingerTea"};
	
	//String coffeeNames[] = {"ColdCoffee","EspressoCoffee","CappuccinoCoffee","LatteCoffee","AmericanoCoffee","VCoffee"};
	
	//String snaksNames[] ={"Samosa","Pakoda","Sandwich","FrenchFries","Burger"};
	
	System.out.println("The cafe Name is"+ cafeName);
	System.out.println("List of different types of Tea Names are :");
	
	String teaNames[] = {"BlackTea","MasalaTea","AmruthTea","GreenTea","LemonTea","GingerTea"};
	
	String blackTea="BlackTea";
	String MasalaTea="MasalaTea";
	String amruthTea="AmruthTea";
	String greenTea="GreenTea";
	String lemonTea="LemonTea";
	String gingerTea="GingerTea";
	
	for(String teaName : teaNames)
		{
			System.out.println(teaName);
		}
	
	System.out.println("List of different types of Coffee Names are :");
	
	String coffeeNames[] = {"ColdCoffee","EspressoCoffee","CappuccinoCoffee","LatteCoffee","AmericanoCoffee","VCoffee"};
	
	
	String coldCoffee="ColdCoffee";
	String cappuccinoCoffee="CappuccinoCoffee";
	String latteCoffee="LatteCoffee";
	String espressoCoffee="EspressoCoffee";
	String americanoCoffee="AmericanoCoffee";
	String vCoffee="VCoffee";
	
	for(String coffeeName : coffeeNames)
		{
			System.out.println(coffeeName);
			
		}
	System.out.println("List of different types of snaks Names are :");
		
	
	String snaksNames[] ={"Samosa","Pakoda","Sandwich","FrenchFries","Burger"};
	
	String samosa="Samosa";
	String pakoda="Pakoda";
	String sandwich="Sandwich";
	String frenchFries="FrenchFries";
	String burger="Burger";
	
	for(String snaksName : snaksNames )
		{
			System.out.println(snaksName);
		}
	
	//Looping statments 
	
	/*for each
		for(String teaName : teaNames)
		{
			System.out.println(teaName);
		}
		for(String coffeeName : coffeeNames)
		{
			System.out.println(coffeeName);
		}
		for(String snaksName : snaksNames )
		{
			System.out.println(snaksName);
		}*/
	

	/*System.out.println( teaNames[0] + "\n" + teaNames[1] + "\n" + teaNames[2] + "\n" + teaNames[3] + "\n" + teaNames[4] + "\n" + teaNames[5] + "\n" + teaNames[6] + "\n" + teaNames[7] + "\n" +
    teaNames[8] + "\n" + teaNames[9] + "\n" + teaNames[10] + "\n" + teaNames[11] + "\n" +
    teaNames[12] + "\n" + teaNames[13] + "\n" + teaNames[14]);*/
	
	//System.out.println("List of different types of Coffee Names are :");

	
	/*System.out.println(coffeeNames[0] + "\n" + coffeeNames[1] + "\n" + coffeeNames[2] + "\n" + coffeeNames[3] + "\n" +
    coffeeNames[4] + "\n" + coffeeNames[5] + "\n" + coffeeNames[6] + "\n" + coffeeNames[7] + "\n" +
    coffeeNames[8] + "\n" + coffeeNames[9] + "\n" + coffeeNames[10] + "\n" + coffeeNames[11] + "\n" +
    coffeeNames[12] + "\n" + coffeeNames[13]);*/
	
	//System.out.println("List of different types of Snaks Names are :");

	
	/*System.out.println(snaksNames[0] + "\n" + snaksNames[1] + "\n" + snaksNames[3] + "\n" + snaksNames[4] + "\n" + snaksNames + "\n"
	+ snaksNames[5] + "\n" + snaksNames[6] + "\n" + snaksNames[7]);	*/
	
}

}