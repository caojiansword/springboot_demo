package com.sunyard.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunyard.dao.RMMapper;
import com.sunyard.model.RM;
import com.sunyard.model.RMExample;
import com.sunyard.model.RMExample.Criteria;
import com.sunyard.service.ResourceService;
@Service
@Transactional(rollbackFor=Exception.class)
public class ResourceServiceImpl  implements ResourceService {
    @Autowired
    RMMapper rmMapper;
	
    //新增用户
	@Override
	public int adduser(RM rm) {
		int h=rmMapper.insert(rm);
		return h;
	}
	//删除用户
	@Override
	public int deleteuser(String id) {
		RMExample example=new RMExample();
		Criteria cr=example.createCriteria();
		cr.andIdEqualTo(id);
		int  h=rmMapper.deleteByExample(example);
		return h;
	}
	//资源管理-编辑用户
	@Override
	public int updateuser(String id,RM rm) {
		RMExample example=new RMExample();
		Criteria cr=example.createCriteria();
		cr.andIdEqualTo(id);
		int  h=rmMapper.updateByExample(rm, example);
		return h;
	}

}
