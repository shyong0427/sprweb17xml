package aa.bb.cc;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "msg-list") // root element 이름 
public class XmlMessageList {
	@XmlElement
	private List<XmlMessage> messages;

	public XmlMessageList() {
	}
	
	public XmlMessageList(List<XmlMessage> messages) {
		this.messages = messages;
	}
	
	public List<XmlMessage> getMessages() {
		return messages;
	}
}