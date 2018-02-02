package com.jocata.Runtest;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Listeners;

import com.jocata.ssp.testcases.Tc_02Links;
import com.jocata.ssp.testcases.Tc_03ClickAPIs;
import com.jocata.ssp.testcases.Tc_04FillContcatjocata;
import com.jocata.ssp.testcases.Tc_05FilteringAPIs;
import com.jocata.ssp.testcases.Tc_06FAQ;
import com.jocata.ssp.testcases.Tc_07Profile;
import com.jocata.ssp.testcases.Tc_08HomeLinks;
import com.jocata.ssp.testcases.Tc_09Dashboarddatepicker;

@Listeners(com.jocata.ssp.customListner.ListenerTest.class)

public class RunSSPTestCases {

	public static void main(String[] args) {

		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		Class[] classes = new Class[] {

				/*Tc_02Links.class,

				Tc_03ClickAPIs.class,

				Tc_04FillContcatjocata.class,

				Tc_05FilteringAPIs.class,

				Tc_06FAQ.class,

				Tc_07Profile.class,*/

				Tc_08HomeLinks.class,

				//Tc_09Dashboarddatepicker.class,

		};
		testng.setTestClasses(classes);
		testng.addListener(tla);
		testng.run();
	}

}
