package com.taotao.service;

import com.taotao.pojo.EasyUIResult;
import com.taotao.pojo.TaotaoResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	
	public EasyUIResult getItemList(Integer page,Integer rows);
	public TaotaoResult addItem(TbItem item, String desc);
}
