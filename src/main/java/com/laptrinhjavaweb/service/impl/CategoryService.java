package com.laptrinhjavaweb.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.model.CategoryModel;
import com.laptrinhjavaweb.service.ICategoryService;

public class CategoryService implements ICategoryService {
	
	//Nhung DAO v�o Service thu cong
	/*
	 * private ICategoryDAO categoryDAO;
	 * 
	 * public CategoryService() { categoryDAO = new CategoryDAO(); }
	 */
	@Inject
	private ICategoryDAO categoryDAO;
	@Override
	public List<CategoryModel> findAll() {
		return categoryDAO.findAll();
	}

}
