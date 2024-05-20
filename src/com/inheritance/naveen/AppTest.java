package com.inheritance.naveen;

public class AppTest {

	public static void main(String[] args) {

		WEO w = new WEO();
		w.feeStructure();
		w.guidelines();
		w.infrastructure();

		University uni = new University();
		uni.feeStructure();//overridden from WEO
		uni.guidelines();//inherited
		uni.infrastructure();//inherited
		uni.codeOfConduct();//individual
		uni.courseList();//individual

		IIT iit = new IIT();
		iit.feeStructure();//inherited - from University
		iit.guidelines();//inherited - from WEO
		iit.infrastructure();//inherited - from WEO
		iit.codeOfConduct();//overridden - from WEO
		iit.courseList();//inherited from - University
		iit.electrical();//individual
		iit.mechanical();//individual

		IIM iim = new IIM();
		iim.feeStructure();//inherited from University
		iim.guidelines();//overridden
		iim.infrastructure();//inherited from WEO
		iim.codeOfConduct();//inherited from University
		iim.courseList();//inherited from University
		iim.engineering();//individual

		Xaviers xv = new Xaviers();
		xv.feeStructure();//inherited from University
		xv.guidelines();//inherited from WEO
		xv.infrastructure();//overridden
		xv.codeOfConduct();//inherited from University
		xv.courseList();//inherited from University
		xv.bioChemistry();
		xv.bioTechnology();

		Institute ins = new Institute();
		ins.feeStructure();//overridden - Institute
		ins.guidelines();//inherited from WEO
		ins.infrastructure();//overridden - Institute
		ins.courses();//individual



	}

}
