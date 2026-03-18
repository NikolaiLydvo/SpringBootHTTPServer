package edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.GetArtistsRecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetArtistsResponse{

	@JsonProperty("topartists")
	private Topartists topartists;

	public Topartists getTopartists(){
		return topartists;
	}

	@Override
 	public String toString(){
		return 
			"GetArtistsResponse{" + 
			"topartists = '" + topartists + '\'' + 
			"}";
		}
}