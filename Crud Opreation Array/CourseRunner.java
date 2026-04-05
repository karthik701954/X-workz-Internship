class CourseRunner {
    public static void main(String[] args) {

        Course course = new Course();

        boolean added = course.addTechnology("Java");
        System.out.println(added);
        added = course.addTechnology("Python");
        System.out.println(added);
        added = course.addTechnology("C");
        System.out.println(added);
        added = course.addTechnology("C++");
        System.out.println(added);
        added = course.addTechnology("JavaScript");
        System.out.println(added);
        added = course.addTechnology("HTML");
        System.out.println(added);
        added = course.addTechnology("CSS");
        System.out.println(added);
        added = course.addTechnology("React");
        System.out.println(added);
        added = course.addTechnology("Angular");
        System.out.println(added);
        added = course.addTechnology("Node.js");
        System.out.println(added);
        added = course.addTechnology("Spring Boot");
        System.out.println(added);
        added = course.addTechnology("Django");
        System.out.println(added);
        added = course.addTechnology("Machine Learning");
        System.out.println(added);
        added = course.addTechnology("Data Science");
        System.out.println(added);
        added = course.addTechnology("Cloud Computing");
        System.out.println(added);

        course.getTechnologies();

        String name = course.getTechnologyByName("Java");
        System.out.println(name + " is available");

        boolean updated = course.updateTechnologyName("C", "C Programming");
        System.out.println(updated);

        course.getTechnologies();

        boolean deleted = course.deleteTechnology("HTML");
        System.out.println(deleted);

        course.getTechnologies();
    }
}