package com.company;

public class PersonalDataOperation {
    public static void main(String[] args) {
//        TODO 5 students are created. Let one of them has the ID 5005.
        student student = new student("Enes Kara",5001,3.50,(new PersonalData(1990,03,18,15002119)));
        student student2 = new student("Şahin Demir",5002,2.50,(new PersonalData(1993,07,15,18667893)));
        student student3 = new student("Canberk Dönmez",5003,3.80,(new PersonalData(1995,05,01,1388429)));
        student student4 = new student("Ekin Küçükakyüz",5004,2.71,(new PersonalData(1997,03,20,18673499)));
        student student5 = new student("Umar Beyoğlu",5005,2.90,(new PersonalData(1999,01,26,15679874)));

        // TODO A course (let us call it K129) with a capacity of 3 is created
        Course course = new Course("K129",3);
        // TODO Any 4 of the students is added to K129.
        course.addStudent(student);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
        // TODO All students of K129 are printed on the screen.
        course.list();
        // TODO The capacity of K129 is increased.
        course.increaseCapacity();
        // TODO Remaining 2 students are added to K129.
        course.addStudent(student);
        course.addStudent(student2);
        // TODO All students of K129 are printed on the screen.
        course.list();
        // TODO  Student with ID 5005 is dropped from K129.
        course.dropStudent(student5);
        // TODO All students of K130 are printed on the screen.
        course.list();
        System.out.println(course.getNumberOfStudent());
        System.out.println(course.getBestStudent().getData().getDateOfBirth().getYear());
        Course course2=new Course("K130");
        for(int i=0;i<course.getNumberOfStudent();i++) {
            course2.addStudent(course.getStudents()[i]);
        }
        course.clearStudent();
        course.list();
        System.out.println();
        course2.list();
        course2.dropStudent(course2.getBestStudent());
        course2.list();
        System.out.println("Youngest student in class : "+course2.getYoungestStudent().getGpa());
    }

}
