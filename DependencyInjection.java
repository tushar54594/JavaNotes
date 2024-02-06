package com.tushar.demo;

import org.springframework.stereotype.Component;

@Component  --> make the class as component
public class Alien {

    public void alien(){
        System.out.println("Alien");
    }
}


---main class

package com.tushar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		System.out.println("HEllo");

//		Alien obj = new Alien(); --> we don't want to create the object
		Alien obj = context.getBean(Alien.class);   --> now spring will create the object
		obj.alien();

	}

}
