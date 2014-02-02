package main;



import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main {

        /**
         * @param args
         */
        public static void main(String[] args) {
        	String xsdPath = System.getProperty("user.dir")+"/"+"MyXSD.xsd";
            String xmlPath = System.getProperty("user.dir")+"/"+"MyXML.xml";
            String tempXmlPath = System.getProperty("user.dir")+"/"+"TempXML.xml";
            
            
            
            Parser.validateXML(xsdPath, xmlPath);
            
            Parser.DOMParse(xmlPath);
            System.out.println("success");
        	 
        	}
        	
        	
}
