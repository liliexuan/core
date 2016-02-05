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
 * @version $Id: SyresourceMapper.java, v 0.1 Jason.Wang Exp $.
 */
public interface SyresourceMapper extends Serializable{

	/**
	 * 保存Syresource对象
	 * @param syresource
	 */
	public int saveSyresource(Syresource syresource) throws Exception;

	/**
	 * 保存Syresource对象
	 * @param syresource
	 */
	public int saveSyresourceSelective(Syresource syresource) throws Exception;

	/**
	 * 根据id删除Syresource
	 * @param id
	 */
	public void deleteSyresourceByid(java.lang.String id) throws Exception;

	/**
	 * 更新对象Syresource
	 * @param syresource
	 */
	public int updateSyresource(Syresource syresource) throws Exception;

	/**
	 * 根据id获取Syresource
	 * @param id
	 * @return Syresource
	 */
	public Syresource querySyresource(java.lang.String id) throws Exception;

	/**
	 * 根据对象获取所有的Syresource集合
	 * @param syresource
	 * @return List<Syresource>
	 */
	public List<Syresource> querySyresourceList(Syresource syresource) throws Exception;

	/**
	 * 根据对象获取所有的Syresource集合，并且支持分页使用PaginationQueryList对象
	 * @param Map<String,Object> map
	 * @param RowBounds rowBounds
	 * @return List<Syresource>
	 * <pre>
	 * Map&lt;String,Object&gt; map =new HashMap&lt;String,Object&gt;();
	 * map.put("syresource", syresource);
	 * map.put("orderName", orderName);
	 * RowBounds rowBounds = null;
	 * if(0 &lt; pageSize){
	 * 		rowBounds = new RowBounds(currentPage, pageSize, true);
	 * }
	 * List&lt;Syresource&gt; list = syresourceMapper.queryForListWithOrderName(map,rowBounds);
	 * Page page = new Page(currentPage, (pageSize&lt;1?1:pageSize), list instanceof PaginationQueryList?((PaginationQueryList) list).getRowTotal():list.size());
	 * PageModel&lt;Syresource&gt; pageModel = new PageModel&lt;Syresource&gt;();
	 * pageModel.setData(list);
	 * pageModel.setPage(page);
	 * return pageModel;
	 * </pre>
	 */
	public List<Syresource> querySyresourceLists(Map<String, Object> map, RowBounds rowBounds) throws Exception;

}