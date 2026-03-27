package edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.GetArtistsRecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageItem{

	@JsonProperty("#text")
	private String text;

	@JsonProperty("size")
	private String size;

	public String getText(){
		return text;
	}

	public String getSize(){
		return size;
	}

	@Override
 	public String toString(){
		return 
			"ImageItem{" + 
			"#text = '" + text + '\'' + 
			",size = '" + size + '\'' + 
			"}";
		}
}