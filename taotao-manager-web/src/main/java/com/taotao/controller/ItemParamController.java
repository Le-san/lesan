package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.EasyUIResult;
import com.taotao.service.ItemParamService;

@Controller
public class ItemParamController {
	
	@Autowired
	private ItemParamService itemParamService;
	
	@RequestMapping("/item/param/list")
	@ResponseBody
	public EasyUIResult getItemList(Integer page, Integer rows) {
		EasyUIResult result = itemParamService.getItemParamList(page, rows);
		
		return result;
	}
}
