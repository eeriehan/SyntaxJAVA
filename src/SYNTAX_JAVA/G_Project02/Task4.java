package SYNTAX_JAVA.G_Project02;

/*
Provide Implementation for the diagram below.
Then create a test class in which you need to create Objects of ChromeDriver,
FirefoxDrive and SafariDriver classes and see which methods available to them.
 */
public class Task4 {

    public static void main(String[] args) {
        remoteWebDriver[] webDriver = {
                new ChromeDrive(), new FirefoxDrive(), new SafariDriver()
        };

        for (remoteWebDriver driver : webDriver) {
            driver.openBrowser();
            driver.closeBrowser();
            System.out.println(driver.getTitle());  // printing return value of getTitle
            driver.navigate();
            driver.getScreenShot();
            System.out.println();   // for spacing
        }
    }
}

interface WebDriver {
    void openBrowser();

    void closeBrowser();

    String getTitle();
}

interface remoteWebDriver extends WebDriver, takeScreenShot {
    void navigate();
}

interface takeScreenShot {
    void getScreenShot();
}

class ChromeDrive implements remoteWebDriver{
    @Override
    public void openBrowser() {
        System.out.println("opening the chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the chrome browser");
    }

    @Override
    public String getTitle() {
        return "getting title from the Chrome browser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to URL from Chrome browser");
    }

    @Override
    public void getScreenShot() {
        System.out.println("taking screenshots from Chrome");
    }
}

class FirefoxDrive implements remoteWebDriver{
    @Override
    public void openBrowser() {
        System.out.println("opening the Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Firefox browser");
    }

    @Override
    public String getTitle() {
        return "getting title from the Firefox browser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to URL from Firefox browser");
    }

    @Override
    public void getScreenShot() {
        System.out.println("taking a screenshot from FireFox");
    }
}

class SafariDriver implements remoteWebDriver{
    @Override
    public void openBrowser() {
        System.out.println("opening the Safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Safari browser");
    }

    @Override
    public String getTitle() {
        return "getting title from the Safari browser";
    }

    @Override
    public void navigate() {
        System.out.println("navigate to URL from Safari browser");
    }

    @Override
    public void getScreenShot() {
        System.out.println("taking screenshots from Safari");
    }
}
