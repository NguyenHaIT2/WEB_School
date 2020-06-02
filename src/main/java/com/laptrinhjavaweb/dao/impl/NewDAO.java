package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.model.NewsModel;
import com.laptrinhjavaweb.paging.Pageble;

public class NewDAO extends AbstractDAO<NewsModel> implements INewDAO {
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		String sql = "select * from news where categoryid=?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public Long save(NewsModel newsModel) {
		StringBuilder sql = new StringBuilder("insert into news (title , content , thumbnail ,");
		sql.append(" shortdescription , categoryid , createddate , createdby)");
		sql.append(" value (?,?,?,?,?,?,?)");
		Long id = insert(sql.toString(), newsModel.getTitle(), newsModel.getContent(), newsModel.getThumbnail(),
				newsModel.getShortdescription(), newsModel.getCategoryId(), newsModel.getCreateddate(),
				newsModel.getCreatedby());
		return id;

	}

	@Override
	public NewsModel findOne(Long id) {
		String sql = "select * from news where id=?";
		List<NewsModel> news = query(sql, new NewMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public void update(NewsModel updateNew) {
		StringBuilder sql = new StringBuilder("UPDATE news SET title=?, thumbnail=?,shortdescription=?,content=?,");
		sql.append("categoryid=?,createddate=?,createdby=? ,");
		sql.append("modifieddate=? , modifiedby=? where id=?");
		update(sql.toString(), updateNew.getTitle(), updateNew.getThumbnail(), updateNew.getShortdescription(),
				updateNew.getContent(), updateNew.getCategoryId(), updateNew.getCreateddate(), updateNew.getCreatedby(),
				updateNew.getModifieddate(), updateNew.getModifiedby(), updateNew.getId());

	}

	@Override
	public void delete(Long id) {
		String sql = "delete from news where id=?";
		delete(sql, id);
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT count(*) FROM new_servlet.news";
		return count(sql);
	}

	@Override
	public List<NewsModel> findAll(Pageble pageble) {
		StringBuilder sql = new StringBuilder("select * from news ");
		if(pageble.getSorter()!=null) {
			sql.append("order by "+pageble.getSorter().getSortName()+" "+pageble.getSorter().getSortBy()+"");
		}
		if(pageble.getOffset()!=null && pageble.getLimit()!=null) {
			sql.append(" limit "+pageble.getOffset()+", "+pageble.getLimit()+"");
		}
		String sqls = sql.toString();
		return query(sqls, new NewMapper());
	}

}
