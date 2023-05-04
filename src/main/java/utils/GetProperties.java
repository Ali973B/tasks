package utils;

import exceptions.UrlNotFound;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.File;

public abstract class GetProperties {
    private static final String filePath = "src/main/resources/properties.xml";

    public static String getHostUrl() {
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(new File(filePath));
            XPath xPath = XPathFactory.newInstance().newXPath();
            XPathExpression xPathExpression = xPath.compile("//url[@name='hostUrl']");
            String string = xPathExpression.evaluateExpression(document, String.class);
            String url = string.substring(9, string.length() - 2);
            XPathExpression xPathExpression1 = xPath.compile("//url[@name='otherUrl']");
            String s = xPathExpression1.evaluateExpression(document, String.class);
            for (int i = 0; i < s.length(); i++)
                System.out.println(s.charAt(i));
            return url;

        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new UrlNotFound("Base Url is not found");
    }

    public static void main(String[] args) {
        System.out.println(getHostUrl());
    }
}
