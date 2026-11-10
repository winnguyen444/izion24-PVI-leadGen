package pageObModel;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import baseFunctions.codeAppium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class pageLogin extends codeAppium {

	codeAppium appLogin;

	public pageLogin(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		appLogin = new codeAppium(driver);
	}

	// số điện thoại
	@AndroidFindBy(className = "android.widget.EditText")
	private WebElement sendValueInputLoginPhone;

	public void sendPhoneLogin(String phone) {
		appLogin.sendValueLogin(sendValueInputLoginPhone, phone);
	}

	// check box điều khoản
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
	private WebElement clickCheckbox;

	public void checkBox() {
		appLogin.clickElement(clickCheckbox);
	}

	// button tiếp tục
	@AndroidFindBy(accessibility = "Tiếp tục")
	private WebElement buttonClick;

	public void buttonLogin() {
		appLogin.clickElement(buttonClick);
	}

	// nhập mã pin
	// 6 dấu chấm chỉ báo mPin
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"●\").instance(0)")
	private WebElement pinDot1;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"●\").instance(1)")
	private WebElement pinDot2;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"●\").instance(2)")
	private WebElement pinDot3;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"●\").instance(3)")
	private WebElement pinDot4;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"●\").instance(4)")
	private WebElement pinDot5;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"●\").instance(5)")
	private WebElement pinDot6;
	
	
	// Chờ màn hình mPin hiện đủ 6 chấm
//	public void waitPinScreen() {
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	    wait.until(ExpectedConditions.visibilityOf(pinDot1));
//	    wait.until(ExpectedConditions.visibilityOf(pinDot6));
//	}
	
	// Cách 1: nhập bằng phím (bàn phím hệ thống/ẩn)
	public void enterPin(String pin) {
	    waitPinScreen(pinDot1, pinDot6);
	    for (char digit : pin.toCharArray()) {
	        driver.pressKey(new KeyEvent(AndroidKey.valueOf("DIGIT_" + digit)));
	    }
	}

}
