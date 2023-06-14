package ve.tk.springdevops.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arakelian.faker.model.Person;
import com.arakelian.faker.service.RandomPerson;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String health(){
        return "ok";
    }

    @GetMapping("/people")
    public List<Person> getPeople(){
        return RandomPerson.get().listOf(10);
    }
    
}
