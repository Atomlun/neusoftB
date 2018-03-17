package com.service;

import java.util.List;

import com.entity.Comment;
import com.entity.UserWithComment;

public interface CommentService {

	List<UserWithComment> getCommentListByPoid(int poid);

	int delAllCommentByPoid(int poid);

	int addComment(int uid, int poid, String commentContent);

}
