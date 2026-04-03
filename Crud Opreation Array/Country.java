class Country{
	String States[] = new String[29];
	int index;
	
	
	public boolean addStates(String state){
		boolean isAdded = false;
		if(index < States.length){
			if(state != null && !state.isEmpty()){
				States[index++]=state;
				isAdded = true;
			}
			else{
				System.out.println("This is not valid");
			}
		}
		else System.out.println("Try next time");
		return isAdded;
	}
	
	public void getStates(){
		for(String State:States){
			System.out.println(State);
		}
	}
}