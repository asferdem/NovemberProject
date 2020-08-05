package day_38JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(95,100,85,80,75,70,60,50,55,65,40,45,93,77,67,93,83,86));

        System.out.println(list);


        ArrayList<Integer> gradeA=new ArrayList<>();//90~100
        gradeA.addAll(list);
        gradeA.removeIf(p-> p<90);
        System.out.println("Grade A: "+gradeA);

        ArrayList<Integer> gradeB=new ArrayList<>();// 80~89
        gradeB.addAll(list);
        gradeB.removeIf(each-> each<80 || each>89);
        System.out.println("Grade B: "+gradeB);

        ArrayList<Integer> gradeC=new ArrayList<>();//70~79
        gradeC.addAll(list);
        gradeC.removeIf(each-> each<70 || each>79);
        System.out.println("Grade C: "+gradeC);

        ArrayList<Integer> gradeD=new ArrayList<>();//60~69
        gradeD.addAll(list);
        gradeD.removeIf(each-> each<60 || each>69);
        System.out.println("Grade D: "+gradeD);

        ArrayList<Integer> gradeF=new ArrayList<>();//0~59
        gradeF.addAll(list);
        gradeF.removeAll(gradeA);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
        //gradeA.removeIf(p-> p>59);
        System.out.println("Grade F: "+gradeF);











    }
}
