package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.swing.text.Document;
import javax.xml.XMLConstants;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;


public class Parser {
        public static boolean validateXML(String xsdPath, String xmlPath){
        try{
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        }
        catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
            return false;
        } catch (SAXException e) {
			// TODO Auto-generated catch block
        	System.out.println("Exception: " + e.getMessage());
		}
        return true;
    }
    
    public static void DOMParse(String xmlPath){
    	
        DocumentBuilderFactory builderFactory =
        DocumentBuilderFactory.newInstance();
        
        DocumentBuilder builder = null;
    	try {
    		builder = builderFactory.newDocumentBuilder();
    	} catch (ParserConfigurationException e) {
    			e.printStackTrace();  
    	}
    	
    	try {
    	    org.w3c.dom.Document document = builder.parse(
    	            new FileInputStream(xmlPath));
    	} catch (SAXException e) {
    	    e.printStackTrace();
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}
    }

}
