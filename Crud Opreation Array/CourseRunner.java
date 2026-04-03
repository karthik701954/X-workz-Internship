class CourseRunner {
    public static void main(String[] args) {

        Course course = new Course();

        course.addTechnology("Java");
        course.addTechnology("Python");
        course.addTechnology("C");
        course.addTechnology("C++");
        course.addTechnology("JavaScript");
        course.addTechnology("HTML");
        course.addTechnology("CSS");
        course.addTechnology("React");
        course.addTechnology("Angular");
        course.addTechnology("Node.js");
        course.addTechnology("Spring Boot");
        course.addTechnology("Django");
        course.addTechnology("Machine Learning");
        course.addTechnology("Data Science");
        course.addTechnology("Cloud Computing");

        course.getTechnologies();
    }
}