package com.sunyard.service.impl;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.sunyard.dao.RMMapper;
import com.sunyard.dao.UserMapper;
import com.sunyard.model.RM;
import com.sunyard.model.RMExample;
import com.sunyard.model.UserExample;
import com.sunyard.service.LoginService;
@Service
@Transactional  //spring boot中的事物管理 不仅可以作用在类上，还可以作用在方法上
public class LoginServiceImpl implements LoginService {
      
	@Autowired
	private  UserMapper usermapper;
	@Autowired
	public  RMMapper rmMapper;
	@Override
	public int selectByExample(String username, String password) {
		   UserExample example=new UserExample();
		   com.sunyard.model.UserExample.Criteria criteria=example.createCriteria();
		   criteria.andNameEqualTo(username);
		   criteria.andPasswordEqualTo(password);  
		  int count=(int) usermapper.countByExample(example);
		   if (count==1) {
			   return 1;
		     }else{
		    	 return 0;
		     }
	}
	//查询所有用户
	@Override
	public JSONArray selectall(int pageNum) {
		   RMExample example=new RMExample();
		   PageHelper.startPage(pageNum, 2);  
		   List<RM> list=rmMapper.selectByExample(example);
		   RMExample example1=new RMExample();
		   List<RM> list1=rmMapper.selectByExample(example1);
		   int alltiaoshu=list1.size();
		   JSONArray json=new JSONArray();
		   json.add(alltiaoshu);
		   json.add(list);
		return json;
	}
}




