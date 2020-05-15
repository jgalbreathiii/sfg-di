package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController
{
    private final GreetingService greetingService;

    // Autowired annotation not required for Constructor-based Dependency Injection In Spring 5
    public ConstructorInjectedController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
