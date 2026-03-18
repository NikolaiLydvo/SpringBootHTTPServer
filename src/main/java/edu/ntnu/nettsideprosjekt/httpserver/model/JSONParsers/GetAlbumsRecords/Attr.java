package edu.ntnu.nettsideprosjekt.httpserver.model.JSONParsers.GetAlbumsRecords;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attr{

	@JsonProperty("total")
	private String total;

	@JsonProperty("perPage")
	private String perPage;

	@JsonProperty("totalPages")
	private String totalPages;

	@JsonProperty("page")
	private String page;

	@JsonProperty("user")
	private String user;

	@JsonProperty("rank")
	private String rank;

	public String getTotal(){
		return total;
	}

	public String getPerPage(){
		return perPage;
	}

	public String getTotalPages(){
		return totalPages;
	}

	public String getPage(){
		return page;
	}

	public String getUser(){
		return user;
	}

	public String getRank(){
		return rank;
	}

	@Override
 	public String toString(){
		return 
			"Attr{" + 
			"total = '" + total + '\'' + 
			",perPage = '" + perPage + '\'' + 
			",totalPages = '" + totalPages + '\'' + 
			",page = '" + page + '\'' + 
			",user = '" + user + '\'' + 
			",rank = '" + rank + '\'' + 
			"}";
		}
}