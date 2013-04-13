package gr.agroknow.metadata.agrif;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Item 
{

	private JSONObject item ;
	
	public Item()
	{
		item = new JSONObject() ;
	}
	
	@SuppressWarnings("unchecked")
	public void setPhysicalItem( String location, String number )
	{
		item.put( "location", location ) ;
		item.put( "number", number ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setDigitalItem( String url )
	{
		item.put( "url", url ) ;
		item.put( "isBroken", false ) ;
	}
	
	public JSONObject toJSONObject()
	{
		return item ;
	}
	
	public String toJSONString()
	{
		return item.toJSONString() ;
	}

	
}
