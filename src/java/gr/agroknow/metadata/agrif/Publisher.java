package gr.agroknow.metadata.agrif;

import org.json.simple.JSONObject;

public class Publisher 
{
	private JSONObject publisher ;
	
	public Publisher()
	{
		publisher = new JSONObject() ;
	}
	
	@SuppressWarnings("unchecked")
	public void setName( String name )
	{
		if ( name != null && !name.isEmpty()  )
		{
			publisher.put( "name" , name ) ;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void setDate( String date )
	{
		if ( date != null && !date.isEmpty()  )
		{
			publisher.put( "date" , date ) ;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void setLocation( String location )
	{
		if ( location != null && !location.isEmpty()  )
		{
			publisher.put( "location" , location ) ;
		}
	}
	
	public JSONObject toJSONObject()
	{
		return publisher ;
	}
	
	public String toJSONString()
	{
		return publisher.toJSONString() ;
	}
}
