import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.firefox.FirefoxDriver

println "Executing GebConfig"

waiting {
    timeout = 7
    retryInterval = 0.5
}

environments {

    firefox {
        driver = {
            println "Executing Firefox environment closure"

            WebDriverManager.firefoxdriver().setup()

            def options = new FirefoxOptions()
            def firefoxDriver = new FirefoxDriver(options)
            firefoxDriver.manage().window().maximize()

            return firefoxDriver
        }
    }

    chrome {
        driver = {
            println "Executing Chrome environment closure"

            WebDriverManager.chromedriver().setup()

            def options = new ChromeOptions()
            def chromeDriver = new ChromeDriver(options)
            chromeDriver.manage().window().maximize()

            return chromeDriver
        }
    }

}
