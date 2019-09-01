package LabTasks;

public class GraduateStudent extends Student {
    public GraduateStudent() {

    }

    public void computeGrade() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 2; j++) {
                if (((Integer.parseInt(names[i][j])) > 70) && ((Integer.parseInt(names[i][j])) < 100)) {
                    System.out.println(names[i][j - 1] + " is Pass");
                } else if (((Integer.parseInt(names[i][j])) < 70)) {
                    System.out.println(names[i][j - 1] + " is Fail");
                } else {
                    System.out.println("error: score isn't in the range");
                }

            }
        }
    }
}