/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.mapper;
import java.io.Serializable;

import java.util.*;

import org.apache.ibatis.session.RowBounds;

import com.min.model.*;

/**
 *
 * @author Jason.Wang
 * @version $Id: SyorganizationMapper.java, v 0.1 Jason.Wang Exp $.
 */
public interface SyorganizationMapper extends Serializable{

	/**
	 * 保存Syorganization对象
	 * @param syorganization
	 */
	public int saveSyorganization(Syorganization syorganization) throws Exception;

	/**
	 * 保存Syorganization对象
	 * @param syorganization
	 */
	public int saveSyorganizationSelective(Syorganization syorganization) throws Exception;

	/**
	 * 根据id删除Syorganization
	 * @param id
	 */
	public void deleteSyorganizationByid(java.lang.String id) throws Exception;

	/**
	 * 更新对象Syorganization
	 * @param syorganization
	 */
	public int updateSyorganization(Syorganization syorganization) throws Exception;

	/**
	 * 根据id获取Syorganization
	 * @param id
	 * @return Syorganization
	 */
	public Syorganization querySyorganization(java.lang.String id) throws Exception;

	/**
	 * 根据对象获取所有的Syorganization集合
	 * @param syorganization
	 * @return List<Syorganization>
	 */
	public List<Syorganization> querySyorganizationList(Syorganization syorganization) throws Exception;

	/**
	 * 根据对象获取所有的Syorganization集合，并且支持分页使用PaginationQueryList对象
	 * @param Map<String,Object> map
	 * @param RowBounds rowBounds
	 * @return List<Syorganization>
	 * <pre>
	 * Map&lt;String,Object&gt; map =new HashMap&lt;String,Object&gt;();
	 * map.put("syorganization", syorganization);
	 * map.put("orderName", orderName);
	 * RowBounds rowBounds = null;
	 * if(0 &lt; pageSize){
	 * 		rowBounds = new RowBounds(currentPage, pageSize, true);
	 * }
	 * List&lt;Syorganization&gt; list = syorganizationMapper.queryForListWithOrderName(map,rowBounds);
	 * Page page = new Page(currentPage, (pageSize&lt;1?1:pageSize), list instanceof PaginationQueryList?((PaginationQueryList) list).getRowTotal():list.size());
	 * PageModel&lt;Syorganization&gt; pageModel = new PageModel&lt;Syorganization&gt;();
	 * pageModel.setData(list);
	 * pageModel.setPage(page);
	 * return pageModel;
	 * </pre>
	 */
	public List<Syorganization> querySyorganizationLists(Map<String, Object> map, RowBounds rowBounds) throws Exception;

}