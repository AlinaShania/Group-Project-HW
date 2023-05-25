package GroupProject2;

public interface WebDriver {
    void open();
    void close();
    String getTitle ();
}
interface RemoteWebDriver extends WebDriver {
void navigate();
}
interface TakesScreenshot extends RemoteWebDriver {
void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void navigate() {

    }
    @Override
    public String getTitle(){
        return getTitle();
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void navigate() {

    }
    @Override
    public String getTitle(){
        return getTitle();
    }

}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void navigate() {

    }
    @Override
    public String getTitle(){
        return getTitle();
    }
}
class DriverTester{
    public static void main(String[] args) {
        ChromeDriver obj1 = new ChromeDriver();
        FirefoxDriver obj2 = new FirefoxDriver();
        SafariDriver obj3 = new SafariDriver();

      obj1.navigate();
      obj1.getTitle();
      obj1.open();
      obj1.close();

        obj2.navigate();
        obj2.getTitle();
        obj2.open();
        obj2.close();

        obj3.navigate();
        obj3.getTitle();
        obj3.open();
        obj3.close();


    }
}

