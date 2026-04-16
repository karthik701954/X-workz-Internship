class Facebook{
	Account accounts[] = new Account[10];
	Account account = new Account();
	int index;
	
	public void saveAccount(Account account){
		 accounts[index++]  = account;
	}
	public void getAccount(){
		for(Account account:accounts){
			System.out.println("Account Id is "+account.accountId);
			System.out.println("Account Name is "+account.accountName);
			System.out.println("Type of Account is "+account.accountType);
			System.out.println("The avalible balance "+account.avlBalance);
			System.out.println("******************************************");
		}
	}
}