package ProductManagement;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropDemo {
  private Properties properties = new Properties();
  public static void main(String[] args) {
    PropDemo pDemo = new PropDemo();
    pDemo.loadPropertiesFile();
    pDemo.readProperties();
  }
  
  // This method is used to load the properties file
  private void loadPropertiesFile(){
    InputStream iStream = null;
      try {
        // Loading properties file from the path (relative path given here)
        iStream = new FileInputStream("/Users/anirudhpaluri/Documents/Java11/ProductManagement/data/resources.properties");   
        properties.load(iStream);
      } catch (IOException e) {
       // TODO Auto-generated catch block
       e.printStackTrace();
      }finally {
        try {
          if(iStream != null){
            iStream.close();
          }
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }
  
  /**
  * Method to read the properties from a
  * loaded property file
  */
  private void readProperties(){
    System.out.println("Product- " + properties.getProperty("product"));
    System.out.println("Review - " + properties.getProperty("review"));
    // reading property which is not there
    System.out.println("City - " + properties.getProperty("city"));
  }
}