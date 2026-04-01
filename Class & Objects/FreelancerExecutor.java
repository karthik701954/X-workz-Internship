class FreelancerExecutor {

    public static void main(String args[]) {

        Freelancer ref1 = new Freelancer();
        ref1.freelancerId = 1;
        ref1.name = "Freelancer1";
        ref1.skill = "Java";
        ref1.experience = 2;
        ref1.platform = "Upwork";

        Client c1 = new Client();
        c1.clientId = 101;
        c1.clientName = "Client1";
        c1.project = "Web App";
        c1.budget = 5000;
        c1.deadline = "10 days";

        ref1.client = c1;
        ref1.getFreelancerDetails();


        Freelancer ref2 = new Freelancer();
        ref2.freelancerId = 2;
        ref2.name = "Freelancer2";
        ref2.skill = "Python";
        ref2.experience = 3;
        ref2.platform = "Fiverr";

        Client c2 = new Client();
        c2.clientId = 102;
        c2.clientName = "Client2";
        c2.project = "AI Model";
        c2.budget = 8000;
        c2.deadline = "15 days";

        ref2.client = c2;
        ref2.getFreelancerDetails();


        Freelancer ref3 = new Freelancer();
        ref3.freelancerId = 3;
        ref3.name = "Freelancer3";
        ref3.skill = "Web Design";
        ref3.experience = 4;
        ref3.platform = "Freelancer";

        Client c3 = new Client();
        c3.clientId = 103;
        c3.clientName = "Client3";
        c3.project = "Website UI";
        c3.budget = 3000;
        c3.deadline = "7 days";

        ref3.client = c3;
        ref3.getFreelancerDetails();


        Freelancer ref4 = new Freelancer();
        ref4.freelancerId = 4;
        ref4.name = "Freelancer4";
        ref4.skill = "Android";
        ref4.experience = 5;
        ref4.platform = "Upwork";

        Client c4 = new Client();
        c4.clientId = 104;
        c4.clientName = "Client4";
        c4.project = "Mobile App";
        c4.budget = 10000;
        c4.deadline = "20 days";

        ref4.client = c4;
        ref4.getFreelancerDetails();


        Freelancer ref5 = new Freelancer();
        ref5.freelancerId = 5;
        ref5.name = "Freelancer5";
        ref5.skill = "Data Analysis";
        ref5.experience = 3;
        ref5.platform = "Fiverr";

        Client c5 = new Client();
        c5.clientId = 105;
        c5.clientName = "Client5";
        c5.project = "Data Report";
        c5.budget = 4000;
        c5.deadline = "12 days";

        ref5.client = c5;
        ref5.getFreelancerDetails();
		
		        Freelancer ref6 = new Freelancer();
        ref6.freelancerId = 6;
        ref6.name = "Freelancer6";
        ref6.skill = "Java";
        ref6.experience = 4;
        ref6.platform = "Upwork";

        Client c6 = new Client();
        c6.clientId = 106;
        c6.clientName = "Client6";
        c6.project = "Backend API";
        c6.budget = 6000;
        c6.deadline = "12 days";

        ref6.client = c6;
        ref6.getFreelancerDetails();


        Freelancer ref7 = new Freelancer();
        ref7.freelancerId = 7;
        ref7.name = "Freelancer7";
        ref7.skill = "Python";
        ref7.experience = 5;
        ref7.platform = "Fiverr";

        Client c7 = new Client();
        c7.clientId = 107;
        c7.clientName = "Client7";
        c7.project = "ML Project";
        c7.budget = 9000;
        c7.deadline = "18 days";

        ref7.client = c7;
        ref7.getFreelancerDetails();


        Freelancer ref8 = new Freelancer();
        ref8.freelancerId = 8;
        ref8.name = "Freelancer8";
        ref8.skill = "Web Design";
        ref8.experience = 2;
        ref8.platform = "Freelancer";

        Client c8 = new Client();
        c8.clientId = 108;
        c8.clientName = "Client8";
        c8.project = "Landing Page";
        c8.budget = 2500;
        c8.deadline = "5 days";

        ref8.client = c8;
        ref8.getFreelancerDetails();


        Freelancer ref9 = new Freelancer();
        ref9.freelancerId = 9;
        ref9.name = "Freelancer9";
        ref9.skill = "Android";
        ref9.experience = 6;
        ref9.platform = "Upwork";

        Client c9 = new Client();
        c9.clientId = 109;
        c9.clientName = "Client9";
        c9.project = "App Development";
        c9.budget = 12000;
        c9.deadline = "25 days";

        ref9.client = c9;
        ref9.getFreelancerDetails();


        Freelancer ref10 = new Freelancer();
        ref10.freelancerId = 10;
        ref10.name = "Freelancer10";
        ref10.skill = "Data Analysis";
        ref10.experience = 3;
        ref10.platform = "Fiverr";

        Client c10 = new Client();
        c10.clientId = 110;
        c10.clientName = "Client10";
        c10.project = "Data Dashboard";
        c10.budget = 5000;
        c10.deadline = "10 days";

        ref10.client = c10;
        ref10.getFreelancerDetails();


        Freelancer ref11 = new Freelancer();
        ref11.freelancerId = 11;
        ref11.name = "Freelancer11";
        ref11.skill = "Java";
        ref11.experience = 5;
        ref11.platform = "Upwork";

        Client c11 = new Client();
        c11.clientId = 111;
        c11.clientName = "Client11";
        c11.project = "Microservices";
        c11.budget = 11000;
        c11.deadline = "20 days";

        ref11.client = c11;
        ref11.getFreelancerDetails();


        Freelancer ref12 = new Freelancer();
        ref12.freelancerId = 12;
        ref12.name = "Freelancer12";
        ref12.skill = "Python";
        ref12.experience = 4;
        ref12.platform = "Fiverr";

        Client c12 = new Client();
        c12.clientId = 112;
        c12.clientName = "Client12";
        c12.project = "Automation Script";
        c12.budget = 3500;
        c12.deadline = "8 days";

        ref12.client = c12;
        ref12.getFreelancerDetails();


        Freelancer ref13 = new Freelancer();
        ref13.freelancerId = 13;
        ref13.name = "Freelancer13";
        ref13.skill = "Web Design";
        ref13.experience = 6;
        ref13.platform = "Freelancer";

        Client c13 = new Client();
        c13.clientId = 113;
        c13.clientName = "Client13";
        c13.project = "Portfolio Website";
        c13.budget = 4500;
        c13.deadline = "9 days";

        ref13.client = c13;
        ref13.getFreelancerDetails();


        Freelancer ref14 = new Freelancer();
        ref14.freelancerId = 14;
        ref14.name = "Freelancer14";
        ref14.skill = "Android";
        ref14.experience = 7;
        ref14.platform = "Upwork";

        Client c14 = new Client();
        c14.clientId = 114;
        c14.clientName = "Client14";
        c14.project = "E-commerce App";
        c14.budget = 15000;
        c14.deadline = "30 days";

        ref14.client = c14;
        ref14.getFreelancerDetails();


        Freelancer ref15 = new Freelancer();
        ref15.freelancerId = 15;
        ref15.name = "Freelancer15";
        ref15.skill = "Data Analysis";
        ref15.experience = 5;
        ref15.platform = "Fiverr";

        Client c15 = new Client();
        c15.clientId = 115;
        c15.clientName = "Client15";
        c15.project = "Business Report";
        c15.budget = 6000;
        c15.deadline = "14 days";

        ref15.client = c15;
        ref15.getFreelancerDetails();


        Freelancer ref16 = new Freelancer();
        ref16.freelancerId = 16;
        ref16.name = "Freelancer16";
        ref16.skill = "Java";
        ref16.experience = 6;
        ref16.platform = "Upwork";

        Client c16 = new Client();
        c16.clientId = 116;
        c16.clientName = "Client16";
        c16.project = "Spring Boot App";
        c16.budget = 13000;
        c16.deadline = "22 days";

        ref16.client = c16;
        ref16.getFreelancerDetails();


        Freelancer ref17 = new Freelancer();
        ref17.freelancerId = 17;
        ref17.name = "Freelancer17";
        ref17.skill = "Python";
        ref17.experience = 3;
        ref17.platform = "Fiverr";

        Client c17 = new Client();
        c17.clientId = 117;
        c17.clientName = "Client17";
        c17.project = "Web Scraping";
        c17.budget = 3000;
        c17.deadline = "6 days";

        ref17.client = c17;
        ref17.getFreelancerDetails();


        Freelancer ref18 = new Freelancer();
        ref18.freelancerId = 18;
        ref18.name = "Freelancer18";
        ref18.skill = "Web Design";
        ref18.experience = 4;
        ref18.platform = "Freelancer";

        Client c18 = new Client();
        c18.clientId = 118;
        c18.clientName = "Client18";
        c18.project = "UI Redesign";
        c18.budget = 4000;
        c18.deadline = "7 days";

        ref18.client = c18;
        ref18.getFreelancerDetails();


        Freelancer ref19 = new Freelancer();
        ref19.freelancerId = 19;
        ref19.name = "Freelancer19";
        ref19.skill = "Android";
        ref19.experience = 8;
        ref19.platform = "Upwork";

        Client c19 = new Client();
        c19.clientId = 119;
        c19.clientName = "Client19";
        c19.project = "Gaming App";
        c19.budget = 20000;
        c19.deadline = "35 days";

        ref19.client = c19;
        ref19.getFreelancerDetails();


        Freelancer ref20 = new Freelancer();
        ref20.freelancerId = 20;
        ref20.name = "Freelancer20";
        ref20.skill = "Data Analysis";
        ref20.experience = 6;
        ref20.platform = "Fiverr";

        Client c20 = new Client();
        c20.clientId = 120;
        c20.clientName = "Client20";
        c20.project = "Analytics Report";
        c20.budget = 7000;
        c20.deadline = "15 days";

        ref20.client = c20;
        ref20.getFreelancerDetails();


        Freelancer ref21 = new Freelancer();
        ref21.freelancerId = 21;
        ref21.name = "Freelancer21";
        ref21.skill = "Java";
        ref21.experience = 7;
        ref21.platform = "Upwork";

        Client c21 = new Client();
        c21.clientId = 121;
        c21.clientName = "Client21";
        c21.project = "Enterprise App";
        c21.budget = 18000;
        c21.deadline = "28 days";

        ref21.client = c21;
        ref21.getFreelancerDetails();


        Freelancer ref22 = new Freelancer();
        ref22.freelancerId = 22;
        ref22.name = "Freelancer22";
        ref22.skill = "Python";
        ref22.experience = 5;
        ref22.platform = "Fiverr";

        Client c22 = new Client();
        c22.clientId = 122;
        c22.clientName = "Client22";
        c22.project = "AI Chatbot";
        c22.budget = 10000;
        c22.deadline = "20 days";

        ref22.client = c22;
        ref22.getFreelancerDetails();


        Freelancer ref23 = new Freelancer();
        ref23.freelancerId = 23;
        ref23.name = "Freelancer23";
        ref23.skill = "Web Design";
        ref23.experience = 6;
        ref23.platform = "Freelancer";

        Client c23 = new Client();
        c23.clientId = 123;
        c23.clientName = "Client23";
        c23.project = "E-commerce UI";
        c23.budget = 5500;
        c23.deadline = "10 days";

        ref23.client = c23;
        ref23.getFreelancerDetails();


        Freelancer ref24 = new Freelancer();
        ref24.freelancerId = 24;
        ref24.name = "Freelancer24";
        ref24.skill = "Android";
        ref24.experience = 9;
        ref24.platform = "Upwork";

        Client c24 = new Client();
        c24.clientId = 124;
        c24.clientName = "Client24";
        c24.project = "Banking App";
        c24.budget = 22000;
        c24.deadline = "40 days";

        ref24.client = c24;
        ref24.getFreelancerDetails();


        Freelancer ref25 = new Freelancer();
        ref25.freelancerId = 25;
        ref25.name = "Freelancer25";
        ref25.skill = "Data Analysis";
        ref25.experience = 4;
        ref25.platform = "Fiverr";

        Client c25 = new Client();
        c25.clientId = 125;
        c25.clientName = "Client25";
        c25.project = "Market Analysis";
        c25.budget = 6500;
        c25.deadline = "12 days";

        ref25.client = c25;
        ref25.getFreelancerDetails();


        Freelancer ref26 = new Freelancer();
        ref26.freelancerId = 26;
        ref26.name = "Freelancer26";
        ref26.skill = "Java";
        ref26.experience = 8;
        ref26.platform = "Upwork";

        Client c26 = new Client();
        c26.clientId = 126;
        c26.clientName = "Client26";
        c26.project = "Cloud App";
        c26.budget = 20000;
        c26.deadline = "30 days";

        ref26.client = c26;
        ref26.getFreelancerDetails();


        Freelancer ref27 = new Freelancer();
        ref27.freelancerId = 27;
        ref27.name = "Freelancer27";
        ref27.skill = "Python";
        ref27.experience = 6;
        ref27.platform = "Fiverr";

        Client c27 = new Client();
        c27.clientId = 127;
        c27.clientName = "Client27";
        c27.project = "Data Pipeline";
        c27.budget = 9000;
        c27.deadline = "18 days";

        ref27.client = c27;
        ref27.getFreelancerDetails();


        Freelancer ref28 = new Freelancer();
        ref28.freelancerId = 28;
        ref28.name = "Freelancer28";
        ref28.skill = "Web Design";
        ref28.experience = 7;
        ref28.platform = "Freelancer";

        Client c28 = new Client();
        c28.clientId = 128;
        c28.clientName = "Client28";
        c28.project = "Dashboard UI";
        c28.budget = 6000;
        c28.deadline = "11 days";

        ref28.client = c28;
        ref28.getFreelancerDetails();


        Freelancer ref29 = new Freelancer();
        ref29.freelancerId = 29;
        ref29.name = "Freelancer29";
        ref29.skill = "Android";
        ref29.experience = 10;
        ref29.platform = "Upwork";

        Client c29 = new Client();
        c29.clientId = 129;
        c29.clientName = "Client29";
        c29.project = "Social App";
        c29.budget = 25000;
        c29.deadline = "45 days";

        ref29.client = c29;
        ref29.getFreelancerDetails();
    }
}