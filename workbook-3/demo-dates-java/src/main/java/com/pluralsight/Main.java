package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

  /*  local date    "7/12/2020"
       local time "10:15:00" local dateTime is "10/20/2020 10:12:00"
   */ // getting todays date
        LocalDate today = LocalDate.now();
        System.out.println("today is: " + today);
        System.out.println("=============");
        // finding time current time adjusts as you run it
        LocalTime currentTime = LocalTime.now();
        System.out.println(" the current time is: " + currentTime);
        System.out.println("=====================");
        // getting date and time using local dateTime
        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println(" right now its: " + rightNow);
        System.out.println("=========================");
        // method for specific day of the week, can do the same process for day of month + year
        System.out.println("day of the week: " + today.getDayOfWeek());
        System.out.println("day of the month: "+ today.getDayOfMonth());
        System.out.println("day of the year: " + today.getDayOfYear());
        // getting day of the month
        System.out.println("this month is: "+ today.getMonth());
        // getting the number value of a month
        System.out.println("month value: " + today.getMonthValue());
        // getting the year and day of year
        System.out.println("this year is: " + today.getYear());
        System.out.println("day of the year is: " + today.getDayOfYear());
        // get hour minute second and nanosecond
        System.out.println("hour: "+ currentTime.getHour());
        System.out.println("minute: " + currentTime.getMinute());
        System.out.println("second: " + currentTime.getSecond());
        System.out.println("nanosecond: " + currentTime.getNano());
        System.out.println("=========================");
        // working with date parts , transforming string date to a local date
        String  userInput = "10/23/2003";
        // use parse method to transform the string
        // make sure to follow the MM/dd/yyyy format
        //using date time formatter to format date / clear error
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("MM/dd/yyyy");
        // plug into newDate
        LocalDate newDate = LocalDate.parse(userInput, dateTimeFormatter);
        System.out.println(newDate);
        System.out.println("======================");
        // transforming date to string
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println("today is: " + currentDate);
        // using date time formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM, dd, yyyy HH:mm:ss");
        // E is the name of the date
        String formattedDate = currentDate.format(formatter);
        System.out.println("today is: " + formattedDate);






    }

}
