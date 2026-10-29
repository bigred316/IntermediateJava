package Q1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Student{
    private int[] testGrades;
    private String fName;
    private String lName;
    
    public Student(String f, String l, int[] t){
        testGrades = t;
        fName = f;
        lName = l;
    }

    public String calcAvg(){
        double sum = 0.0;
        for(int i = 0; i< testGrades.length; i++){
            sum+=testGrades[i];
        }
        sum /= testGrades.length;
        if (sum >=90) return sum + "%  A";
        else if (sum >=80) return sum + "%  B";
        else if (sum >=70) return sum + "%  C";
        else if (sum >=60) return sum + "%  D";
        else return sum + "%  F";
    }

    public int getGrade(int index){
        return testGrades[index];
    }

    public String fullName(){
        return fName + " " + lName;
    }

    public String toString(){
        return this.fullName() +"\t\t"+ testGrades[0]+ "\t" + testGrades[1]+ "\t"
        + testGrades[2]+ "\t" + testGrades[3]+ "\t" + testGrades[4] + "\t\t" + this.calcAvg();
    }
}

public class prog505b {
      public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/prog505b.dat"));
            Student[] students = new Student[3];
            for(int i = 0; i<3; i++) {
                String f = file.nextLine();
                String l = file.nextLine();
                int[] scores = new int[5];
                for(int ii = 0; ii<5; ii++) scores[ii]= file.nextInt(); file.nextLine(); 
                Student stu = new Student(f, l, scores);
                students[i] = stu;
            }
            file.close();
            System.out.println(students[0]);
            System.out.println(students[1]);
            System.out.println(students[2]);

            System.out.println("Test 1 Average: "+ 
            (students[0].getGrade(0)+students[1].getGrade(0)+students[2].getGrade(0))/3.0);
            System.out.println("Test 2 Average: "+ 
            (students[0].getGrade(1)+students[1].getGrade(1)+students[2].getGrade(1))/3.0);
            System.out.println("Test 3 Average: "+ 
            (students[0].getGrade(2)+students[1].getGrade(2)+students[2].getGrade(2))/3.0);
            System.out.println("Test 4 Average: "+ 
            (students[0].getGrade(3)+students[1].getGrade(3)+students[2].getGrade(3))/3.0);
            System.out.println("Test 5 Average: "+ 
            (students[0].getGrade(4)+students[1].getGrade(4)+students[2].getGrade(4))/3.0);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        

    }
}

// Sam Lilly               80      77      82      86      90              83.0%  B
// Fred Biggie             70      72      88      90      93              82.6%  B
// Sally Awesome           92      91      85      99      93              92.0%  A
// Test 1 Average: 80.66666666666667
// Test 2 Average: 80.0
// Test 3 Average: 85.0
// Test 4 Average: 91.66666666666667
// Test 5 Average: 92.0