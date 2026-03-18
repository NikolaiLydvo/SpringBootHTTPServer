package edu.ntnu.nettsideprosjekt.httpserver.model.JSONParsers.GetAlbumsRecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAlbumsResponse{

	@JsonProperty("topalbums")
	private Topalbums topalbums;

	public Topalbums getTopalbums(){
		return topalbums;
	}

	@Override
 	public String toString(){
		return 
			"GetAlbumsResponse{" + 
			"topalbums = '" + topalbums + '\'' + 
			"}";
		}
}