package com.service.impl;

import java.util.List;

import com.dao.CateGoryDao;
import com.dao.impl.CateGoryDaoImpl;
import com.entity.Postcate;
import com.service.CateGoryService;
import com.utils.PageUtil;

public class CateGoryServiceImpl implements CateGoryService {
	CateGoryDao dao = new CateGoryDaoImpl();
	
	public PageUtil<Postcate> getProducts(int pageNum, int pageSize) {
		int totalRecord = 0;
		try {
			List<Postcate> ls = dao.findAllPostcates();
			System.out.println(ls.get(0));
			totalRecord = ls.size();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		PageUtil<Postcate> pageUtil = new PageUtil<Postcate>(pageNum, pageSize, totalRecord);
		int startIndex = pageUtil.getStartIndex();
		try {
			List<Postcate> list = dao.getPostcate(startIndex, pageSize);
			pageUtil.setList(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pageUtil;
	}

}
