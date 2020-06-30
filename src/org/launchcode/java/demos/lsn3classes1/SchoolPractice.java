package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student josh = new Student("Josh", 8, 1, 4.0);
    }

    public class Course {

        private String courseName;
        private int worthCredits;
        private ArrayList<String> daysOfClass = new ArrayList<>();

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String aCourseName) {
            this.courseName = aCourseName;
        }

        public int getWorthCredits() {
            return worthCredits;
        }

        public void setWorthCredits(int aWorthCredits) {
            this.worthCredits = aWorthCredits;
        }

        public void setDaysOfClass(ArrayList<String> aDaysOfClass) {
            this.daysOfClass = aDaysOfClass;
        }

        public ArrayList<String> getDaysOfClass() {
            return daysOfClass;
        }
    }

    public class Teacher {

        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public String getFirstName(){
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getYearsTeaching() {
            return yearsTeaching;
        }

        public void setYearsTeaching(int yearsTeaching) {
            this.yearsTeaching = yearsTeaching;
        }
    }

}


