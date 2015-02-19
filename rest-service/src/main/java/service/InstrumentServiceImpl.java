package service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import model.Instrument;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import analysis.Page;

@Service
public class InstrumentServiceImpl implements InstrumentService {
	
	public List<Instrument> getInstruments() 
	{
		String server = "https://api-fxpractice.oanda.com/";
		String accountID = "6313898";

		HttpHeaders headers = new HttpHeaders();

		String accessToken = "bfe415e4158601443f459de9f74861c7-5214b3e26772e4b2eb02381913217455";

		headers.set("Authorization", "Bearer " + accessToken);
		System.out.println(accessToken);

		HttpEntity<String> entity = new HttpEntity<String>(headers);

		RestTemplate restTemplate = new RestTemplate();
		// Page page =
		// restTemplate.getForObject("hhttps://api-fxtrade.oanda.com/labs/v1/signal/autochartist?instrument=EUR_CAD",
		// Page.class);

		ResponseEntity<Page> exchange = restTemplate.exchange(server
				+ "/v1/instruments?accountId=" + accountID, HttpMethod.GET,
				entity, Page.class);

		Instrument[] instruments = exchange.getBody().getInstruments();
		ArrayList<Instrument> instrumentsList = new ArrayList<Instrument>();
		instrumentsList.addAll(instrumentsList);
		
		for (Instrument instrument : instruments) 
		{
			instrumentsList.add(instrument);
		}
		
		return instrumentsList;
	}
}
