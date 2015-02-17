package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application 
{
	 public static void main(String[] args) 
	 {
		    String webPort = System.getenv("PORT");
		    
		    if (webPort == null || webPort.isEmpty()) 
		    {
		        webPort = "5000";
		    }
		    System.setProperty("server.port", webPort);
		 
	        SpringApplication.run(Application.class, args);
	  }
}
