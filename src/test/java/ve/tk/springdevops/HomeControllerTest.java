package ve.tk.springdevops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ve.tk.springdevops.controller.HomeController;

@SpringBootTest
public class HomeControllerTest {

    @Autowired
    HomeController homeController;


    @Test
    void homeControllerHealthCheckReturnsOk(){
        assertEquals(homeController.health(),"ok");

    }

    @Test
    void homeControllerGetPeopleTeturns10(){
        assertEquals(homeController.getPeople().size(), 10);
    }
    
}
