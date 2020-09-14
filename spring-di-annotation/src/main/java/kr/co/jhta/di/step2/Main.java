package kr.co.jhta.di.step2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.jhta.di.SmsMessageSender;
import kr.co.jhta.di.step1.EventNotificationServiceImpl;

public class Main {
	
	public static void main(String[] args) {
		String conf = "classpath:/spring/context-step2.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(conf);
		AlarmServiceImpl alarmServiceImpl = ctx.getBean(AlarmServiceImpl.class);
		
		alarmServiceImpl.alrm("불났어용");
		
	
		
		
		
	}

}
