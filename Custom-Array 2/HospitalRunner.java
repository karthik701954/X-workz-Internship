class HospitalRunner{
	public static void main(String[] args){
		Hospital hospital = new Hospital();
		
		Doctor dr1 = new Doctor();
		dr1.doctorId = 101;
		dr1.doctorName = "Shivu";
		dr1.Specialization = "Cardiology";
		dr1.experience = "4yrs";
		hospital.saveDoctor(dr1);

		Doctor dr2 = new Doctor();
		dr2.doctorId = 102;
		dr2.doctorName = "Ravi";
		dr2.Specialization = "Neurology";
		dr2.experience = "6yrs";
		hospital.saveDoctor(dr2);

		Doctor dr3 = new Doctor();
		dr3.doctorId = 103;
		dr3.doctorName = "Anjali";
		dr3.Specialization = "Orthopedics";
		dr3.experience = "5yrs";
		hospital.saveDoctor(dr3);

		Doctor dr4 = new Doctor();
		dr4.doctorId = 104;
		dr4.doctorName = "Kiran";
		dr4.Specialization = "Dermatology";
		dr4.experience = "3yrs";
		hospital.saveDoctor(dr4);

		Doctor dr5 = new Doctor();
		dr5.doctorId = 105;
		dr5.doctorName = "Pooja";
		dr5.Specialization = "Pediatrics";
		dr5.experience = "7yrs";
		hospital.saveDoctor(dr5);

		Doctor dr6 = new Doctor();
		dr6.doctorId = 106;
		dr6.doctorName = "Rahul";
		dr6.Specialization = "Oncology";
		dr6.experience = "8yrs";
		hospital.saveDoctor(dr6);

		Doctor dr7 = new Doctor();
		dr7.doctorId = 107;
		dr7.doctorName = "Deepa";
		dr7.Specialization = "Gynecology";
		dr7.experience = "6yrs";
		hospital.saveDoctor(dr7);

		Doctor dr8 = new Doctor();
		dr8.doctorId = 108;
		dr8.doctorName = "Vikram";
		dr8.Specialization = "ENT";
		dr8.experience = "4yrs";
		hospital.saveDoctor(dr8);

		Doctor dr9 = new Doctor();
		dr9.doctorId = 109;
		dr9.doctorName = "Sneha";
		dr9.Specialization = "Radiology";
		dr9.experience = "5yrs";
		hospital.saveDoctor(dr9);

		Doctor dr10 = new Doctor();
		dr10.doctorId = 110;
		dr10.doctorName = "Arjun";
		dr10.Specialization = "Urology";
		dr10.experience = "9yrs";
		hospital.saveDoctor(dr10);

		Doctor dr11 = new Doctor();
		dr11.doctorId = 111;
		dr11.doctorName = "Manju";
		dr11.Specialization = "Cardiology";
		dr11.experience = "10yrs";
		hospital.saveDoctor(dr11);

		Doctor dr12 = new Doctor();
		dr12.doctorId = 112;
		dr12.doctorName = "Nisha";
		dr12.Specialization = "Neurology";
		dr12.experience = "7yrs";
		hospital.saveDoctor(dr12);

		Doctor dr13 = new Doctor();
		dr13.doctorId = 113;
		dr13.doctorName = "Suresh";
		dr13.Specialization = "Orthopedics";
		dr13.experience = "12yrs";
		hospital.saveDoctor(dr13);

		Doctor dr14 = new Doctor();
		dr14.doctorId = 114;
		dr14.doctorName = "Meena";
		dr14.Specialization = "Dermatology";
		dr14.experience = "4yrs";
		hospital.saveDoctor(dr14);

		Doctor dr15 = new Doctor();
		dr15.doctorId = 115;
		dr15.doctorName = "Ramesh";
		dr15.Specialization = "Pediatrics";
		dr15.experience = "6yrs";
		hospital.saveDoctor(dr15);

		Doctor dr16 = new Doctor();
		dr16.doctorId = 116;
		dr16.doctorName = "Divya";
		dr16.Specialization = "Oncology";
		dr16.experience = "8yrs";
		hospital.saveDoctor(dr16);

		Doctor dr17 = new Doctor();
		dr17.doctorId = 117;
		dr17.doctorName = "Harish";
		dr17.Specialization = "Gynecology";
		dr17.experience = "5yrs";
		hospital.saveDoctor(dr17);

		Doctor dr18 = new Doctor();
		dr18.doctorId = 118;
		dr18.doctorName = "Keerthi";
		dr18.Specialization = "ENT";
		dr18.experience = "3yrs";
		hospital.saveDoctor(dr18);

		Doctor dr19 = new Doctor();
		dr19.doctorId = 119;
		dr19.doctorName = "Ajay";
		dr19.Specialization = "Radiology";
		dr19.experience = "7yrs";
		hospital.saveDoctor(dr19);

		Doctor dr20 = new Doctor();
		dr20.doctorId = 120;
		dr20.doctorName = "Lakshmi";
		dr20.Specialization = "Urology";
		dr20.experience = "9yrs";
		hospital.saveDoctor(dr20);
		
		hospital.getDoctors();
		
	}
}