import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {

    public static Object getBean() {
        try {
            //创建DOM文档对象
            DocumentBuilderFactory dFactort = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactort.newDocumentBuilder();
            Document doc = builder.parse(new File("config/config.xml"));

            //获取包含类名的文字节电
            NodeList nodeList = doc.getElementsByTagName("className");
            Node classNode = nodeList.item(0).getFirstChild();
            //通过类名返回
            String cName = classNode.getNodeValue();
            Class c = Class.forName(cName);
            return c.newInstance();
        } catch (Exception e) {
            return null;
        }
    }

}
