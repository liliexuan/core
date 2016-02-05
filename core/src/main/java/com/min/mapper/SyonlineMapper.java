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
 * @version $Id: SyonlineMapper.java, v 0.1 Jason.Wang Exp $.
 */
public interface SyonlineMapper extends Serializable{

	/**
	 * 保存Syonline对象
	 * @param syonline
	 */
	public int saveSyonline(Syonline syonline) throws Exception;

	/**
	 * 保存Syonline对象
	 * @param syonline
	 */
	public int saveSyonlineSelective(Syonline syonline) throws Exception;

	/**
	 * 根据id删除Syonline
	 * @param id
	 */
	public void deleteSyonlineByid(java.lang.String id) throws Exception;

	/**
	 * 更新对象Syonline
	 * @param syonline
	 */
	public int updateSyonline(Syonline syonline) throws Exception;

	/**
	 * 根据id获取Syonline
	 * @param id
	 * @return Syonline
	 */
	public Syonline querySyonline(java.lang.String id) throws Exception;

	/**
	 * 根据对象获取所有的Syonline集合
	 * @param syonline
	 * @return List<Syonline>
	 */
	public List<Syonline> querySyonlineList(Syonline syonline) throws Exception;

	/**
	 * 根据对象获取所有的Syonline集合，并且支持分页使用PaginationQueryList对象
	 * @param Map<String,Object> map
	 * @param RowBounds rowBounds
	 * @return List<Syonline>
	 * <pre>
	 * Map&lt;String,Object&gt; map =new HashMap&lt;String,Object&gt;();
	 * map.put("syonline", syonline);
	 * map.put("orderName", orderName);
	 * RowBounds rowBounds = null;
	 * if(0 &lt; pageSize){
	 * 		rowBounds = new RowBounds(currentPage, pageSize, true);
	 * }
	 * List&lt;Syonline&gt; list = syonlineMapper.queryForListWithOrderName(map,rowBounds);
	 * Page page = new Page(currentPage, (pageSize&lt;1?1:pageSize), list instanceof PaginationQueryList?((PaginationQueryList) list).getRowTotal():list.size());
	 * PageModel&lt;Syonline&gt; pageModel = new PageModel&lt;Syonline&gt;();
	 * pageModel.setData(list);
	 * pageModel.setPage(page);
	 * return pageModel;
	 * </pre>
	 */
	public List<Syonline> querySyonlineLists(Map<String, Object> map, RowBounds rowBounds) throws Exception;

}