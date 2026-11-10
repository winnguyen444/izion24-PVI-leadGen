package baseFunctions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import baseCode.libary;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class codeAppium extends libary {
	static final String BASE_URL = "https://api.uat2.izion24.com.vn";
	public codeAppium(AndroidDriver driver) {
		this.driver = driver;
	}

	// click element
	public void clickElement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(element)).click();
	}

	// sendkeys values
	public void sendValueLogin(WebElement element, String value) {
		new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(element));
		element.click();
		element.clear();
		element.sendKeys(value);
	}
		
	// Chờ màn hình mPin hiện đủ 6 chấm
	public void waitPinScreen(WebElement dot1, WebElement dot6) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(dot1));
	    wait.until(ExpectedConditions.visibilityOf(dot6));
	}
	
	// Chờ elemnt xuất hiện mới hành động
//	public void scrollElementAndClick(String item) {
//		String uiAutomatorScript = String.format("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
//	            + ".scrollIntoView(new UiSelector().text(\"%s\"))", item);
//	}
	
	public WebElement scrollToText(String text) {
	    return driver.findElement(AppiumBy.androidUIAutomator(
	            "new UiScrollable(new UiSelector().scrollable(true).instance(0))"
	            + ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
	}

	public void scrollToTextAndInput(String fieldText, String value) {
	    WebElement el = scrollToText(fieldText);
	    el.click();          // focus vào ô (bỏ nếu không cần)
	    el.clear();          // xóa nội dung cũ (bỏ nếu không cần)
	    el.sendKeys(value);
	}
	
	//hàm auto gen biển số xe
	public String randomLetters() {
	    String digits = "0123456789";
	    String letters = "abcdefghijklmnopqrstuvwxyz";
	    Random random = new Random();
	    StringBuilder sb = new StringBuilder(9);

	    // 2 ký tự đầu: số
	    for (int i = 0; i < 2; i++) {
	        sb.append(digits.charAt(random.nextInt(digits.length())));
	    }
	    // 2 ký tự tiếp theo: chữ
	    for (int i = 0; i < 2; i++) {
	        sb.append(letters.charAt(random.nextInt(letters.length())));
	    }
	    // 5 ký tự còn lại: số
	    for (int i = 0; i < 5; i++) {
	        sb.append(digits.charAt(random.nextInt(digits.length())));
	    }
	    return sb.toString();
	}
	
	
	/** Cuộn tới phần tử khớp selector (UiSelector) rồi trả về phần tử đó. */
	private WebElement scrollTo(String uiSelector) {
		return driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0))"
				+ ".scrollIntoView(" + uiSelector + ")"));
	}
 
	public void scrollAndClick(String uiSelector) {
		scrollTo(uiSelector).click();
	}
 
	protected static String byText(String text) {
		return "new UiSelector().text(\"" + text + "\")";
	}
 
	protected static String byDesc(String desc) {
		return "new UiSelector().description(\"" + desc + "\")";
	}
 
	protected static String imageView(int instance) {
		return "new UiSelector().className(\"android.widget.ImageView\").instance(" + instance + ")";
	}	

	// break
	public void pause(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
		
    // Chờ phần tử hiển thị rồi trả về text
    public String getTextDisplayed(By locator) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }
    
//    public String getTextDisplayed(By locator) {
//        return new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.visibilityOfElementLocated(locator))
//                .getText();
//    }

    // hàm wait dùng cho paymentBill
    public WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    
 // ===================== APIs =====================


    
}
