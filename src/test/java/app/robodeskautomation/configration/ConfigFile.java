package app.robodeskautomation.configration;

import app.robodeskautomation.StepDefs.Hooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFile {
    static Properties property=new Properties();
    static String configFilePath= System.getProperty("user.dir") +"\\RobodeskAutomation\\src\\test\\java\\app\\robodeskautomation\\configration";
    File file=new File(configFilePath);
    public static void main(String[] args) {
        System.out.println("Path : "+ configFilePath + "\\config.properties");
        ReadPropertiesFile();
    }
    public static void ReadPropertiesFile()
    {

        try
        {
            InputStream input=new FileInputStream("C:\\Users\\kmm_d\\IdeaProjects\\RobodeskAutomation\\src\\test\\java\\app\\robodeskautomation\\configration\\config.properties");
            property.load(input);
            Hooks.browser=property.getProperty("browser");
            Hooks.url=property.getProperty("AppUrl");
            System.out.println(Hooks.browser);
            System.out.println(Hooks.url);

        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

}
