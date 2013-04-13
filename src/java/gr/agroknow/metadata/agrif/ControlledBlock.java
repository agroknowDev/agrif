package gr.agroknow.metadata.agrif;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ControlledBlock 
{
	private JSONObject controlled ;
	
	
	public ControlledBlock()
	{
		controlled = new JSONObject() ;
	}

	@SuppressWarnings("unchecked")
	public void setDescriptor( String thesaurus, String descriptor )
	{
		JSONArray descriptors ;
		if ( controlled.containsKey( thesaurus ) )
		{
			descriptors = (JSONArray) controlled.get( thesaurus ) ;
		}
		else
		{
			descriptors = new JSONArray() ;
		}
		descriptors.add( descriptor ) ;
		controlled.put( thesaurus, descriptors ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setType( String type )
	{
		JSONArray types ;
		if ( controlled.containsKey( "type" ) )
		{
			types = (JSONArray) controlled.get( "type" ) ;
		}
		else
		{
			types = new JSONArray() ;
		}
		types.add( type ) ;
		controlled.put( "type", types ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setSpatialCoverage( String source, String value )
	{
		JSONArray scoverages ;
		if ( controlled.containsKey( "spatialCoverage" ) )
		{
			scoverages = (JSONArray) controlled.get( "spatialCoverage" ) ;
		}
		else
		{
			scoverages = new JSONArray() ;
		}
		JSONObject scoverage = new JSONObject() ;
		scoverage.put( "source", source ) ;
		scoverage.put( "value", value ) ;
		scoverages.add( scoverage ) ;
		controlled.put( "spatialCoverage", scoverages ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setTemporalCoverage( String source, String value )
	{
		JSONArray tcoverages ;
		if ( controlled.containsKey( "temporalCoverage" ) )
		{
			tcoverages = (JSONArray) controlled.get( "temporalCoverage" ) ;
		}
		else
		{
			tcoverages = new JSONArray() ;
		}
		JSONObject tcoverage = new JSONObject() ;
		tcoverage.put( "source", source ) ;
		tcoverage.put( "value", value ) ;
		tcoverages.add( tcoverage ) ;
		controlled.put( "temporalCoverage", tcoverages ) ;
	}
		
	public JSONObject toJSONObject()
	{
		return controlled ;
	}
	
	public String toJSONString()
	{
		return controlled.toJSONString() ;
	}
	
}
