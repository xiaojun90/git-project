package com.qimeng.first_maven;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParseDemo {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException {
		
		//创建解析工厂
		SAXParserFactory saxFactory = SAXParserFactory.newInstance();
		//创建解析器
		SAXParser parser = saxFactory.newSAXParser();
		//得到读取器
		XMLReader reader =parser.getXMLReader();
		// 设置内容处理器  
        BeanListHandler handler = new BeanListHandler();  
        reader.setContentHandler(handler);
	}

}

/**
 * 把读取的内容转换成Book实例
 * @author Administrator
 *
 */
class BeanListHandler extends DefaultHandler {  
	
}
