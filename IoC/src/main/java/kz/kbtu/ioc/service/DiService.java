package kz.kbtu.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiService {
    private final IoCService ioCService;

    @Autowired
    public DiService(IoCService ioCService) {
        this.ioCService = ioCService;
    }

    public void doAnotherThing() {
        ioCService.setMessage("Hello from DiService");
        ioCService.doSomething();
    }
}
