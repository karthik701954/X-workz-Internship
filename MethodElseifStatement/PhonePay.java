class PhonePay{

	static double searchInsurencePremium(String insurenceName){
	
	System.out.println("searchInsurencePremium is invoking....");
	
	if(insurenceName=="HDFC Ergo")
	{
		return 9999.00;
	}
	else if(insurenceName=="star")
	{
		return 8999.00;
	}
	else if(insurenceName=="Icici Lambard")
	{
		return 7999.23;
	}
	else if(insurenceName=="aqua")
	{
		return 87777.00;
	}
	else
	{
		System.out.println("the searchInsurencePremium insurence is deafault");
	}
	return 0.0000;
	}
}