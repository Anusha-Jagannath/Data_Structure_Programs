package com.datastructure;

import java.util.Scanner;

public class CalendarQueue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year, month;
		boolean isLeapYear;
		int days;
		int day;
		int[] daysPerYear = { 31, 28, 30, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("Enter month");
		month = scanner.nextInt();
		if (month > 0 && month <= 12) {
			System.out.println("Enter year");
			year = scanner.nextInt();
			if (year > 1582 && year < 9999) {
				isLeapYear = DataStructureQueue.isLeapYear(year);
				if (isLeapYear && month == 2) {
					days = 29;
					day = DataStructureQueue.calculateDayOfWeek(1, month, year);
					DataStructureQueue.printCalendarUsingQueue(day, days);

				} else {
					days = daysPerYear[month - 1];
					day = DataStructureUtility.calculateDayOfWeek(1, month, year);
					DataStructureUtility.printCalendarUsingQueue(day, days);
				}
			} else
				System.out.println("please enter valid year");
		} else
			System.out.println("Please enter valid month");

		scanner.close();
	}

}