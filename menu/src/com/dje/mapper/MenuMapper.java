package com.dje.mapper;

import java.util.List;

import com.dje.pojo.Menu;

public interface MenuMapper {
	List<Menu> selByPid(int pid);
}
