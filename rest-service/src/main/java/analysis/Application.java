package analysis;

import model.Instrument;

import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Application 
{
	  public static void doSomething(String args[]) 
	  {
		  
		  String server = "https://api-fxpractice.oanda.com/";
	      String accountID = "6313898";  
	        
	        HttpHeaders headers = new HttpHeaders();
	        
	        String accessToken = "bfe415e4158601443f459de9f74861c7-5214b3e26772e4b2eb02381913217455";
	        
			headers.set("Authorization","Bearer "+accessToken);
	        System.out.println(accessToken);
	        
	        HttpEntity<String> entity = new HttpEntity<String>(headers);
	        
	        RestTemplate restTemplate = new RestTemplate();
	        //Page page = restTemplate.getForObject("hhttps://api-fxtrade.oanda.com/labs/v1/signal/autochartist?instrument=EUR_CAD", Page.class);
	        
        	ResponseEntity<Page> exchange = restTemplate.exchange(server + "/v1/instruments?accountId=" + accountID,HttpMethod.GET,entity, Page.class);
	        	
        	Instrument[] instruments = exchange.getBody().getInstruments();
        	
        	for (Instrument instrument : instruments) 
        	{
        		System.out.println(instrument.getInstrument());
			}
        	
        	
//	        ResponseEntity<Object> exchange = restTemplate.exchange(server + "/labs/v1/signal/autochartist?instrument=GBP_AUD",HttpMethod.GET,entity, Object.class);
//	        System.out.println(exchange);
	        
//	        ResponseEntity<Page> exchange = restTemplate.exchange(server + "/labs/v1/signal/autochartist/instruments=USD_THB",HttpMethod.GET,entity, Page.class);
//	        System.out.println(exchange.getBody().toString());
	        
	        //	        System.out.println("Name:    " + page.getName());
//	        System.out.println("About:   " + page.getAbout());
//	        System.out.println("Phone:   " + page.getPhone());
//	        System.out.println("Website: " + page.getWebsite());
	    }
}
