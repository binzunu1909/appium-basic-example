package no;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventFlag;
import io.appium.java_client.android.options.app.SupportsAndroidInstallTimeoutOption;
import io.appium.java_client.ios.options.simulator.Permissions;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.qameta.allure.*;
import no.pre.ShellScriptRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.DesiredCapabilities;
@Epic("Allure examples")
@Feature("Junit 4 support")
public class AppTest
{
    private AndroidDriver driver;
    private static final String NOTE_TITLE = "Research Appium Tests";
    private static final String NOTE_DES = "Build Testscript Basic Using Appium";
    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
        desiredCapabilities.setCapability("appium:appPackage", "com.example.android.testing.notes");
        desiredCapabilities.setCapability("appium:appActivity", "com.example.android.testing.notes.notes.NotesActivity");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        desiredCapabilities.setCapability("appium:autoGrantPermissions", true);
        desiredCapabilities.setCapability("appium:autoAcceptAlerts", true);

        URL remoteUrl = new URL("http://127.0.0.1:4723/");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    @Story("Base support for bdd annotations")
    @Story("Advanced support for bdd annotations")
    @Severity(SeverityLevel.CRITICAL)
    @Step("Create new note")
    @Description("Create new note")
    public void sampleTest() {
        driver.findElement(MobileBy.androidUIAutomator("text(\"Continue\")")).click();
        driver.findElement(MobileBy.androidUIAutomator("text(\"OK\")")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.example.android.testing.notes:id/fab_add_notes\")"))
                .click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.example.android.testing.notes:id/add_note_title\")"))
                .sendKeys(NOTE_TITLE);
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.example.android.testing.notes:id/add_note_description\")"))
                .click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.example.android.testing.notes:id/add_note_description\")"))
                .sendKeys(NOTE_DES);
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.example.android.testing.notes:id/fab_add_notes\")"))
                .click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
