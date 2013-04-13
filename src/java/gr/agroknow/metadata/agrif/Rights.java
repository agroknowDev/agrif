package gr.agroknow.metadata.agrif;

import org.json.simple.JSONObject;

public class Rights 
{

	private JSONObject rights ;
	
	public Rights()
	{
		rights = new JSONObject() ;
	}
	
	@SuppressWarnings("unchecked")
	public void setIdentifier( String identifier )
	{
		rights.put( "identifier", identifier ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setBlock( String language, String rightsStatement, String termsOfUse )
	{
		JSONObject block = new JSONObject() ;
		block.put( "rightsStatement", rightsStatement ) ;
		block.put( "termsOfUse", termsOfUse ) ;
		rights.put( language, block ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setRightsStatement( String language, String rightsStatement )
	{
		JSONObject block ;
		if ( rights.containsKey( language ) )
		{
			block = (JSONObject)rights.get( language ) ;
		}
		else
		{
			block = new JSONObject() ;
		}
		block.put( "rightsStatement", rightsStatement ) ;
		rights.put( language, block ) ;
	}

	@SuppressWarnings("unchecked")
	public void setTermsOfUse( String language, String termsOfUse )
	{
		JSONObject block ;
		if ( rights.containsKey( language ) )
		{
			block = (JSONObject)rights.get( language ) ;
		}
		else
		{
			block = new JSONObject() ;
		}
		block.put( "termsOfUse", termsOfUse ) ;
		rights.put( language, block ) ;
	}
	
	public JSONObject toJSONObject()
	{
		return rights ;
	}
	
	public String toJSONString()
	{
		return rights.toJSONString() ;
	}
	
}
