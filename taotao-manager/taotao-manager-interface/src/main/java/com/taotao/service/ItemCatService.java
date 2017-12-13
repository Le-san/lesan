package com.taotao.service;

import java.util.List;

import com.taotao.pojo.EasyUITreeNode;

public interface ItemCatService {
	public List<EasyUITreeNode> getCatList(long parentId);
}
