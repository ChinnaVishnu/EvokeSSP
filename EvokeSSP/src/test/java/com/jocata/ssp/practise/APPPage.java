package com.jocata.ssp.practise;

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

public class APPPage {

	private final Logger log = LoggerHelper.getLogger(APPPage.class);

	public WebDriver driver;

	public APPPage(WebDriver driver) {
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

		
		APIS.click();
		
		Aadhaar.click();
		ExtentTestManager.getTest().log(LogStatus.INFO, " Aadhaar");

		String screenAadhar = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenAadhar));
		
		APIS.click();
		AadhaarDownload.click();
		String screenAadhaarDownload = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenAadhaarDownload));
		

		APIS.click();
		AadhaarOTP.click();
		String screenAadhaarOTP = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenAadhaarOTP));
		
		APIS.click();

		AadhaarUpload.click();

		String screenAadhaarUpload = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenAadhaarUpload));

		
		APIS.click();
		
		AdverseNews.click();
		String screenAdverseNews = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenAdverseNews));
		
		APIS.click();
		
		BSNL.click();
		String screenBSNL = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBSNL));

		
		APIS.click();
		
		BankStatement.click();

		String screenBankStatement = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenBankStatement));
		
		APIS.click();

		
		CIBILSuitFiledCases.click();

		String scCIBILSuitFiledCases = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCIBILSuitFiledCases));
		
		
		APIS.click();
		
		CRILC.click();
		String scCRILC = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCRILC));

		
		APIS.click();

		
		CST.click();

		String scCCSTC = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCCSTC));
		
		APIS.click();
		
		CharteredAccountants.click();

		String scCharteredAccountants = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCharteredAccountants));
		
		APIS.click();
		CompanySecretaries.click();

		String scCompanySecretaries = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCompanySecretaries));

		
		APIS.click();
		
		CostAccountants.click();

		String scCostAccountants = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCostAccountants));
		
		APIS.click();
		
		CouncilofArchitecture.click();

		String scCouncilofArchitecture = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCouncilofArchitecture));

		
		APIS.click();
		
		Doctors.click();

		String scCDoctors = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scCDoctors));
		
		APIS.click();
		
		DrivingLicense.click();

		String scDrivingLicenses = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scDrivingLicenses));
		
		APIS.click();
		
		DrivingLicenseNational.click();

		String scDrivingLicenseNational = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scDrivingLicenseNational));
		
		APIS.click();
		
		EPFCompanyView.click();

		String scDEPFCompanyView = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scDEPFCompanyView));
		
		APIS.click();
		
		EPFO.click();
		String scDEPFEPFO = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scDEPFEPFO));
		
		APIS.click();
		
		Electricity.click();
		String scDElectricity = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scDElectricity));
		
		APIS.click();
		
		Email.click();

		String scEmail = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scEmail));
		
		APIS.click();
		
		ExciseTax.click();

		String scExciseTax = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scExciseTax));
		
		APIS.click();
		
		Facebook.click();

		String scFacebook = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scFacebook));
		

		APIS.click();
		
		GST.click();
		String scGST = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scGST));
		
		APIS.click();
		
		IEC.click();
		String scIEC = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scIEC));

		
		APIS.click();
		
		ITR.click();
		
		String screenITR = GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenITR));
	
		
		APIS.click();
		
		ITRAck.click();
		

		String screenITRAck= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenITRAck));
		
		APIS.click();
		
		ITRUpload.click();
		
		String screenITRUpload= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenITRUpload));
		
		APIS.click();
		
		LPG.click();
		
		String screenLPG= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screenLPG));
	
		
		APIS.click();
		
		Linkedin.click();
		
		String screeLinkedin= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screeLinkedin));
		
		APIS.click();
		
		ListMatching.click();
		String screeListMatching= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screeListMatching));
		

		APIS.click();
		
		MCACIN.click();
		
		String screeMCACIN= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(screeMCACIN));
		
		
		APIS.click();
		
		MCACompanyMaster.click();
		String scrMCACompanyMaster= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scrMCACompanyMaster));
		
		APIS.click();
		
		MCADIN.click();
		String scrMCAMCADIN= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scrMCAMCADIN));
	
		
		APIS.click();
		
		MCASignatoryDetails.click();
		String scMCASignatoryDetails= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scMCASignatoryDetails));
		
		APIS.click();
		
		PAN.click();
		
		String scMPAN= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scMPAN));
		
		APIS.click();
		
		Pincode.click();
		String scMPincode= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scMPincode));
		
		APIS.click();
		
		PropertyTax.click();
		String scMPropertyTax= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scMPropertyTax));
	
		APIS.click();
		
		ServiceTax.click();
		
		String scMServiceTax= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(scMServiceTax));
		
		APIS.click();
		
		ServiceTaxNumber.click();
		
		String ServiceTaxNumber= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(ServiceTaxNumber));
		
		APIS.click();
		ShopAct.click();
		String ShopAct= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(ShopAct));
		
		APIS.click();
		TDSForm16.click();
		String TDSForm16= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(TDSForm16));
		
		APIS.click();
		TDSForm26.click();
		
		String TDSForm26= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(TDSForm26));
		
		APIS.click();
		TIN.click();
		String TIN= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(TIN));
	
		
		APIS.click();
		
		UdyogAadhaar.click();
		String UdyogAadhaar= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(UdyogAadhaar));
		
		APIS.click();
		
		VehicleRegistrationDetails.click();
		
		String VehicleRegistrationDetails= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(VehicleRegistrationDetails));
		
		
		APIS.click();
		
		VoterId.click();
		String VoterId= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(VoterId));
		
		
		APIS.click();
		
		WaterBill.click();
		
		String WaterBill= GetScreenshort.capture(driver, "ScreenshortForExtentReport");

		ExtentTestManager.getTest().log(LogStatus.INFO,
				"Screenshortbelow :" + ExtentTestManager.getTest().addScreenCapture(WaterBill));
		
		log.info("pass");

	}

}
