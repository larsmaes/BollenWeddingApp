/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.maes.bollenweddingapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lars
 */
public class ApplicationProperties {

    private ApplicationProperties() {
    }

    public static Properties getProperties() {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("config.properties"));
        } catch (IOException ex) {
            Logger.getLogger(ApplicationProperties.class.getName()).log(Level.SEVERE, null, ex);
        }
        return props;
    }
}
