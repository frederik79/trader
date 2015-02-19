package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Instrument 
{
	private String instrument;
	
	public String getInstrument() 
	{
        return instrument;
    }
}
