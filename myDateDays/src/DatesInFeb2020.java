
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salesio
 */
public class DatesInFeb2020 {
    //will use the parent constructor from Object Class
    int getDate(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Date in Feb 2020");
    int enteredDate = input.nextInt();
    return enteredDate;
    }
    String getDay(int date){
        int num = date%7;
        String dayOfWeek=null;
        switch(num){
            case 0:
                dayOfWeek = "Friday";
                break;
            case 1:
                dayOfWeek = "Saturday";
                break;
            case 2:
                dayOfWeek = "Sunday";
                break;
            case 3:
                dayOfWeek = "Monday";
                break;
            case 4:
                dayOfWeek = "Tuesday";
                break;
            case 6:
                dayOfWeek = "Thursday";
                break;
        }
        
        return dayOfWeek;
    
    }
    
}
