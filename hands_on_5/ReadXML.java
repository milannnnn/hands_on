package hands_on_5;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ReadXML {

	public static void main(String[] args) {
		
		try{
			File XmlFile = new File("./src/hands_on_5/opencim3sub.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(XmlFile);
			
			// #################### Normalize CIM XML file ####################
			// Check: http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();
			
			NodeList subList1 = doc.getElementsByTagName("cim:Substation");
			NodeList subList2 = doc.getElementsByTagName("cim:VoltageLevel");
			NodeList subList3 = doc.getElementsByTagName("cim:SynchronousMachine");
			// … read other required CIM objects
			
			// … cycle through each list to extract required data
			
			for (int i = 0; i < subList1.getLength(); i++) { 
				// … use extractNode method
				extractNode(subList1.item(i));
			}
			for (int i = 0; i < subList2.getLength(); i++) { 
				extractNode(subList2.item(i));
			}
			for (int i = 0; i < subList3.getLength(); i++) { 
				extractNode(subList3.item(i));
			}
			
		}
		
		catch(Exception e){ 
			e.printStackTrace();
		}
	}
	
	public static void extractNode (Node node){ 
		// remember to convert node to element in order to search for the data inside it.
		// element.getElementsByTagName("cim:IdentifiedObject.name").item(0).getTextContent 
		// can be used to read specific attribute of XML node. 
		
		// ####### NODE vs. ELEMENT ######
		// http://stackoverflow.com/questions/9979172/difference-between-node-object-and-element-object
		// ############################################################################################
		Element element = (Element)node;
		String name = element.getElementsByTagName("cim:IdentifiedObject.name").item(0).getTextContent();
		String id   = element.getAttribute("rdf:ID");
		//System.out.println("Name: " +name + "\t ID: " + id);
		System.out.println(name + " (" + id + ")");
		
		
	}

}
