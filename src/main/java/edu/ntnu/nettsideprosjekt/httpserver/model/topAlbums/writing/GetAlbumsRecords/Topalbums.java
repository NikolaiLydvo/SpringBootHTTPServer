package edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing.GetAlbumsRecords;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Topalbums{

	@JsonProperty("@attr")
	private Attr attr;

	@JsonProperty("album")
	private List<AlbumItem> album;

	public Attr getAttr(){
		return attr;
	}

	public List<AlbumItem> getAlbum(){
		return album;
	}

	@Override
 	public String toString(){
		return 
			"Topalbums{" + 
			"@attr = '" + attr + '\'' + 
			",album = '" + album + '\'' + 
			"}";
		}
}