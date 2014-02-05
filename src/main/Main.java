package main;



import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import sun.org.mozilla.javascript.ast.ForInLoop;

public class Main {

        /**
         * @param args
         */
        public static void main(String[] args) {
        	String xsdPath = System.getProperty("user.dir")+"/"+"MyXSD.xsd";
            String xmlPath = System.getProperty("user.dir")+"/"+"MyXML.xml";
            String tempXmlPath = System.getProperty("user.dir")+"/"+"TempXML.xml";
            
            
            
            Parser.validateXML(xsdPath, xmlPath);
            List<CandyInstance> candyInstanceListDOM=new ArrayList<CandyInstance>();
            
            candyInstanceListDOM=Parser.DOMParse(xmlPath);
            
            List<CandyInstance> candyInstanceListSAX=new ArrayList<CandyInstance>();
            
            
            
            try {
				candyInstanceListSAX=Parser.SAXParse(xmlPath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            List<CandyInstance> candyInstanceListStAX= new ArrayList<CandyInstance>();
            
           try {
			candyInstanceListStAX=Parser.StAXParse(xmlPath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
           
            for (CandyInstance candyInstance:candyInstanceListStAX) {
            	candyInstance.printEverything();
			}
            
            Parser.toXML(candyInstanceListStAX, "OutputXML.xml");
            
            System.out.println("success");
        	 
        	}
        	
        	
}
