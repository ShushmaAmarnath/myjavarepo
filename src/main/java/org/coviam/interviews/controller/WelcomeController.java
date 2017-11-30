package org.coviam.interviews.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController 
{
		
	@GetMapping("https://api.starter-us-west-1.openshift.com/oapi/v1/namespaces/interviewscreening/buildconfigs/interviewbotapicode/webhooks/157654d9c207d0ef/github")
	public Response sayHello(@RequestParam (required = false, defaultValue="NULL")String Ans1, @RequestParam (required = false, defaultValue="NULL") String Ans2, @RequestParam (required = false, defaultValue="NULL") String Ans3, @RequestParam (required = false, defaultValue="NULL") String Ans4, @RequestParam (required = false, defaultValue="NULL") String Ans5, @RequestParam (required = false, defaultValue="NULL") String Ans6, @RequestParam (required = false, defaultValue="NULL") String Ans7, @RequestParam (required = false, defaultValue="NULL")String Ans8, @RequestParam (required = false, defaultValue="NULL")String Ans9 , @RequestParam (required = false, defaultValue="NULL")String Ans10 , @RequestParam (required = false, defaultValue="NULL")String Ans11 , @RequestParam (required = false, defaultValue="NULL")String Ans12 , @RequestParam (required = false, defaultValue="NULL")String Ans13 , @RequestParam (required = false, defaultValue="NULL")String Ans14 , @RequestParam (required = false, defaultValue="NULL")String Ans15 , @RequestParam (required = false, defaultValue="NULL")String Ans16 , @RequestParam (required = false, defaultValue="NULL")String Ans17 , @RequestParam (required = false, defaultValue="NULL")String Ans18 , @RequestParam (required = false, defaultValue="NULL")String Ans19 , @RequestParam (required = false, defaultValue="NULL")String Ans20)
	{
		Response response = new Response();
		Data data = new Data();
		//List<Text> list = new ArrayList<>();
		data.setType("msg_options");
		data.setText("Please Click on Submit to submit your Test");
		
	//	data.setText(Arrays.asList(new Text("abc"), new Text("pqr")));
		
	//	{ "data": { "type": "msg_options", "text": “Please Click on Submit to submit your Test“, "options": [ { "text": "Submit!!!"}" } ] }
	//	{"data":{"type":"123","msg_options":"123","text":[{"text":"abc"}]}}
	//{"data":{"type":"msg_options","text":"Please Click on Submit to submit your Test","text1":[{"options":"Submit!"}]}}
		//	list.add(text);
		response.setData(data);
 	//int dataa[] = new int[10];
	//	list.add(data);
		//		
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
		if ((Ans9.contains("-")) && (Ans9.contains(".")))
			P++;
	
		if (Ans10.trim().contains("None of the above"))
			Q++;
		if (Ans11.toUpperCase().contains("LOG"))
			P++;
		if ((Ans12.toUpperCase().contains("CODE")) || (Ans11.toUpperCase().contains("LOGIC")) || 
		(Ans11.toUpperCase().contains("VARIABLE")) || (Ans11.toUpperCase().contains("QUERY")))
			P++;
		
		if (Ans13.equals("151"))
			R++;
		if (Ans14.equals("Surprised!"))
			R++;
		
		if ((Ans15.toLowerCase().contains("group by") && Ans14.toLowerCase().contains("having") && Ans14.toLowerCase().contains("Order by") && Ans14.toLowerCase().contains("desc")))
			S++;
		if (Ans16.toUpperCase().contains("INNER JOIN"))
			S++;	
		
		int result = P+Q+R+S;
		
		if (result == 0)
		data.setText(Arrays.asList(new Text("Submit!!!")));
		if (result == 1)
			data.setText(Arrays.asList(new Text("Submit")));
		if (result == 2)
			data.setText(Arrays.asList(new Text("Submit.,")));
		if (result == 3)
			data.setText(Arrays.asList(new Text("Submit!")));
		if (result == 4)
			data.setText(Arrays.asList(new Text("Submit?")));
		if (result == 5)
			data.setText(Arrays.asList(new Text("Submit.")));
		if (result == 6)
			data.setText(Arrays.asList(new Text("Submit,")));
		if (result == 7)
			data.setText(Arrays.asList(new Text("Submit’")));
		if (result == 8)
			data.setText(Arrays.asList(new Text("Submit”")));
		if (result == 9)
			data.setText(Arrays.asList(new Text("Submit;")));
		if (result == 10)
			data.setText(Arrays.asList(new Text("-Submit-")));
		if (result == 11)
			data.setText(Arrays.asList(new Text("Submit:")));
		if (result == 12)
			data.setText(Arrays.asList(new Text("Submit..:")));
		if (result == 13)
			data.setText(Arrays.asList(new Text("Submit…")));
		if (result == 14)
			data.setText(Arrays.asList(new Text("Submit`")));
		if (result == 15)
			data.setText(Arrays.asList(new Text("Submit!")));
		if (result == 16)
			data.setText(Arrays.asList(new Text("Submit!!")));
		//		response.setAns(+(Q+P+R+S));	
		return response;
			//return "All Score & Total Score Respectively:" +Q +P +R +S +(Q+P+R+S) ;
		//	return "{\'data\':{\'type\':\'text\',\'text\': All Score & Total Score Respectively:\" +Q +P +R +S +(Q+P+R+S)\"}}"
	}
}
