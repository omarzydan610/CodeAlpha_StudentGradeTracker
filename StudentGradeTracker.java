import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class StudentGradeTracker {
    public static void main(String[] args) {
        String reset = "\u001B[0m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String blue = "\u001B[34m";

        Scanner sc=new Scanner(System.in);
        System.out.print(green+"Enter number of students : "+reset);
        int n=sc.nextInt();
        System.err.println();
        int[]students=new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            System.out.print(blue+"Enter student "+(i+1)+" grade : "+reset);
            students[i]=sc.nextInt();
            while(students[i]<0){
                System.out.print(red+"Invalid Grade"+reset);
                System.out.print(blue+"   Enter student "+(i+1)+" grade : "+reset);
                students[i]=sc.nextInt();
            }
            sum+=students[i];
        }

        Arrays.sort(students);
        int min=students[0];
        int max=students[n-1];

        DecimalFormat df = new DecimalFormat("#.##");
        double avg=(double)sum/n;
        String formattedAvg = df.format(avg);

        System.out.print(yellow+"\nAvrage = "+reset+formattedAvg);
        System.out.print(green+"   Highest score = "+reset+max);
        System.out.println(red+"   Lowest score = "+reset+min);
        
        sc.close();
    }
}
