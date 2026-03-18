package edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.GetArtistsRecords;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Topartists{

	@JsonProperty("@attr")
	private Attr attr;

	@JsonProperty("artist")
	private List<ArtistItem> artist;

	public Attr getAttr(){
		return attr;
	}

	public List<ArtistItem> getArtist(){
		return artist;
	}

	@Override
 	public String toString(){
		return 
			"Topartists{" + 
			"@attr = '" + attr + '\'' + 
			",artist = '" + artist + '\'' + 
			"}";
		}
}