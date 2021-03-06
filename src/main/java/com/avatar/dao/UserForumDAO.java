package com.avatar.dao;

import java.util.List;

import com.avatar.model.UserForum;
import com.avatar.model.UserForumComments;



public interface UserForumDAO {

	public List<UserForum> listAllForums();
	
	public boolean addForum(UserForum userforum);
	
	public List<UserForum> getForumByID(int forumid);
	
	public boolean getUpdateLike(int forumid);
	
	public boolean updateApprove(int forumid, char flag);

	public List<UserForumComments> listAllForumComments(int forumid);
	
	public boolean addForumComment(UserForumComments userforumcmt);
	
	public void updateForumCommentsCount(int forumid);
	
	public boolean deleteForum(int forumid);
}
