class Hospital{
	Doctor doctors[] = new Doctor[20];
	Doctor doctor;
	int index;
	
	public void saveDoctor(Doctor doctor){
		  doctors[index++] = doctor;
	}
	
	public void getDoctors(){
		for(Doctor doctor:doctors){
			System.out.println("Doctor Id is "+ doctor.doctorId);
			System.out.println("Doctor Name is "+doctor.doctorName);
			System.out.println("Doctor Specialization is "+ doctor.Specialization);
			System.out.println("Doctor experience is "+ doctor.experience);
			System.out.println("************************************");
		}
	}
}