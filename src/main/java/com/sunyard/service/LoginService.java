package com.sunyard.service;


import com.alibaba.fastjson.JSONArray;

public interface LoginService {
    //查询登录是否正确
	int selectByExample(String username, String password);
	
	//查询所有用户
     public	JSONArray   selectall(int pageNum);
}
