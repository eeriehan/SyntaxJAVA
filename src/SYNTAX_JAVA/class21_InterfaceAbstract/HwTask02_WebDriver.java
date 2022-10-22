package SYNTAX_JAVA.class21_InterfaceAbstract;
public interface HwTask02_WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements HwTask02_WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Open Chrome");
    }
    @Override
    public void closeBrowser(){
        System.out.println("close Chrome");
    }
    @Override

    public void maximizeWindow(){
        System.out.println("Maximize Window size of Chrome");
    }
    @Override
    public void findElement(){
        System.out.println("Find Chrome Element");
    }
}

class FireFoxDriver implements HwTask02_WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Open FireFox");
    }
    @Override
    public void closeBrowser(){
        System.out.println("close FireFox");
    }
    @Override

    public void maximizeWindow(){
        System.out.println("Maximize Window size of FireFox");
    }
    @Override
    public void findElement(){
        System.out.println("Find FireFox Element");
    }
}

class WebDriver_Test{
    public static void main(String[] args) {
        HwTask02_WebDriver[] webDrivers = {new ChromeDriver(), new FireFoxDriver()};
        for(HwTask02_WebDriver x: webDrivers){
            x.openBrowser();
            x.closeBrowser();
            x.maximizeWindow();
            x.findElement();
        }
    }
}
