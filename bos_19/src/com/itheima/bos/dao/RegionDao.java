package com.itheima.bos.dao;

import java.util.List;

import com.itheima.bos.dao.base.IBaseDao;
import com.itheima.bos.domain.Region;
import com.itheima.bos.utils.PageBean;

public interface RegionDao extends IBaseDao<Region> {

	public List<Region> findByQ(String q);




}
