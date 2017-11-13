package org.coviam.interviews.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
		
	@GetMapping("https://api.starter-us-west-1.openshift.com/oapi/v1/namespaces/interviewscreening/buildconfigs/interviewbotapicode/webhooks/d7b5e223921c70f4/generic?")
	public String sayHello(@RequestParam (required = false, defaultValue="NULL")String Ans1, @RequestParam (required = false, defaultValue="NULL") String Ans2, @RequestParam (required = false, defaultValue="NULL") String Ans3, @RequestParam (required = false, defaultValue="NULL") String Ans4, @RequestParam (required = false, defaultValue="NULL") String Ans5, @RequestParam (required = false, defaultValue="NULL") String Ans6, @RequestParam (required = false, defaultValue="NULL") String Ans7, @RequestParam (required = false, defaultValue="NULL")String Ans8, @RequestParam (required = false, defaultValue="NULL")String Ans9 , @RequestParam (required = false, defaultValue="NULL")String Ans10 , @RequestParam (required = false, defaultValue="NULL")String Ans11 , @RequestParam (required = false, defaultValue="NULL")String Ans12 , @RequestParam (required = false, defaultValue="NULL")String Ans13 , @RequestParam (required = false, defaultValue="NULL")String Ans14 , @RequestParam (required = false, defaultValue="NULL")String Ans15 , @RequestParam (required = false, defaultValue="NULL")String Ans16 , @RequestParam (required = false, defaultValue="NULL")String Ans17 , @RequestParam (required = false, defaultValue="NULL")String Ans18 , @RequestParam (required = false, defaultValue="NULL")String Ans19 , @RequestParam (required = false, defaultValue="NULL")String Ans20)
	{
		int Q=0,P=0,R=0,S=0;
		//System.out.println(Ans1);
		if (Ans1.trim().contains("None of the above"))
			Q++;
		if (Ans2.trim().contains("Checking that we are building the right system"))
			Q++;
		if (Ans3.trim().contains("should be able to understand the source code"))
			Q++;
		if (Ans4.trim().contains("Retrospective,Sprint Planning,Scrum"))
			Q++;
		if (Ans5.trim().contains("100, 500, 999"))
			Q++;
		if (Ans6.trim().contains("200,500,1000"))
			Q++;
		if (Ans7.trim().contains("1 - Project Owner ; 2,3,4 - Scrum Master"))
			Q++;
		if (Ans8.trim().contains("1;Epic,US-Project Owner,Task-Dev"))
			Q++;
		if (Ans9.trim().contains("200,500,1000"))
			Q++;
		
		if ((Ans9.contains("-")) && (Ans9.contains(".")))
			P++;
		if (Ans10.toUpperCase().contains("LOG"))
			P++;
		if ((Ans11.toUpperCase().contains("CODE")) || (Ans11.toUpperCase().contains("LOGIC")) || 
		(Ans11.toUpperCase().contains("VARIABLE")) || (Ans11.toUpperCase().contains("QUERY")))
			P++;
		
		if (Ans12.equals("151"))
			R++;
		if (Ans13.equals("Surprised!"))
			R++;
		
		if ((Ans14.toLowerCase().contains("group by") && Ans14.toLowerCase().contains("having") && Ans14.toLowerCase().contains("Order by") && Ans14.toLowerCase().contains("desc")))
			S++;
		if (Ans15.toUpperCase().contains("INNER JOIN"))
			S++;
				
			return "All Score & Total Score Respectively:" +Q +P +R +S +(Q+P+R+S) ;
	}
}
