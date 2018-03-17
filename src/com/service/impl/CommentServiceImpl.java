package com.service.impl;

import java.util.List;

import com.dao.CommentDao;
import com.dao.impl.CommentDaoImpl;
import com.entity.Comment;
import com.entity.UserWithComment;
import com.service.CommentService;

public class CommentServiceImpl implements CommentService {

	private CommentDao dao = null ;
	public CommentServiceImpl() {
		dao = new CommentDaoImpl();
	}
	@Override
	public List<UserWithComment> getCommentListByPoid(int poid) {
		try {
			return dao.getCommentListByPoid(poid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int delAllCommentByPoid(int poid) {
		try {
			return dao.delAllCommentByPoid(poid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public int addComment(int uid, int poid, String commentContent) {
		try {
			return dao.addComment(uid,poid,commentContent);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
