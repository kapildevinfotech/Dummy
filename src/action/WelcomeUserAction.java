package action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.DummyService;


public class WelcomeUserAction{

	private String username;
	 
	public String getUsername() {
		System.out.println("Inside UseName");
		return username;
	}

	public void setUsername(String username) {
		System.out.println("Inside setUsername");
		this.username = username;
	}

	public String execute() {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext-main.xml");
		DummyService dummServ=(DummyService)context.getBean("dummServ");
		//AOP
		dummServ.getService();
		dummServ.getDummy();
		return "SUCCESS";

	}
	
	public String getName(){
		System.out.println("Inside GetName :" + username);
		return username;
	}
}