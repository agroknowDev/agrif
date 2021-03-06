package gr.agroknow.metadata.agrif;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class LanguageBlock 
{
	private JSONObject blocks ;
	
	public LanguageBlock()
	{
		blocks = new JSONObject() ;
	}
		
	@SuppressWarnings("unchecked")
	public void setTitle( String language, String title )
	{
		JSONObject block ;
		if ( blocks.containsKey( language ) )
		{
			block = (JSONObject)blocks.get( language ) ;
		}
		else
		{
			block = new JSONObject() ;
		}
		block.put( "title", title ) ;
		blocks.put( language, block ) ;
	}
	
	public boolean hasTitle( String language )
	{
		if ( !blocks.containsKey( language ) )
		{
			return false ;
		}
		else
		{
			JSONObject block = (JSONObject)blocks.get( language ) ;
			return block.containsKey( "title" ) ;
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public void setAlternativeTitle( String language, String alttitle )
	{
		JSONObject block ;
		JSONArray alttitles ;
		if ( blocks.containsKey( language ) )
		{
			block = (JSONObject)blocks.get( language ) ;
			if ( block.containsKey( "alternativeTitle" ) )
			{
				alttitles = (JSONArray)block.get( "alternativeTitle" ) ;
			}
			else
			{
				alttitles = new JSONArray() ;
			}
		}
		else
		{
			block = new JSONObject() ;
			alttitles = new JSONArray() ;
		}
		alttitles.add( alttitle ) ;
		block.put( "alternativeTitle", alttitles ) ;
		blocks.put( language, block ) ;
	}

	@SuppressWarnings("unchecked")
	public void setTitleSupplemental( String language, String suptitle )
	{
		JSONObject block ;
		JSONArray suptitles ;
		if ( blocks.containsKey( language ) )
		{
			block = (JSONObject)blocks.get( language ) ;
			if ( block.containsKey( "titleSupplemental" ) )
			{
				suptitles = (JSONArray)block.get( "titleSupplemental" ) ;
			}
			else
			{
				suptitles = new JSONArray() ;
			}
		}
		else
		{
			block = new JSONObject() ;
			suptitles = new JSONArray() ;
		}
		suptitles.add( suptitle ) ;
		block.put( "titleSupplemental", suptitles ) ;
		blocks.put( language, block ) ;
	}
	
	
	@SuppressWarnings("unchecked")
	public void setKeyword( String language, String keyword )
	{
		JSONObject block ;
		JSONArray keywords ;
		if ( blocks.containsKey( language ) )
		{
			block = (JSONObject)blocks.get( language ) ;
			if ( block.containsKey( "keywords" ) )
			{
				keywords = (JSONArray)block.get( "keywords" ) ;
			}
			else
			{
				keywords = new JSONArray() ;
			}
		}
		else
		{
			block = new JSONObject() ;
			keywords = new JSONArray() ;
		}
		keywords.add( keyword ) ;
		block.put( "keywords", keywords ) ;
		blocks.put( language, block ) ;
	}
	
	
	@SuppressWarnings("unchecked")
	public void setAbstract( String language, String abstrct )
	{
		JSONObject block ;
		if ( blocks.containsKey( language ) )
		{
			block = (JSONObject)blocks.get( language ) ;
		}
		else
		{
			block = new JSONObject() ;
		}
		block.put( "abstract", abstrct ) ;
		blocks.put( language, block ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setNotes( String language, String note )
	{
		JSONObject block ;
		JSONArray notes ;
		if ( blocks.containsKey( language ) )
		{
			block = (JSONObject)blocks.get( language ) ;
			if ( block.containsKey( "notes" ) )
			{
				notes = (JSONArray)block.get( "notes" ) ;
			}
			else
			{
				notes = new JSONArray() ;
			}
		}
		else
		{
			block = new JSONObject() ;
			notes = new JSONArray() ;
		}
		notes.add( note ) ;
		block.put( "notes", notes ) ;
		blocks.put( language, block ) ;
	}
	
	
	
	public JSONObject toJSONObject()
	{
		return blocks ;
	}
	
	public String toJSONString()
	{
		return blocks.toJSONString() ;
	}

}
