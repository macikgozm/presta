package com.presta.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by macik on 1/26/2019.
 */
public class ConfigurationReader {

    private static Properties properties;

    static {
        try{
            String path = "Configuration.properties";

            FileInputStream stream = new FileInputStream(path);

            properties = new Properties();
            properties.load(stream);

            stream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }


}
