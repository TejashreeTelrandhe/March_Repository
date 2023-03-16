package Guru99_Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import net.bytebuddy.utility.RandomString;

public class Extent_Reporter {
	public static ExtentReports extent;

	public static ExtentReports getReportObject() {
		String random = RandomString.make(3);
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		String name = "ExtentReport - " + timestamp;
		String path = System.getProperty(
				"C:\\Users\\Tejashree\\eclipse-workspace\\Framework_Guru99\\Reports\\" + name + "" + random + ".html");

//		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("8March framework results");
		reporter.config().setDocumentTitle("Automation execution result");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Engineer", "Tejashree");
		return extent;

	}
}