package pageObModel;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import baseFunctions.codeAppium;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class pageTNDSVehicleMotobike extends codeAppium {

	private static final String BASE_URL = "https://api.uat2.izion24.com.vn";
	protected codeAppium appLogin;
	static String auth;


	public pageTNDSVehicleMotobike(AndroidDriver driver) {
		super(driver);
		appLogin = new codeAppium(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Đóng quảng cáo\")")
	private WebElement closePopup;

	@AndroidFindBy(accessibility = "Xem thêm")
	private WebElement seeMore;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(34)")
	private WebElement k50ccAndBove;

	@AndroidFindBy(accessibility = "Cập nhật")
	private WebElement update;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Bảo hiểm bắt buộc Trách nhiệm dân sự của chủ xe môtô - xe máy\")")
	private WebElement productElement;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(18)")
	private WebElement checkBox2000;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Đã chọn\")")
	private WebElement packed1year;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Số khung *\")")
	private WebElement screen;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Tôi đồng ý với Điều khoản & Điều kiện\")")
	private WebElement buttonConditions;

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Điều khoản hoạt động cung cấp sản phẩm bảo hiểm trên môi trường mạng\")")
	private WebElement checkBox2;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
	private WebElement arrowCheckbox2;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Thanh toán\")")
	private WebElement payment;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(6)")
	private WebElement payoo;

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Dùng mã thanh toán\")")
	private WebElement paymentCash;

	By locator = AppiumBy.xpath(
			"//android.widget.TextView[@text='Mã thanh toán của bạn']/following-sibling::android.widget.TextView[1]");

	// ===================== Actions =====================

	/** Bấm đóng popup lead gen */
	public void clickClosePopup() {
		appLogin.clickElement(closePopup);
	}

	/** Bấm "Xem thêm" ở mục danh mục bảo hiểm. */
	public void clickSeeMore() {
		appLogin.clickElement(seeMore);

	}

	/** Cuộn tới sản phẩm TNDS bắt buộc Chủ xe máy và chọn. */
	public void ActionscrollToDescAndClick() {
		appLogin.scrollAndClick(byText("Bảo hiểm TNDS bắt buộc Chủ xe máy"));
	}

	/** Chọn loại xe từ 50cc trở lên. */
	public void click50ccAndBove() {
		appLogin.clickElement(k50ccAndBove);
	}

	public void clickUpdate() {
		appLogin.clickElement(update);
	}
	
	public void clickproductElement() {
		appLogin.clickElement(productElement);
	}

	/** Chọn gói 1 năm ("Đã chọn"). */
	public void clickpacked1year() {
		appLogin.clickElement(packed1year);
	}
	
	public void clickCheckBox2000() {
		appLogin.clickElement(checkBox2000);
	}

	public void inputFullName() {
		appLogin.scrollToTextAndInput("Nhập Họ và tên chủ xe", "van thang");
	}

	public void inputFullLicensePlateNumber() {
		appLogin.scrollToTextAndInput("Nhập biển số xe", appLogin.randomLetters());
	}

	public void inpuFullVin() {
		appLogin.scrollToTextAndInput("Nhập số khung", appLogin.randomLetters());
	}

	/** Bấm ra vùng trống để ẩn bàn phím. */
	public void clickScreen() {
		appLogin.clickElement(screen);
	}

	/** Cuộn tới và bấm nút "Tiếp tục". */
	public void clickContinute() {
		appLogin.scrollAndClick(byDesc("Tiếp tục"));
	}

	public void clickCheckBox() {
		appLogin.scrollAndClick(imageView(6));
	}

	public void clickCheckBox1Link() {
		appLogin.scrollAndClick(imageView(7));
	}

	public void clickArrow1() {
		appLogin.scrollAndClick(imageView(2));
	}

	/** Bấm "Tôi đồng ý với Điều khoản & Điều kiện" (lần 1, chờ trang ổn định). */
	public void clickButtonSubmit1() {
		appLogin.pause(3000);
		appLogin.clickElement(buttonConditions);
	}

	public void clickCheckbox2() {
		appLogin.clickElement(checkBox2);
	}

	public void clickArrowcheckbox2() {
		appLogin.pause(5000);
		appLogin.clickElement(arrowCheckbox2);
	}

	/** Bấm "Tôi đồng ý với Điều khoản & Điều kiện" (lần 2). */
	public void clickButtonSubmit2() {
		appLogin.clickElement(buttonConditions);
	}

	public void clickPayment() {
		appLogin.pause(3000);
		appLogin.clickElement(payment);
	}

	public void clickPayoo() {
		appLogin.clickElement(payoo);
	}

	public void ClickPaymentCash() {
		appLogin.clickElement(paymentCash);
	}

	// Hàm tiện dụng dành riêng cho paymentBill
	public String getPaymentBillText() {
		WebElement element = appLogin.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element.getText();
	}

	// ===================== APIs =====================
	

	public void login() {
	    Map<String, Object> loginBody = new HashMap<>();
	    loginBody.put("channelPartner", "payoo");
	    loginBody.put("password", "CcQ8cG76aOiJJUH5ZIFK");
	    loginBody.put("userName", "payoo_user");

	    Response res = given()
	            .contentType(ContentType.JSON)
	            .body(loginBody)
	        .when()
	            .post(BASE_URL + "/partner/login")
	        .then()
	            .statusCode(200)
	            .extract().response();

	    String token = res.jsonPath().getString("data.accessToken");
	    Assert.assertNotNull(token, "Không lấy được token, response: " + res.asString());    
	    auth = "Bearer " + token;
	    
	}

	public void getBillAndConfirm() {
	    String billId = getPaymentBillText();

	    // API 1: get-bill-data
	    Map<String, Object> billBody = new HashMap<>();
	    billBody.put("billId", billId);

	    Response bill = given()
	            .header("Authorization", auth)
	            .contentType(ContentType.JSON)
	            .body(billBody)
	        .when()
	            .post(BASE_URL + "/partner/payoo/get-bill-data")
	        .then()
	            .statusCode(200)
	            .extract().response();

	    JsonPath json = bill.jsonPath();

	    // API 2: cash-payment-confirm
	    Map<String, Object> confirmBody = new HashMap<>();
	    confirmBody.put("billId", billId);
	    confirmBody.put("transactionId", json.getString("id"));
	    confirmBody.put("paidAmount", json.getString("data.billInfo.cashAmount"));
	    confirmBody.put("paymentDate", json.getString("data.billInfo.orderDate"));

	    Response confirm = given()
	            .header("Authorization", auth)
	            .contentType(ContentType.JSON)
	            .body(confirmBody)
	            .log().ifValidationFails()
	        .when()
	            .post(BASE_URL+ "/partner/payoo/cash-payment-confirm")
	        .then()
	            .log().ifValidationFails()
	            .statusCode(200)
	            .extract().response();

	    System.out.println("Status: " + confirm.statusCode());
	    System.out.println("Body: " + confirm.asString());
	}
}
