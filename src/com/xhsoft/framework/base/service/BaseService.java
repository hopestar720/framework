package com.xhsoft.framework.base.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.xhsoft.framework.base.entity.PageInfo;

public interface BaseService<T> extends Serializable {
	
	/**
	 * 根据参数分页查询结果
	 * @param params
	 * @param pageNo
	 * @param limit
	 * @return 
	 * @author hopestar720@126.com
	 * @since 2013年11月29日
	 */
	public PageInfo<T> findByPage(Map<String, Object> params, int pageNo, int limit);
	public List<T> findByParam(Map<String, Object> params,int start,int end);
	public List<T> findByParam(Map<String, Object> params);
	public List<T> findAll();
	public T findUniqueByParam(Map<String, Object> params);
	public T findByPrimaryKey(Object pk);
	
	public T insert(T entity);
	public void insertBatch(final Collection<T> entities);
	
	public T delete(T entity);
	public T deleteByPrimaryKey(Object pk);
	public int deleteBatch(final Collection<T> entities);
	public int deleteAll();
	
	public T update(T entity);
	public int updateBatch(final Collection<T> entities);

}
