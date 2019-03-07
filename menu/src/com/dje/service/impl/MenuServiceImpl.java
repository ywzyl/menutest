package com.dje.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dje.mapper.MenuMapper;
import com.dje.pojo.Menu;
import com.dje.service.MenuService;
@Service
public class MenuServiceImpl implements MenuService{
	@Resource
	private MenuMapper menuMapper;

	@Override
	public List<Menu> show() {		
		return menuMapper.selByPid(0);
	}
	
}
