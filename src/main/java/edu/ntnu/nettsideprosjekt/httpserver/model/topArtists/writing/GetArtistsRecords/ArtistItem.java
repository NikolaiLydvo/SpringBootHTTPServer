package edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.GetArtistsRecords;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ArtistItem{

	@JsonProperty("image")
	private List<ImageItem> image;

	@JsonProperty("@attr")
	private Attr attr;

	@JsonProperty("mbid")
	private String mbid;

	@JsonProperty("streamable")
	private String streamable;

	@JsonProperty("playcount")
	private String playcount;

	@JsonProperty("name")
	private String name;

	@JsonProperty("url")
	private String url;

	public List<ImageItem> getImage(){
		return image;
	}

	public Attr getAttr(){
		return attr;
	}

	public String getMbid(){
		return mbid;
	}

	public String getStreamable(){
		return streamable;
	}

	public String getPlaycount(){
		return playcount;
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
			"ArtistItem{" + 
			"image = '" + image + '\'' + 
			",@attr = '" + attr + '\'' + 
			",mbid = '" + mbid + '\'' + 
			",streamable = '" + streamable + '\'' + 
			",playcount = '" + playcount + '\'' + 
			",name = '" + name + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}