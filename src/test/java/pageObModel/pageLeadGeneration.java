package pageObModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseFunctions.codeAppium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class pageLeadGeneration extends codeAppium {

	protected codeAppium appLogin;

	public pageLeadGeneration(AndroidDriver driver) {
		super(driver);
		appLogin = new codeAppium(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.ImageView")
	private WebElement popupLeadGen;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"ĐĂNG KÝ NGAY\")")
	private WebElement buttonRegisterForm;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tôi đồng ý cho phép IDEAL LIFE (hệ thống IZIon24) chuyển giao DLCN của tôi cho VPB SMBC FC để thực hiện mục đích xử lý DLCN được quy định chi tiết và công khai tại Điều Kiện Giao Dịch Chung Về Chính Sách Bảo Vệ Dữ Liệu Cá Nhân tại VPB SMBC FC và Văn Bản Xác Nhận Đồng Ý Với Hoạt Động Xử Lý Dữ Liệu Cá Nhân.\")")
	private WebElement consentCheckbox1;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Cuộn đến trang cuối\"]/android.view.ViewGroup/android.widget.ImageView")
	private WebElement dropdownInPDF1;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tôi đồng ý\")")
	private WebElement buttonInPDF1;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Nội dung các mục đích và phương thức xử lý dữ liệu cá nhân của VPB SMBC FC\")")
	private WebElement CheckboxLink;

	@AndroidFindBy(xpath = "(//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[@text=\"Xem chi tiết →\"])[1]")
	private WebElement consentCheckbox2;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tôi đồng ý\")")
	private WebElement buttonSubmit2;

	@AndroidFindBy(xpath = "(//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[@text=\"Xem chi tiết →\"])[2]")
	private WebElement consentCheckbox3;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tôi đồng ý\")")
	private WebElement buttonSubmit3;

	@AndroidFindBy(xpath = "(//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[@text=\"Xem chi tiết →\"])[3]")
	private WebElement consentCheckbox4;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tôi đồng ý\")")
	private WebElement buttonSubmit4;

//	@AndroidFindBy(uiAutomator = "")
//	private WebElement consentCheckbox5;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tôi đồng ý cho VPB SMBC FC được chủ động liên hệ để tư vấn sản phẩm tài chính, bao gồm việc thực hiện cuộc gọi sau 17h hằng ngày và/hoặc thực hiện nhiều hơn một cuộc gọi trong vòng 24 giờ nếu cần thiết để hoàn tất việc tư vấn.\")")
	private WebElement consentCheckbox6;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tôi đồng ý\")")
	private WebElement buttonSumitPage;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Đăng ký\")")
	private WebElement buttonRegister;

	// ===================== Actions =====================

	// ====== Hàm click từng bước ======

	public void clickPopupLeadGen() {
		appLogin.clickElement(popupLeadGen);
	}

	public void clickRegisterForm() {
		appLogin.clickElement(buttonRegisterForm);
	}

	public void clickConsentCheckbox1() {
		appLogin.clickElement(consentCheckbox1);
	}

	public void clickDropdownInPDF1() {
		appLogin.clickElement(dropdownInPDF1);
	}

	public void clickButtonInPDF1() {
		appLogin.clickElement(buttonInPDF1);
	}

	public void clickCheckboxLink() {
		appLogin.clickElement(CheckboxLink);
	}

	public void clickConsentCheckbox2() {
		appLogin.clickElement(consentCheckbox2);
	}

	public void clickButtonSubmit2() {
		appLogin.clickElement(buttonSubmit2);
	}

	public void clickConsentCheckbox3() {
		appLogin.clickElement(consentCheckbox3);
	}

	public void clickButtonSubmit3() {
		appLogin.clickElement(buttonSubmit3);
	}

	public void clickConsentCheckbox4() {
		appLogin.clickElement(consentCheckbox4);
	}

	public void clickButtonSubmit4() {
		appLogin.clickElement(buttonSubmit4);
	}

//	public void clickConsentCheckbox5() {
//		appLogin.clickElement(consentCheckbox5);
//	}

	public void clickConsentCheckbox6() {
		appLogin.clickElement(consentCheckbox6);
	}

	public void clickButtonSumitPage() {
		appLogin.clickElement(buttonSumitPage);
	}

	public void clickButtonRegister() {
		appLogin.clickElement(buttonRegister);
	}

}
