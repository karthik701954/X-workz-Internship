class FaceBookRunner{
	public static void main(String args[]){
		Facebook fb = new Facebook();
		Account acc = new Account();
		acc.accountId = 101;
		acc.accountName = "Amith";
		acc.accountType = "Saving";
		acc.avlBalance = 5000;
		
		fb.saveAccount(acc);
		
		Account acc1 = new Account();
		acc1.accountId = 101;
		acc1.accountName = "Amith";
		acc1.accountType = "Saving";
		acc1.avlBalance = 5000;
		fb.saveAccount(acc1);

		Account acc2 = new Account();
		acc2.accountId = 102;
		acc2.accountName = "Ravi";
		acc2.accountType = "Current";
		acc2.avlBalance = 8000;
		fb.saveAccount(acc2);

		Account acc3 = new Account();
		acc3.accountId = 103;
		acc3.accountName = "Sneha";
		acc3.accountType = "Saving";
		acc3.avlBalance = 12000;
		fb.saveAccount(acc3);

		Account acc4 = new Account();
		acc4.accountId = 104;
		acc4.accountName = "Kiran";
		acc4.accountType = "Current";
		acc4.avlBalance = 7000;
		fb.saveAccount(acc4);

		Account acc5 = new Account();
		acc5.accountId = 105;
		acc5.accountName = "Pooja";
		acc5.accountType = "Saving";
		acc5.avlBalance = 9500;
		fb.saveAccount(acc5);

		Account acc6 = new Account();
		acc6.accountId = 106;
		acc6.accountName = "Rahul";
		acc6.accountType = "Current";
		acc6.avlBalance = 15000;
		fb.saveAccount(acc6);

		Account acc7 = new Account();
		acc7.accountId = 107;
		acc7.accountName = "Anjali";
		acc7.accountType = "Saving";
		acc7.avlBalance = 6000;
		fb.saveAccount(acc7);

		Account acc8 = new Account();
		acc8.accountId = 108;
		acc8.accountName = "Vikram";
		acc8.accountType = "Current";
		acc8.avlBalance = 11000;
		fb.saveAccount(acc8);

		Account acc9 = new Account();
		acc9.accountId = 109;
		acc9.accountName = "Deepa";
		acc9.accountType = "Saving";
		acc9.avlBalance = 4000;
		fb.saveAccount(acc9);
		fb.getAccount();
	}
}