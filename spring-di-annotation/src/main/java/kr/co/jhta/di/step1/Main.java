package kr.co.jhta.di.step1;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.jhta.di.SmsMessageSender;

public class Main {
	
	public static void main(String[] args) {
		String conf = "classpath:/spring/context-step1.xml";
		ApplicationContext ctx = new GenericXmlApplicationContext(conf);
		SmsMessageSender sender= ctx.getBean(SmsMessageSender.class);
		EventNotificationServiceImpl ens = ctx.getBean(EventNotificationServiceImpl.class);
		
		System.out.println(sender);
		sender.send("홍보부", "홍길동", "제목입니다.", "내용입니다.");
		ens.notice("경리부", "폐업안내", "전품목 대방출로 폐업합니다");
	}
	
	

}
