package maventest.test;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        Logger logger = LogManager.getLogger(); //use log4j
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring-config.xml")); //use spring-core
    }
}