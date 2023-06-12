package helloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/hellopage",method=RequestMethod.GET)
	public String getPage() {
		return "helloPage";
	}
	
   
}
