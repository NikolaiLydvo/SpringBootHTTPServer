package edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.GetSongsRecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Artist{

	@JsonProperty("mbid")
	private String mbid;

	@JsonProperty("name")
	private String name;

	@JsonProperty("url")
	private String url;

	public String getMbid(){
		return mbid;
	}

	public String getName(){
		return name;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Artist{" + 
			"mbid = '" + mbid + '\'' + 
			",name = '" + name + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}