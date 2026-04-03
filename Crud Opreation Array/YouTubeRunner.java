class YouTubeRunner {
    public static void main(String[] args) {

        YouTube yt = new YouTube();

        yt.addVideoTitle("Java Tutorial for Beginners");
        yt.addVideoTitle("Python Full Course");
        yt.addVideoTitle("Data Structures Explained");
        yt.addVideoTitle("Spring Boot Crash Course");
        yt.addVideoTitle("React JS Tutorial");
        yt.addVideoTitle("Machine Learning Basics");
        yt.addVideoTitle("Cloud Computing Introduction");
        yt.addVideoTitle("SQL Complete Guide");
        yt.addVideoTitle("Operating System Concepts");
        yt.addVideoTitle("Cyber Security Basics");
        yt.addVideoTitle("HTML & CSS Full Course");
        yt.addVideoTitle("JavaScript Advanced Concepts");
        yt.addVideoTitle("Interview Preparation Tips");
        yt.addVideoTitle("System Design Basics");
        yt.addVideoTitle("AI and Future Tech");

        yt.getVideoTitles();
    }
}