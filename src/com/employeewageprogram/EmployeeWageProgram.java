package com.employeewageprogram;

public class EmployeeWageProgram {
	public static int empAttendance = (int) (Math.floor(Math.random() * 10) % 3);
	public static final int WAGE_PER_HOUR = 20;
	public static final int FULL_TIME_HOUR = 8;
	public static final int PART_TIME_HOUR = 4;
	public static final int MONTHLY_WORKING_DAYS = 20;
	public static int dailyWage;
	public static int monthlyWage = 0;
	public static int dailyHours;
	public static int totalHours = 0;
	public static int totalAttendance = 0;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Program!!");
		attendanceWageCalculation();
	}

	public static void attendanceWageCalculation() {
		while (totalHours <=100 && totalAttendance <=20) {
			int empAttendance = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empAttendance) {
			case (0):
				dailyWage = 0;
				System.out.println("Employee is absent today. Total wage is " + dailyWage);
				break;
			case (1):
				dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
				dailyHours = 4;
				System.out.println("Employee is present part time today. Total wage is " + dailyWage);
				break;
			default:
				dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
				dailyHours = 8;
				System.out.println("Employee is present full time today. Total wage is " + dailyWage);
				break;

			}
			totalAttendance++;
			monthlyWage += dailyWage;
			totalHours += dailyHours;
		}

		System.out.println(monthlyWage);
	}
}
