package edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.GetSongsRecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetsongsResponse{

	@JsonProperty("toptracks")
	private Toptracks toptracks;

	public Toptracks getToptracks(){
		return toptracks;
	}

	@Override
 	public String toString(){
		return 
			"GetsongsResponse{" + 
			"toptracks = '" + toptracks + '\'' + 
			"}";
		}
}