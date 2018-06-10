package com.wzj.test.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by wangzhijiang on 13/11/2016.
 */
public class DOMParser {

    private static Document parse(String filePath) {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        Document result = null;
        try {
            documentBuilder = builderFactory.newDocumentBuilder();
            result = documentBuilder.parse(new File(filePath));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }


    public static void main(String[] args) {
        Document document = parse("test/xml-test/src/main/resources/books.xml");

        Element element = document.getDocumentElement();

        NodeList nodeList = element.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element e = (Element) node;
                System.out.printf(e.getTextContent());
            }
        }

        NodeList priceNodeList = element.getElementsByTagName("price");
        System.out.println(priceNodeList.item(0).getChildNodes().item(0).getNodeValue());
        ;
        System.out.println(priceNodeList.item(0).getAttributes().getNamedItem("currency").getNodeValue());

        NodeList describeNodeList = element.getElementsByTagName("describe");
        System.out.println(describeNodeList.item(0).getNodeName());
        System.out.println(describeNodeList.item(0).getChildNodes().item(0).getNodeValue());
        System.out.println(describeNodeList.item(0).getChildNodes().item(1).getChildNodes().item(0).getNodeValue());
        System.out.println(describeNodeList.item(0).getChildNodes().item(2).getNodeValue());

    }
}
