package edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.GetSongsRecords;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TrackItem{

	@JsonProperty("duration")
	private String duration;

	@JsonProperty("image")
	private List<ImageItem> image;

	@JsonProperty("@attr")
	private Attr attr;

	@JsonProperty("mbid")
	private String mbid;

	@JsonProperty("streamable")
	private Streamable streamable;

	@JsonProperty("artist")
	private Artist artist;

	@JsonProperty("playcount")
	private String playcount;

	@JsonProperty("name")
	private String name;

	@JsonProperty("url")
	private String url;

	public String getDuration(){
		return duration;
	}

	public List<ImageItem> getImage(){
		return image;
	}

	public Attr getAttr(){
		return attr;
	}

	public String getMbid(){
		return mbid;
	}

	public Streamable getStreamable(){
		return streamable;
	}

	public Artist getArtist(){
		return artist;
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
			"TrackItem{" + 
			"duration = '" + duration + '\'' + 
			",image = '" + image + '\'' + 
			",@attr = '" + attr + '\'' + 
			",mbid = '" + mbid + '\'' + 
			",streamable = '" + streamable + '\'' + 
			",artist = '" + artist + '\'' + 
			",playcount = '" + playcount + '\'' + 
			",name = '" + name + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}