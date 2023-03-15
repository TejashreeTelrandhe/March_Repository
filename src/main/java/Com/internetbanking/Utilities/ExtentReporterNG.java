package Com.internetbanking.Utilities;


import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import net.bytebuddy.utility.RandomString;

public class ExtentReporterNG {

	static ExtentReports extent;

	public static ExtentReports getReportObject() {
		String Random = RandomString.make(5);
		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String Name = "ExtentReport -" + Timestamp;
		String path = System.getProperty("C:\\Installer\\eclipse-workspace\\Demo9July\\reports\\" + Name + "" + ".html");
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		reporter.config().setReportName("9July Framework Results");
		reporter.config().setDocumentTitle("Automation Execution Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Automation Engineer", "Tejashree Telrandhe");
		return extent;

	}

}
