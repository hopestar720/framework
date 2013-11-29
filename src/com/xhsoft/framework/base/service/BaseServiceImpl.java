package com.xhsoft.framework.base.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.xhsoft.framework.base.dao.BaseDao;
import com.xhsoft.framework.base.entity.AbstractEntity;
import com.xhsoft.framework.base.entity.PageInfo;
import com.xhsoft.framework.base.utils.AppServiceHelper;

public class BaseServiceImpl<T extends AbstractEntity> implements BaseService<T> {
	
	/** serialVersionUID */
	private static final long serialVersionUID = 7961801334030071911L;

	private BaseDao baseDao;

	@Override
	public PageInfo<T> findByPage(Map<String, Object> params, int pageNo,
			int limit) {
		return null;
	}

	@Override
	public List<T> findByParam(Map<String, Object> params, int start, int end) {
		return null;
	}

	@Override
	public List<T> findByParam(Map<String, Object> params) {
		return null;
	}

	@Override
	public List<T> findAll() {
		return null;
	}

	@Override
	public T findUniqueByParam(Map<String, Object> params) {
		return null;
	}

	@Override
	public T findByPrimaryKey(Object pk) {
		return null;
	}

	@Override
	public T insert(T entity) {
		return null;
	}

	@Override
	public void insertBatch(Collection<T> entities) {
	}

	@Override
	public T delete(T entity) {
		return null;
	}

	@Override
	public T deleteByPrimaryKey(Object pk) {
		return null;
	}

	@Override
	public int deleteBatch(Collection<T> entities) {
		return 0;
	}

	@Override
	public int deleteAll() {
		return 0;
	}

	@Override
	public T update(T entity) {
		return null;
	}

	@Override
	public int updateBatch(Collection<T> entities) {
		return 0;
	}

	public BaseDao getBaseDao() {
		baseDao = (BaseDao<T>)AppServiceHelper.findBean(entityName+"Dao");
		return baseDao;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

}
