package analysis;

import model.Instrument;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Page 
{

		private Instrument[] instruments;
//	    private String about;
//	    private String phone;
//	    private String website;
//
	    public Instrument[]  getInstruments() {
	        return instruments;
	    }
//
//	    public String getAbout() {
//	        return about;
//	    }
//
//	    public String getPhone() {
//	        return phone;
//	    }
//
//	    public String getWebsite() {
//	        return website;
//	    }

}
