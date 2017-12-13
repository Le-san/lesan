package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemParamMapper;
import com.taotao.pojo.EasyUIResult;
import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import com.taotao.service.ItemParamService;

@Service
public class ItemParamServiceImpl implements ItemParamService{
	
	@Autowired
	private TbItemParamMapper itemParamMapper;
	
	@Override
	public EasyUIResult getItemParamList(Integer page, Integer rows) {
		
		PageHelper.startPage(page, rows);
		TbItemParamExample tbItemParamExample = new TbItemParamExample();
		List<TbItemParam> list = itemParamMapper.selectByExample(tbItemParamExample);
		
		PageInfo<TbItemParam> pageInfo = new PageInfo<>(list);
		
		EasyUIResult result = new EasyUIResult();
		result.setRows(list);
		result.setTotal(pageInfo.getTotal());
		
		return result;
	}

}
