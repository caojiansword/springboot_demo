package com.sunyard.service;

import com.sunyard.model.RM;

public interface ResourceService {
    //资源管理-添加用户
	public int adduser(RM rm);
	
	//资源管理-删除用户
	public int deleteuser(String id);
	
	//资源管理-编辑用户
	public int updateuser(String id,RM rm);
}
