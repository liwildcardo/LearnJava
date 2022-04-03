package pers.wildcardo.xmlToExcel;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Dom4jDemo {

    public static void main(String[] args) throws DocumentException {

        // 获取document对象
        SAXReader reader = new SAXReader();
        Document document = reader.read("Book.xml");

        // 获取文件的根节点
        Element rootElement = document.getRootElement();
        Element firstBook = rootElement.element("书");
        List<Element> elements = firstBook.elements();
        for (Element ele : elements) {
            System.out.println(ele.getName() + ele.getText());
        }
    }
}
