import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController   
//As we are printing the result directly to HTTP , we use Rest Controller , else we can use app controller just to get results 
public class first 
//We will write a class here 
{
	@RequestMapping("/") 
	//Request Mapping maps the home method to /
	public String home()
	//We write a simple method
	{
		return "Hello , World";
	
	}
	
}
