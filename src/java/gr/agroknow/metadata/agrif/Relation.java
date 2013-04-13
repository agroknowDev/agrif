package gr.agroknow.metadata.agrif;

import org.json.simple.JSONObject;

public class Relation 
{
	private JSONObject relation ;
	
	public Relation()
	{
		relation = new JSONObject() ;
	}
	
	@SuppressWarnings("unchecked")
	public Relation( String typeOfRelation, String typeOfReference, String reference )
	{
		relation = new JSONObject() ;
		relation.put(  "typeOfRelation", typeOfRelation ) ;
		relation.put(  "typeOfReference", typeOfReference ) ;
		relation.put(  "reference", reference ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setTypeOfRelation( String typeOfRelation )
	{
		relation.put(  "typeOfRelation", typeOfRelation ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setTypeOfReference( String typeOfReference )
	{
		relation.put(  "typeOfReference", typeOfReference ) ;
	}
	
	@SuppressWarnings("unchecked")
	public void setReference( String reference )
	{
		relation.put(  "reference", reference ) ;
	}
	
	
	public JSONObject toJSONObject()
	{
		return relation ;
	}
	
	public String toJSONString()
	{
		return relation.toJSONString() ;
	}
}
