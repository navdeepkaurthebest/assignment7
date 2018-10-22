
package assignment13;
import java.util.Scanner;


public class Assignment13 {

    
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        
        int markCount;
        
        System.out.print("How many marks for this student?");
        markCount=keyboard.nextInt();
        
        int[] marks = new int[markCount];
        int i;
        
        for(i=0; i<markCount; i++) {
             
            System.out.print("please enter mark "+(i+1) +": ");
            marks[i]=keyboard.nextInt();
        }
            
        double average;
        double sum=0;
        
        System.out.print("The marks are = ");
        
        for(i=0; i<markCount; i++) {
            sum =sum+marks[i];
            System.out.print(marks[i]);
            if(i<(markCount-1)){
                System.out.print(",");
            }
        }
        average=sum / markCount;
        System.out.println("");
        System.out.println("the average is = "+average);
    }
}
