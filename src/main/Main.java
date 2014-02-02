package main;



public class Main {

        /**
         * @param args
         */
        public static void main(String[] args) {
                String xsdPath = System.getProperty("user.dir")+"/"+"MyXSD.xsd";
                String xmlPath = System.getProperty("user.dir")+"/"+"MyXML.xml";
                String tempXmlPath = System.getProperty("user.dir")+"/"+"TempXML.xml";
                
                
                
                Parser.validateXML(xsdPath, xmlPath);
                
                Parser.DOMParse(tempXmlPath);
                System.out.println("success");

        }

}
