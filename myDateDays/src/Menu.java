/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salesio
 */
public class Menu {
    
    public static void main(String args[]){
    System.out.println("Welcome to my Dates Application");
        DatesInFeb2020 datesFeb = new DatesInFeb2020();
        System.out.println(datesFeb.getDay(datesFeb.getDate()));
    }
    
}
