package com.javalec.base;

import java.util.ArrayList;

public class Function {


		
		//field
		
		static String totalNum = ""; //
		static String i;             //
		static String firstNum = "";
		static String action = "";
		static String result = "";
		static String firstNumToCalc = "";
//		ArrayList<String> numbers = new ArrayList<String>();
	
		
		//constructor
		public Function() {    //
			
		}
		
		//method
		public void numberInsert (String num) {  //
			totalNum += num;
		}
//		
		public void resultActor () {
			int num1 = Integer.parseInt(firstNumToCalc);
			int num2 = Integer.parseInt(totalNum);
			result = Integer.toString(num1+num2);
		}
				
		
		
		
		
}		
		

