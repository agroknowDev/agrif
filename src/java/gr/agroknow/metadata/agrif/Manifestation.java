package gr.agroknow.metadata.agrif;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Manifestation 
{

	private JSONObject manifestation ;
	
	public Manifestation()
	{
		manifestation = new JSONObject() ;
	}
	
	@SuppressWarnings("unchecked")
	public void setItem( Item item )
	{
		JSONArray items ;
		if ( manifestation.containsKey( "items" ) )
		{
			items = (JSONArray)manifestation.get( "items" ) ;
		}
		else
		{
			items = new JSONArray() ;
		}
		items.add( item.toJSONObject() ) ;
		manifestation.put( "items" , items ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setIdentifier( String idType, String id )
	{
		JSONArray ids ;
		if ( manifestation.containsKey( idType ) )
		{
			ids = (JSONArray) manifestation.get( idType ) ;
		}
		else
		{
			ids = new JSONArray() ;
		}
		ids.add( id ) ;
		manifestation.put( idType, ids ) ;
	}

	@SuppressWarnings("unchecked")
	public void setFormat( String format )
	{
		/*JSONArray formats ;
		if ( manifestation.containsKey( "format" ) )
		{
			formats = (JSONArray)manifestation.get( "format" ) ;
		}
		else
		{
			formats = new JSONArray() ;
		}
		formats.add( format ) ;
		manifestation.put( "format" , formats ) ;*/
            manifestation.put( "format", format ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setManifestationType( String mType )
	{
		manifestation.put( "manifestationType", mType ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setDescription( String language, String description )
	{
		JSONObject descriptions ;
		if ( manifestation.containsKey( "description" ) )
		{
			descriptions = (JSONObject)manifestation.get( "description" ) ;
		}
		else
		{
			descriptions = new JSONObject() ;
		}
		descriptions.put( language, description ) ;
		manifestation.put( "description", descriptions ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setDuration( String duration )
	{
		manifestation.put( "duration", duration ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setSize( String size )
	{
		manifestation.put( "size", size ) ;
	}
	
	public JSONObject toJSONObject()
	{
		return manifestation ;
	}
	
	public String toJSONString()
	{
		return manifestation.toJSONString() ;
	}

	
}
