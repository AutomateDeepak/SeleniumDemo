package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReporter {
	
static ExtentReports extentReport;
	
	public static  ExtentReports getExtentReport()
	{
		String extentReportPath = System.getProperty("user.dir")+"\\reports\\extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("My Automation report");
		reporter.config().setDocumentTitle("Test Result");
		
		
		extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);
		extentReport.setSystemInfo("Operating System", "Winodw 10");
		extentReport.setSystemInfo("Tested By", "Deepak");
	
		
		return  extentReport;
	
	}

}
