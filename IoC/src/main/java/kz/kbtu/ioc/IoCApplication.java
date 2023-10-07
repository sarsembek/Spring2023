package kz.kbtu.ioc;

import kz.kbtu.ioc.service.DiService;
import kz.kbtu.ioc.service.IoCService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IoCApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(IoCApplication.class, args);

		IoCService ioCService = context.getBean(IoCService.class);
		DiService diService = context.getBean(DiService.class);

		IoCService.doSomething();

		diService.doAnotherThing();
	}

}
