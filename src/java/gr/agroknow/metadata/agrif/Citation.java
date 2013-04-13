package gr.agroknow.metadata.agrif;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Citation 
{

	private JSONObject citation ;
	
	public Citation()
	{
		citation = new JSONObject() ;
	}
	
	@SuppressWarnings("unchecked")
	public void setTitle( String title )
	{
		JSONArray titles ;
		if ( citation.containsKey( "title" ) )
		{
			titles = (JSONArray) citation.get( "title" ) ;
		}
		else
		{
			titles = new JSONArray() ;
		}
		titles.add( title ) ;
		citation.put( "title", titles ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setIdentifier( String idType, String id )
	{
		JSONArray ids ;
		if ( citation.containsKey( idType ) )
		{
			ids = (JSONArray) citation.get( idType ) ;
		}
		else
		{
			ids = new JSONArray() ;
		}
		ids.add( id ) ;
		citation.put( idType, ids ) ;
	}

	@SuppressWarnings("unchecked")
	public void setCitationNumber( String number )
	{
		JSONArray numbers ;
		if ( citation.containsKey( "citationNumber" ) )
		{
			numbers = (JSONArray) citation.get( "citationNumber" ) ;
		}
		else
		{
			numbers = new JSONArray() ;
		}
		numbers.add( number ) ;
		citation.put( "citationNumber", numbers ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setCitationChronology( String chronology )
	{
		JSONArray chronologies ;
		if ( citation.containsKey( "citationChronology" ) )
		{
			chronologies = (JSONArray) citation.get( "citationChronology" ) ;
		}
		else
		{
			chronologies = new JSONArray() ;
		}
		chronologies.add( chronology ) ;
		citation.put( "citationChronology", chronologies ) ;
	}
	
	public JSONObject toJSONObject()
	{
		return citation ;
	}
	
	public String toJSONString()
	{
		return citation.toJSONString() ;
	}
	
}
