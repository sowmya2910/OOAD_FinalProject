/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* Class enabling table management
*/

package com.OOAD.login;

import org.springframework.stereotype.Controller;

@Controller
public class TableManagement {
	
	static int flag1;
	static int flag2;
	static int flag3;
	static int flag4;
	static int flag5;
	static int flag6;
	
	public int getFlag1() {
		return flag1;
	}
	public int setFlag1(int flag) {
		this.flag1 = flag;
		return 0;
	}
	
	public int getFlag2() {
		return flag2;
	}
	public int setFlag2(int flag) {
		this.flag2 = flag;
		return 0;
	}
	public static int getFlag3() {
		return flag3;
	}
	public int setFlag3(int flag3) {
		TableManagement.flag3 = flag3;
		return 0;
	}
	public int getFlag4() {
		return flag4;
	}
	public int setFlag4(int flag4) {
		TableManagement.flag4 = flag4;
		return 0;
	}
	public int getFlag5() {
		return flag5;
	}
	public int setFlag5(int flag5) {
		TableManagement.flag5 = flag5;
		return 0;
	}
	public int getFlag6() {
		return flag6;
	}
	public int setFlag6(int flag6) {
		TableManagement.flag6 = flag6;
		return 0;
	}


}
