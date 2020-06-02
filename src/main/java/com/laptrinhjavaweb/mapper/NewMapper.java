package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.NewsModel;

public class NewMapper implements RowMapper<NewsModel> {

	@Override
	public NewsModel mapRow(ResultSet rs) {
		try {
			NewsModel news = new NewsModel();
			news.setId(rs.getLong("id"));
			news.setTitle(rs.getString("title"));
			news.setContent(rs.getString("content"));
			news.setCategoryId(rs.getLong("categoryId"));
			news.setThumbnail(rs.getString("thumbnail"));
			news.setShortdescription(rs.getString("shortdescription"));
			news.setCreateddate(rs.getTimestamp("createddate"));
			news.setCreatedby(rs.getString("createdby"));
			news.setModifieddate(rs.getTimestamp("modifieddate"));
			news.setModifiedby(rs.getString("modifiedby"));
			return news;
		} catch (SQLException e) {
			return null;
		}
		
	}
	
}
