package MM.maven;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testgit {

    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://newtours.demoaut.com";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
         */
       
       
        //close Firefox
        driver.close();
       
        // exit the program explicitly
        System.exit(0);
    }
}