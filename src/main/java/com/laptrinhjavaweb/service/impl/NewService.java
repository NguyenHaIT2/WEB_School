package com.laptrinhjavaweb.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.model.NewsModel;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.INewService;

public class NewService implements INewService {
	
	@Inject
	private INewDAO newDAO ;
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		return newDAO.findByCategoryId(categoryId);
	}
	@Override
	public NewsModel save(NewsModel newsModel) {
		newsModel.setCreateddate(new Timestamp(System.currentTimeMillis()));
		Long newId = newDAO.save(newsModel);
		return newDAO.findOne(newId);
	}
	@Override
	public NewsModel update(NewsModel updateNew) {
		NewsModel oldNew = newDAO.findOne(updateNew.getId());
		updateNew.setCreateddate(oldNew.getCreateddate());
		updateNew.setCreatedby(oldNew.getCreatedby());
		updateNew.setModifieddate(new Timestamp(System.currentTimeMillis()));
		newDAO.update(updateNew);
		return newDAO.findOne(updateNew.getId());
	}
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids) {
			newDAO.delete(id);
		}
		
	}
	@Override
	public List<NewsModel> findAll(Pageble pageble) {
		return newDAO.findAll(pageble);
	}
	@Override
	public int getTotalItem() {
		return newDAO.getTotalItem();
	}
	@Override
	public NewsModel findOne(Long id) {
		
		return newDAO.findOne(id);
	}
	
}
