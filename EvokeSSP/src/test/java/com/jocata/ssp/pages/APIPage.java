package com.jocata.ssp.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jocata.ssp.base.ExtentTestManager;
import com.jocata.ssp.base.GetScreenshort;
import com.jocata.ssp.loggers.LoggerHelper;
import com.jocata.ssp.testcases.Tc_03ClickAPIs;
import com.relevantcodes.extentreports.LogStatus;

public class APIPage {

	private final Logger log = LoggerHelper.getLogger(APIPage.class);

	public WebDriver driver;

	public APIPage(WebDriver driver) {
		super();

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'APIs')]")
	WebElement APIS;

	@FindBy(xpath = "//span[contains(text(),'Aadhaar')]")
	WebElement Aadhaar;

	@FindBy(xpath = "//span[contains(text(),'Aadhaar Download')]")
	WebElement AadhaarDownload;

	@FindBy(xpath = "//span[contains(text(),'Aadhaar OTP	')]")
	WebElement AadhaarOTP;

	@FindBy(xpath = "//span[contains(text(),'Aadhaar Upload')]")
	WebElement AadhaarUpload;

	@FindBy(xpath = "//span[contains(text(),'Adverse News')]")
	WebElement AdverseNews;

	@FindBy(xpath = "//span[contains(text(),'BSNL')]")
	WebElement BSNL;

	@FindBy(xpath = "//span[contains(text(),'Bank Statement')]")
	WebElement BankStatement;

	@FindBy(xpath = "//span[contains(text(),'CIBIL Suit Filed Cases')]")
	WebElement CIBILSuitFiledCases;

	@FindBy(xpath = "//span[contains(text(),'CRILC*')]")
	WebElement CRILC;

	@FindBy(xpath = "//span[contains(text(),'CST')]")
	WebElement CST;

	@FindBy(xpath = "//span[contains(text(),'Chartered Accountants')]")
	WebElement CharteredAccountants;

	@FindBy(xpath = "//span[contains(text(),'Company Secretaries')]")
	WebElement CompanySecretaries;

	@FindBy(xpath = "//span[contains(text(),'Cost Accountants')]")
	WebElement CostAccountants;

	@FindBy(xpath = "//span[contains(text(),'Council of Architecture')]")
	WebElement CouncilofArchitecture;

	@FindBy(xpath = "//span[contains(text(),'Doctors')]")
	WebElement Doctors;

	@FindBy(xpath = "//span[contains(text(),'Driving License')]")
	WebElement DrivingLicense;

	@FindBy(xpath = "//span[contains(text(),'Driving License National')]")
	WebElement DrivingLicenseNational;

	@FindBy(xpath = "//span[contains(text(),'EPF Company View')]")
	WebElement EPFCompanyView;

	@FindBy(xpath = "//span[contains(text(),'EPFO*')]")
	WebElement EPFO;

	@FindBy(xpath = "//span[contains(text(),'Electricity')]")
	WebElement Electricity;

	@FindBy(xpath = "//span[contains(text(),'Email')]")
	WebElement Email;

	@FindBy(xpath = "//span[contains(text(),'Excise Tax')]")
	WebElement ExciseTax;

	@FindBy(xpath = "//span[contains(text(),'Facebook*')]")
	WebElement Facebook;

	@FindBy(xpath = "//span[contains(text(),'GST')]")
	WebElement GST;

	@FindBy(xpath = "//span[contains(text(),'IEC')]")
	WebElement IEC;

	@FindBy(xpath = "//span[contains(text(),'ITR*')]")
	WebElement ITR;

	@FindBy(xpath = "//span[contains(text(),'ITR Ack*')]")
	WebElement ITRAck;

	@FindBy(xpath = "//span[contains(text(),'ITR Upload')]")
	WebElement ITRUpload;

	@FindBy(xpath = "//span[contains(text(),'LPG')]")
	WebElement LPG;

	@FindBy(xpath = "//span[contains(text(),'Linkedin*')]")
	WebElement Linkedin;

	@FindBy(xpath = "//span[contains(text(),'List Matching')]")
	WebElement ListMatching;

	@FindBy(xpath = "//span[contains(text(),'MCA (CIN)')]")
	WebElement MCACIN;

	@FindBy(xpath = "//span[contains(text(),'MCA (Company Master)')]")
	WebElement MCACompanyMaster;

	@FindBy(xpath = "//span[contains(text(),'MCA (DIN)*')]")
	WebElement MCADIN;

	@FindBy(xpath = "//span[contains(text(),'MCA (Signatory Details)')]")
	WebElement MCASignatoryDetails;

	@FindBy(xpath = "//span[contains(text(),'PAN*')]")
	WebElement PAN;

	@FindBy(xpath = "//span[contains(text(),'Pincode')]")
	WebElement Pincode;

	@FindBy(xpath = "//span[contains(text(),'Property Tax')]")
	WebElement PropertyTax;

	@FindBy(xpath = "//span[contains(text(),'Service Tax*')]")
	WebElement ServiceTax;

	@FindBy(xpath = "//span[contains(text(),'Service Tax Number')]")
	WebElement ServiceTaxNumber;

	@FindBy(xpath = "//span[contains(text(),'Shop Act')]")
	WebElement ShopAct;

	@FindBy(xpath = "//span[contains(text(),'TDS Form-16')]")
	WebElement TDSForm16;

	@FindBy(xpath = "//span[contains(text(),'TDS Form-26')]")
	WebElement TDSForm26;

	@FindBy(xpath = "//span[contains(text(),'TIN')]")
	WebElement TIN;

	@FindBy(xpath = "//span[contains(text(),'Udyog Aadhaar')]")
	WebElement UdyogAadhaar;

	@FindBy(xpath = "//span[contains(text(),'Vehicle Registration Details')]")
	WebElement VehicleRegistrationDetails;

	@FindBy(xpath = "//span[contains(text(),'Vehicle Registration Status')]")
	WebElement VehicleRegistrationStatus;

	@FindBy(xpath = "//span[contains(text(),'Voter Id')]")
	WebElement VoterId;

	@FindBy(xpath = "//span[contains(text(),'Water Bill')]")
	WebElement WaterBill;

	public void clickonAPIs() throws InterruptedException {

		// log.info("clicked on Api's...");

		/*
		 * APIS.click(); Aadhaar.click();
		 */

		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		Aadhaar.click();
		ExtentTestManager.getTest().log(LogStatus.INFO, " Aadhaar");

		String screenAadhar = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenAadhar));
		Thread.sleep(3000);
		APIS.click();
		AadhaarDownload.click();
		String screenAadhaarDownload = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenAadhaarDownload));
		Thread.sleep(3000);

		APIS.click();
		AadhaarOTP.click();
		String screenAadhaarOTP = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenAadhaarOTP));
		Thread.sleep(3000);
		APIS.click();

		AadhaarUpload.click();

		String screenAadhaarUpload = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenAadhaarUpload));

		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		AdverseNews.click();
		String screenAdverseNews = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenAdverseNews));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		BSNL.click();
		String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));

		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		BankStatement.click();

		String screenBankStatement = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBankStatement));
		Thread.sleep(3000);
		APIS.click();

		Thread.sleep(3000);
		CIBILSuitFiledCases.click();

		String scCIBILSuitFiledCases = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCIBILSuitFiledCases));
		Thread.sleep(3000);
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		CRILC.click();
		String scCRILC = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCRILC));

		Thread.sleep(3000);
		APIS.click();

		Thread.sleep(3000);
		CST.click();

		String scCCSTC = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCCSTC));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		CharteredAccountants.click();

		String scCharteredAccountants = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCharteredAccountants));
		Thread.sleep(3000);
		APIS.click();
		CompanySecretaries.click();

		String scCompanySecretaries = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCompanySecretaries));

		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		CostAccountants.click();

		String scCostAccountants = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCostAccountants));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		CouncilofArchitecture.click();

		String scCouncilofArchitecture = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCouncilofArchitecture));

		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		Doctors.click();

		String scCDoctors = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCDoctors));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		DrivingLicense.click();

		String scDrivingLicenses = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scDrivingLicenses));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		DrivingLicenseNational.click();

		String scDrivingLicenseNational = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scDrivingLicenseNational));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		EPFCompanyView.click();

		String scDEPFCompanyView = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scDEPFCompanyView));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		EPFO.click();
		String scDEPFEPFO = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scDEPFEPFO));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		Electricity.click();
		String scDElectricity = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scDElectricity));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		Email.click();

		String scEmail = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scEmail));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		ExciseTax.click();

		String scExciseTax = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scExciseTax));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		Facebook.click();

		String scFacebook = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scFacebook));
		Thread.sleep(3000);

		APIS.click();
		Thread.sleep(3000);
		GST.click();
		String scGST = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scGST));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		IEC.click();
		String scIEC = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scIEC));

		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		ITR.click();
		
		String screenITR = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenITR));
	
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		ITRAck.click();
		

		String screenITRAck= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenITRAck));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		ITRUpload.click();
		
		String screenITRUpload= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenITRUpload));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		LPG.click();
		
		String screenLPG= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenLPG));
	
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		Linkedin.click();
		
		String screeLinkedin= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screeLinkedin));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		ListMatching.click();
		String screeListMatching= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screeListMatching));
		Thread.sleep(3000);

		APIS.click();
		Thread.sleep(3000);
		MCACIN.click();
		
		String screeMCACIN= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screeMCACIN));
		
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		MCACompanyMaster.click();
		String scrMCACompanyMaster= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scrMCACompanyMaster));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		MCADIN.click();
		String scrMCAMCADIN= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scrMCAMCADIN));
	
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		MCASignatoryDetails.click();
		String scMCASignatoryDetails= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scMCASignatoryDetails));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		PAN.click();
		
		String scMPAN= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scMPAN));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		Pincode.click();
		String scMPincode= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scMPincode));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		PropertyTax.click();
		String scMPropertyTax= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scMPropertyTax));
	
		APIS.click();
		Thread.sleep(3000);
		ServiceTax.click();
		Thread.sleep(3000);
		String scMServiceTax= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scMServiceTax));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		ServiceTaxNumber.click();
		
		String ServiceTaxNumber= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(ServiceTaxNumber));
		Thread.sleep(3000);
		APIS.click();
		ShopAct.click();
		String ShopAct= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(ShopAct));
		Thread.sleep(3000);
		APIS.click();
		TDSForm16.click();
		String TDSForm16= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(TDSForm16));
		Thread.sleep(3000);
		APIS.click();
		TDSForm26.click();
		
		String TDSForm26= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(TDSForm26));
		Thread.sleep(3000);
		APIS.click();
		TIN.click();
		String TIN= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(TIN));
	
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		UdyogAadhaar.click();
		String UdyogAadhaar= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(UdyogAadhaar));
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		VehicleRegistrationDetails.click();
		
		String VehicleRegistrationDetails= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(VehicleRegistrationDetails));
		
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		VoterId.click();
		String VoterId= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(VoterId));
		
		Thread.sleep(3000);
		APIS.click();
		Thread.sleep(3000);
		WaterBill.click();
		
		String WaterBill= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(WaterBill));
		Thread.sleep(3000);
		log.info("pass");

	}

}
