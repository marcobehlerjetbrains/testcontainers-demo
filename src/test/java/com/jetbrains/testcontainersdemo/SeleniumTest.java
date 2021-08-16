package com.jetbrains.testcontainersdemo;



/*@Testcontainers*/
public class SeleniumTest {
/*
    @Container
    public BrowserWebDriverContainer<?> chrome = new BrowserWebDriverContainer<>()
            .withCapabilities(new FirefoxOptions())
            .withRecordingMode(RECORD_ALL, new File("c:\\dev\\"), VncRecordingContainer.VncRecordingFormat.MP4);

    @Test
    public void testme() {
        doSimpleExplore(chrome);
    }

    protected static void doSimpleExplore(BrowserWebDriverContainer<?> rule) {
        RemoteWebDriver driver = setupDriverFromRule(rule);
        System.out.println("Selenium remote URL is: " + rule.getSeleniumAddress());
        System.out.println("VNC URL is: " + rule.getVncAddress());

        driver.get("https://www.google.com");
        System.out.println(driver.getPageSource());
        WebElement title = driver.findElement(By.tagName("h1"));
        System.out.println(title);
    }

    private static RemoteWebDriver setupDriverFromRule(BrowserWebDriverContainer<?> rule) {
        RemoteWebDriver driver = rule.getWebDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }*/

}

