package com.teachmeskills.rakhubovskiy.metoda.lesson13.xmlparser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PcPartsHandler extends DefaultHandler {

    boolean name = false;
    boolean origin = false;
    boolean price = false;
    boolean type = false;



    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("name")){
            name = true;
        }

        if (qName.equalsIgnoreCase("origin")){
            origin = true;
        }

        if (qName.equalsIgnoreCase("price")){
            price = true;
        }

        if (qName.equalsIgnoreCase("type")){
            type = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       if(name){
            System.out.println("Name: " + new String(ch, start, length));
       }

       if(origin){
            System.out.println("Origin: " + new String(ch, start, length));
       }

       if(price){
            System.out.println("Price: " + new String(ch, start, length));
       }

        if(type){
            System.out.println("Type: " + new String(ch, start, length));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(name){
            System.out.println("element: " + qName + " ended!!!");
            name = false;
        }

        if(origin){
            System.out.println("element: " + qName + " ended!!!");
            origin = false;
        }

        if(price){
            System.out.println("element: " + qName + " ended!!!");
            price = false;
        }

        if(type){
            System.out.println("element: " + qName + " ended!!!");
            type = false;
        }
    }
}
