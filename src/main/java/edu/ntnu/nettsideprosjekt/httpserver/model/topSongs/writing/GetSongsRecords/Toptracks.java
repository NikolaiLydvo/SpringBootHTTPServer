package edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.GetSongsRecords;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Toptracks{

	@JsonProperty("@attr")
	private Attr attr;

	@JsonProperty("track")
	private List<TrackItem> track;

	public Attr getAttr(){
		return attr;
	}

	public List<TrackItem> getTrack(){
		return track;
	}

	@Override
 	public String toString(){
		return 
			"Toptracks{" + 
			"@attr = '" + attr + '\'' + 
			",track = '" + track + '\'' + 
			"}";
		}
}