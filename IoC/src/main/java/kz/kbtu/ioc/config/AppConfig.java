package kz.kbtu.ioc.config;

import kz.kbtu.ioc.service.DiService;
import kz.kbtu.ioc.service.IoCService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kz.kbtu")
public class AppConfig {

    @Bean
    public IoCService ioCService1() {
        return new IoCService();
    }

    @Bean
    public DiService diService1() {
        return new DiService(ioCService1());
    }
}