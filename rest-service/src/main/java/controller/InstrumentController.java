package controller;

import java.util.ArrayList;
import java.util.List;

import model.Instrument;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.InstrumentService;

@RestController
public class InstrumentController 
{

	 @Autowired
	 private InstrumentService instrumentService;

	    @RequestMapping("/instruments")
	    public String listPeople(ArrayList<String> list) 
	    {
	    	String display = "";
	    	
	    	List<Instrument> listInstruments = instrumentService.getInstruments();
	    	
	    	for (Instrument instrument : listInstruments) 
	    	{
	    		display += instrument.getInstrument() + "<br>";
	    		list.add(instrument.getInstrument());
			}
	    	
	        return display;
	    }
	
}
