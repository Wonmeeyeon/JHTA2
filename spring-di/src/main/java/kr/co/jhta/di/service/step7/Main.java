package kr.co.jhta.di.service.step7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		String conf = "kr/co/jhta/di/service/step7/context-step7.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		EventNotificationServiceImpl eventNotificationServiceImpl = ctx.getBean("eventNotificationService", EventNotificationServiceImpl.class);
		
		eventNotificationServiceImpl.noticeEvent("콘서트", "비와서 취소합니다. 환불은 불가합니다.");
		
	}

}
