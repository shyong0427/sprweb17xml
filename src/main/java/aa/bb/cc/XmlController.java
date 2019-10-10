package aa.bb.cc;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class XmlController {
	@RequestMapping(value = "member_xml", method = RequestMethod.GET)
	public String frmBack() {
		return "myform";
	}
	
	@RequestMapping(value = "member_xml", method = RequestMethod.POST)
	@ResponseBody
	public XmlMessageList frmSubmit(@RequestParam("name") String name, @RequestParam("age") String age) {
		return getXml(name, age);
	}
	
	public XmlMessageList getXml(String name, String age) {
		List<XmlMessage> messages = Arrays.asList(
				new XmlMessage(name, age),
				new XmlMessage("oscar", "33"),
				new XmlMessage("이기자", "43")
				);
		
		return new XmlMessageList(messages);
	}
}