package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public Properties properties;

    public String getConfigProp(String Key){
        properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/Config.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(Key);
    }
}
