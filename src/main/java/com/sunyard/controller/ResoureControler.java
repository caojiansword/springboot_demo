package com.sunyard.controller;


import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sunyard.model.RM;
import com.sunyard.service.ResourceService;
import com.sunyard.util.IdGenerator;

@Controller
public class ResoureControler {
	
	@Autowired
	ResourceService resourceService;
	/*
	 * 资源管理页面添加用户
	 */
	@RequestMapping(value="/addsure")
	@ResponseBody
	public  Map<String, Object> insertuser(String ziyuanbaioshi,String fenleijineng,String suoshufenlei){
		   Map<String, Object> map = new HashMap<String, Object>();
		RM rm=new RM();
		rm.setId(IdGenerator.PrimaryKey());
		rm.setZiyuanbaoshi(ziyuanbaioshi);
		rm.setSuoshufenlei(suoshufenlei);
		rm.setFenleijineng(fenleijineng);
		int h =resourceService.adduser(rm);
		if (h==1) {
			map.put("result", "1");
		}else{
			map.put("result", "2");
		}
		return map;
	}
	
	
	/*
	 * delleteuser 删除用户
	 */
	@RequestMapping(value="/delleteuser")
	@ResponseBody
	public Map<String, Object> deleteuser(String str){
		  Map<String, Object> map = new HashMap<String, Object>();
		String[] array=new String[100];
		array=str.split(",");
		int h=0;
		for(String id:array){
	     h=resourceService.deleteuser(id);
		}
		if (h==1) {
			map.put("result", "1");
		}else{
			map.put("result", "2");
		}
		return map;
	}
	
	/*
	 * updatesure 资源管理编辑
	 * 
	 */
	@RequestMapping(value="/updatesure")
	@ResponseBody
	public Map<String, Object> updateuser(String updateid,String updatebiaoshi,String updatename,String updatefenlei){
		  Map<String, Object> map = new HashMap<String, Object>();
		  RM rm=new RM();
		  rm.setId(updateid);
		  rm.setZiyuanbaoshi(updatebiaoshi);
		  rm.setFenleijineng(updatename);
		  rm.setSuoshufenlei(updatefenlei);
		  int h =resourceService.updateuser(updateid, rm);
			if (h==1) {
				map.put("result", "1");
			}else{
				map.put("result", "2");
			}
		  return map;
	}
}
