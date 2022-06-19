package com.ahmad;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

/**
 * 18 Jun 2022
 * @author Bashir Ahmad
 */
public class DateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();
        
        System.out.println(dd + "..." + mm +"..." + yyyy);
        System.out.printf("%d-%d-%d",dd, mm, yyyy);
        
        LocalTime time = LocalTime.now();
        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();
        System.out.printf("\n%d:%d:%d:%d\n",h, m, s, n);
        
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        
        LocalDateTime dt1 = LocalDateTime.of(1998, 05, 24, 4, 30);
        System.out.println(dt1);
        
        System.out.println("After Nine months: "+dt1.plusMonths(9));
        System.out.println("Befor Nine months: "+dt1.minusMonths(9));
        
        LocalDate birthday = LocalDate.of(1998,5,24);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birthday, today);
        System.out.printf("Age is %d Years %d Months %d Days",p.getYears(), p.getMonths(), p.getDays());
        
        
    }
}
