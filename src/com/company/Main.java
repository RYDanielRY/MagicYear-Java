package com.company;

public class Main
{
    public static void main(String[] args)
    {
        for (int year = 1900; year <= 1999; year++) {
            for (int month = 1; month <= 12; month++) {
                switch (month){
                    case 9:
                    case 4:
                    case 11:
                    case 6:
                        MagicYear(30,month,year);
                    break;
                    case 2:
                        if (year / 4 == 0) {
                            MagicYear(28,month,year);
                        } else {
                            MagicYear(29,month,year);
                        }
                    break;
                    default:
                        MagicYear(31,month,year);
                    break;
                }
            }
        }

    }

    public static void MagicYear(int day, int month, int year) {
        var shotYear = year % 100;
        for (int i = 1; i <= day; i++) {
            if (i*month == shotYear) {
                System.out.println(i+"."+month+"."+year);
            }
        }
    }
}
