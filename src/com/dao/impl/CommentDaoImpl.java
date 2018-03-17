package com.dao.impl;

import java.util.List;

import com.dao.CommentDao;
import com.entity.Comment;
import com.entity.UserWithComment;

public class CommentDaoImpl implements CommentDao {

	@Override
	public List<UserWithComment> getCommentListByPoid(int poid) throws Exception {
		String sql = "select uname,a.uid,poid,ccontent,ctime from tb_comment a left join tb_userinfo b on a.uid=b.uid where poid = ?";
		List<UserWithComment> list = BaseDao.query(sql, UserWithComment.class, poid);
		return list;
	}

	@Override
	public int delAllCommentByPoid(int poid) throws Exception {
		String sql = "delete from tb_comment where poid = ?";
		return BaseDao.update(sql, poid);
	}

	@Override
	public int addComment(int uid, int poid, String commentContent) throws Exception {
		String sql = "insert into tb_comment(uid,poid,ccontent) values(?,?,?)";
		return BaseDao.update(sql, uid,poid,commentContent);
	}

}
