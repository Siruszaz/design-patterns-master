import javax.xml.parsers.*;
public class XMLUtil
{
    public static Object getBean()
    {
        try
        {
            //创建文档对象
            DocumentBuilderFactor dFactory=DocumentBuilder
            DocumentBuilder builder =dFactory.newDocument
            Document doc;
            doc=builder.parse(new File("config.xml"));

            //获取包含类名的文本节点
            NodeList n=doc.getElementsByTagName("className");
            Node classNode=n1.item(0).getFristChild();
            String cName=classNode.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c=Class.forName(cName);
            Object obj=c.newTnstance();
            return obj;
        }
    }
}