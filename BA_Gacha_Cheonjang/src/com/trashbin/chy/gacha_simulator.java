package com.trashbin.chy;

import java.util.Scanner;

public class gacha_simulator {
	public static void main(String[] args) {
		// 픽업 0.7
		// 픽뚫 2.3
		// 그 외 97
		Scanner sc = new Scanner(System.in);

		int setting_num = 0;
		int pick_up = 0;
		int pick_ddull = 0;
		int etc = 0;
		int mode = 0;
		int gacha_pu = 0;
		int gacha_pd = 0;

		System.out.print("페스 뽑기 : 1, 일반 뽑기 : 2를 입력하세요 : ");
		mode = sc.nextInt();
		switch (mode) {
		case 1:
			gacha_pu = 7;
			gacha_pd = 60;
		case 2:
			gacha_pu = 7;
			gacha_pd = 30;
		}
		System.out.print("뽑기 횟수를 입력하세요(10회 단위) : ");
		setting_num = sc.nextInt();
		for (int i = 0; i < setting_num; i++) {
			double gacha = Math.random() * 1000;
			if (gacha < gacha_pu) {
				pick_up++;
			} else if (gacha >= gacha_pu && gacha < gacha_pd) {
				pick_ddull++;
			} else {
				etc++;
			}
		}

		System.out.println("총 뽑기 횟수 : " + setting_num);
		System.out.println("픽업 횟수 : " + pick_up);
		System.out.println("픽뚫 횟수 : " + pick_ddull);
		System.out.println("그 외 횟수 : " + etc);
	}
}
