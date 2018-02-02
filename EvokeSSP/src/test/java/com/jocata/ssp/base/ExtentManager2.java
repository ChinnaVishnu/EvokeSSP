package com.jocata.ssp.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager2 {

	public static ExtentReports extent;

	/*
	 * final static String filePath =
	 * System.getProperty("user.dir")+"\\test-output\\ExtentScreenshot.html";
	 * 
	 * public synchronized static ExtentReports getReporter() { if (extent ==
	 * null) { extent = new ExtentReports(filePath, true); }
	 * 
	 * return extent; }
	 */

	static Calendar calendar = Calendar.getInstance();

	static SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

	// static String dateTimeString = new
	// SimpleDateFormat("MMddhhmmss").format(new Date());

	static String path = System.getProperty("user.dir");

	public synchronized static ExtentReports getReporter() {

		if (extent == null) {
			extent = new ExtentReports(
					path + "/Reports/Automation_Report " + formater.format(calendar.getTime()) + " .html", false,
					DisplayOrder.NEWEST_FIRST);

		}
		return extent;

	}

	/*
	 * public synchronized static ExtentReports getReporter() { return extent; }
	 */

}
