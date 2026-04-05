class YouTubeRunner {
    public static void main(String[] args) {

        YouTube yt = new YouTube();

        boolean added;

        added = yt.addVideoTitle("Java Tutorial for Beginners");
        System.out.println(added);
        added = yt.addVideoTitle("Python Full Course");
        System.out.println(added);
        added = yt.addVideoTitle("Data Structures Explained");
        System.out.println(added);
        added = yt.addVideoTitle("Spring Boot Crash Course");
        System.out.println(added);
        added = yt.addVideoTitle("React JS Tutorial");
        System.out.println(added);
        added = yt.addVideoTitle("Machine Learning Basics");
        System.out.println(added);
        added = yt.addVideoTitle("Cloud Computing Introduction");
        System.out.println(added);
        added = yt.addVideoTitle("SQL Complete Guide");
        System.out.println(added);
        added = yt.addVideoTitle("Operating System Concepts");
        System.out.println(added);
        added = yt.addVideoTitle("Cyber Security Basics");
        System.out.println(added);
        added = yt.addVideoTitle("HTML & CSS Full Course");
        System.out.println(added);
        added = yt.addVideoTitle("JavaScript Advanced Concepts");
        System.out.println(added);
        added = yt.addVideoTitle("Interview Preparation Tips");
        System.out.println(added);
        added = yt.addVideoTitle("System Design Basics");
        System.out.println(added);
        added = yt.addVideoTitle("AI and Future Tech");
        System.out.println(added);

        yt.getVideoTitles();

        String name = yt.getVideoTitleByName("React JS Tutorial");
        System.out.println(name + " is available");

        boolean updated = yt.updateVideoTitle("Python Full Course", "Python Masterclass");
        System.out.println(updated);

        yt.getVideoTitles();

        boolean deleted = yt.deleteVideoTitle("Cyber Security Basics");
        System.out.println(deleted);

        yt.getVideoTitles();
    }
}