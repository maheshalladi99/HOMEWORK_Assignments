package firstJuly.Practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
@RequestMapping(path="/result",method=RequestMethod.GET)	
	public String display() {
		return "result.jsp";
	}

}
