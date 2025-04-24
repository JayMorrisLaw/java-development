package com.pluralsight;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DatesExercise {
    public static void main(String[] args) {
        // using date time formatter to format the date into the mm/dd/yyyy format
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String formattedDate1 = now.format(formatter1);
        System.out.println(formattedDate1);
        System.out.println("==========");

        LocalTime rightNow = LocalTime.now();
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println("===============");

        System.out.print(today.getMonth() + " ");
        System.out.print(today.getDayOfMonth() + ", ");
        System.out.print(today.getYear());
        System.out.println("\n==============");

        System.out.print(today.getDayOfWeek() + ", ");
        System.out.print(today.getMonth() + " ");
        System.out.print(today.getDayOfMonth() + ", ");
        System.out.print(today.getYear() +" " + rightNow);
        System.out.println("\n==================");
        // method for formatting time using time zone
        Date date = new Date();
        SimpleDateFormat requiredFormat = new SimpleDateFormat("EEEE, MMM d, yyyy HH:mm 'in GMT' ");
        requiredFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String getTime = requiredFormat.format(date);
        System.out.println(getTime);








    }
}
