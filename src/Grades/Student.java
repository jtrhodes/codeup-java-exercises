package Grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade : this.grades){
            sum += grade;
        }
        return sum / grades.size();
    }

    public static void main(String[] args) {
        Student tommy = new Student("Tommy");
        tommy.addGrade(98);
        tommy.addGrade(76);
        tommy.addGrade(59);
        tommy.addGrade(89);
        System.out.println(tommy.grades);
        System.out.println(tommy.getGradeAverage());
//        calculateAverage(tommy.grades);
}

}
