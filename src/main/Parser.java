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

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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
    	    
    	    Element rootElement = document.getDocumentElement();
    	    //System.out.println(rootElement.toString());
    	    
    	    NodeList nodes = rootElement.getChildNodes();
    	    
    	    CandyInstance currentCandyInstance;

    	    for(int i=0; i<nodes.getLength(); i++){
    	      Node node = nodes.item(i);

    	      if(node instanceof Element){
    	        //a child element to process
    	        Element child = (Element) node;
    	        //System.out.println(child);
    	        
    	        currentCandyInstance=new CandyInstance();
    	        
    	        
    	        ChocolateType chocolate =ChocolateType.getChocolateType(child.getAttribute("chocolate"));
    	        currentCandyInstance.setChocolate(chocolate);
    	        
    	        currentCandyInstance.setEnergy(new Integer(child.getAttribute("energy")));
    	        
    	        currentCandyInstance.setHasWater(new Boolean(child.getAttribute("hasWater")));
    	        
    	        currentCandyInstance.setId(new Integer(child.getAttribute("id")));
    	        
    	        currentCandyInstance.setName(child.getAttribute("name"));

    	        currentCandyInstance.setType(CandyType.getCandyType(child.getAttribute("type")));
    	        
    	        
    	        //Sugar
    	        
    	        
    	        
    	        //currentCandyInstance.setIngridients(ingridients);
    	        
    	        //currentCandyInstance.setValues(values);
    	        
    	        //currentCandyInstance.setProducion(producion);
    	        
    	    
    	        
    	        String attribute = child.getAttribute("");
    	        
    	      }
    	    }
    	} catch (SAXException e) {
    	    e.printStackTrace();
    	} catch (IOException e) {
    	    e.printStackTrace();
    	}
    	
    	
    }

}
