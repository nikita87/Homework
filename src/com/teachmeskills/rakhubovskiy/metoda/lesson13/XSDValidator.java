package com.teachmeskills.rakhubovskiy.metoda.lesson13;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

import static javax.xml.XMLConstants.W3C_XML_SCHEMA_NS_URI;

public class XSDValidator {
    public static void main(String[] args) {
        boolean answer = validateXMLSchema("pcParts.xsd", "pcParts.xml");
        System.out.println("result: " + answer);
    }

    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try{
            SchemaFactory factory = SchemaFactory.newInstance(W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));

        } catch (IOException | SAXException e){
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }
}
