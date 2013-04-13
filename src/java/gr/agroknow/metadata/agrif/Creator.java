package gr.agroknow.metadata.agrif;

import org.json.simple.JSONObject;

public class Creator 
{
	private JSONObject creator ;
	
	public Creator()
	{
		creator = new JSONObject() ;
	}
	
	@SuppressWarnings("unchecked")
	public Creator( String type, String name, String identifier )
	{
		creator = new JSONObject() ;
		creator.put( "type", type ) ;
		creator.put( "name", name ) ;
		creator.put( "identifier", identifier ) ;
	}
	
	@SuppressWarnings("unchecked")
	public Creator( String type, String name )
	{
		creator = new JSONObject() ;
		creator.put( "type", type ) ;
		creator.put( "name", name ) ;
	}

	@SuppressWarnings("unchecked")
	public void setIdentifier( String identifier )
	{
		creator.put( "identifier", identifier ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setName( String name )
	{
		creator.put( "name", name ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setType( String type )
	{
		creator.put( "type", type ) ;
	}
	
	public JSONObject toJSONObject()
	{
		return creator ;
	}
	
	public String toJSONString()
	{
		return creator.toJSONString() ;
	}
	

	
}
