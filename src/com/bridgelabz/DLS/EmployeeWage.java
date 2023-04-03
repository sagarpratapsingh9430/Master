package com.bridgelabz.DLS;

public class EmployeeWage {
    static final int FULL_DAY_HOUR=8;
    static final int PART_DAY_HOURS=4;
    static final int WAGE_PER_HOUR=20;
    static final int TOTAL_WORKING_DAYS=20;
    static final int TOTAL_WORKING_HOURS=100;
    public static void main(String[] args) {

        int totalWage=0;
        int workingHours=0;
        int day=1;

       // int isPresent=(int) (Math.random()*10%2); //It gives 0 or 1
        while (day<=TOTAL_WORKING_DAYS && workingHours<=TOTAL_WORKING_HOURS) {
            int isPresent = (int) (Math.random() * 10 % 3);  // It gives 0,1 or 2

            switch (isPresent) {
                case 1:
                    totalWage = FULL_DAY_HOUR * WAGE_PER_HOUR;
                    System.out.println("Full time");
                    workingHours += FULL_DAY_HOUR;
                    break;
                case 2:
                    totalWage = PART_DAY_HOURS * WAGE_PER_HOUR;
                    System.out.println("Part time");
                    workingHours += PART_DAY_HOURS;
                    break;
                default:
                    System.out.println("Absent");
            }

            System.out.println(workingHours);
            System.out.println(totalWage);
            System.out.println(day);
            day++;
        }
        System.out.println(totalWage);
    }
}
