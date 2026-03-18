package edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.GetSongsRecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Streamable{

	@JsonProperty("#text")
	private String text;

	@JsonProperty("fulltrack")
	private String fulltrack;

	public String getText(){
		return text;
	}

	public String getFulltrack(){
		return fulltrack;
	}

	@Override
 	public String toString(){
		return 
			"Streamable{" + 
			"#text = '" + text + '\'' + 
			",fulltrack = '" + fulltrack + '\'' + 
			"}";
		}
}