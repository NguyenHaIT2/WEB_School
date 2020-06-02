package com.laptrinhjavaweb.utils;

import javax.servlet.http.HttpServletRequest;

public class SessionUtil {
	
	//tao quan ly doi tuong
	public static SessionUtil sessionUtil = null;
	
	public static SessionUtil getInstance() {
		if(sessionUtil == null) {
			sessionUtil = new SessionUtil();
		}
		return sessionUtil;
	}
	
	public void putValue(HttpServletRequest request , String key , Object value) {
		request.getSession().setAttribute(key, value);     //
	}
	
	public Object getValue(HttpServletRequest request , String key) {     //khong biet du lieu nao nen dung object roi ep kieu sau
		return request.getSession().getAttribute(key);
	}
	
	public void removeValue(HttpServletRequest request , String key) {
		request.getSession().removeAttribute(key);
	}
}
