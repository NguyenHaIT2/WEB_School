package com.laptrinhjavaweb.controller.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.model.NewsModel;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.service.ICategoryService;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.sort.Sorter;
import com.laptrinhjavaweb.utils.FormUtil;

@WebServlet(urlPatterns = { "/admin-new" })
public class NewController extends HttpServlet {
	private static final long serialVersionUID = 2686801510274002166L;
	@Inject
	private INewService newService;
	@Inject
	private ICategoryService categoryService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		NewsModel model = FormUtil.toModel(NewsModel.class, request);
		String view="";
		if(model.getType().equals(SystemConstant.LIST)) {
			Integer offset = model.getPage();
			Integer limit = model.getMaxPageItem();
			Pageble pageble = new PageRequest(offset, limit, 
					new Sorter(model.getSortName(), model.getSortBy()));
			model.setListResult(newService.findAll(pageble));
			model.setTotalItem(newService.getTotalItem());
			model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));
			request.setAttribute(SystemConstant.MODEL, model);
			view="/views/admin/new/list.jsp";
			
		}else if(model.getType().equals(SystemConstant.EDIT)) {
			if(model.getId()!=null) {
				model = newService.findOne(model.getId());
			}else {
				
			}
			request.setAttribute("categories", categoryService.findAll());
			view="/views/admin/new/edit.jsp";
			
		}
		request.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServerException, IOException {

	}
}
