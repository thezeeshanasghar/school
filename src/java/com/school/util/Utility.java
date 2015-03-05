/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Zeeshan
 */
public class Utility {

    public static Date randomDOB() {

        int yyyy = random(1991, 2000);
        int mm = random(1, 12);
        int dd = 0; // will set it later depending on year and month

        switch (mm) {
            case 2:
                if (isLeapYear(yyyy)) {
                    dd = random(1, 29);
                } else {
                    dd = random(1, 28);
                }
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dd = random(1, 31);
                break;

            default:
                dd = random(1, 30);
                break;
        }

        String year = Integer.toString(yyyy);
        String month = Integer.toString(mm);
        String day = Integer.toString(dd);

        if (mm < 10) {
            month = "0" + mm;
        }

        if (dd < 10) {
            day = "0" + dd;
        }
        //        return day + '/' + month + '/' + year;
        GregorianCalendar calendar = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        Date date = calendar.getTime();
        return date;
    }

    public static int random(int lowerBound, int upperBound) {
        return (lowerBound + (int) Math.round(Math.random()
                * (upperBound - lowerBound)));
    }

    private static boolean isLeapYear(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        int noOfDays = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);

        if (noOfDays > 365) {
            return true;
        }

        return false;
    }
}
