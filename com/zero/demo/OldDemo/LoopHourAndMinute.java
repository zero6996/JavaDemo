package com.zero.demo.OldDemo;


public class LoopHourAndMinute {
	public static void main(String[] args) {
		for(int hour = 0; hour < 24; hour++) {
			for(int minute = 0; minute < 60; minute++) {
				for(int sec = 0; sec < 60; sec++) {
					System.out.println(hour + "��" + minute + "��" + sec + "��");
				}
			}
		}
	}
}
