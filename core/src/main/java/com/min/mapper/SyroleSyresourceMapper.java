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
 * @version $Id: SyroleSyresourceMapper.java, v 0.1 Jason.Wang Exp $.
 */
public interface SyroleSyresourceMapper extends Serializable{

	/**
	 * 保存SyroleSyresource对象
	 * @param syroleSyresource
	 */
	public int saveSyroleSyresource(SyroleSyresource syroleSyresource) throws Exception;

	/**
	 * 保存SyroleSyresource对象
	 * @param syroleSyresource
	 */
	public int saveSyroleSyresourceSelective(SyroleSyresource syroleSyresource) throws Exception;

	/**
	 * 根据syresourceId删除SyroleSyresource
	 * @param syresourceId
	 */
	public void deleteSyroleSyresourceBysyresourceId(java.lang.String syresourceId) throws Exception;

	/**
	 * 更新对象SyroleSyresource
	 * @param syroleSyresource
	 */
	public int updateSyroleSyresource(SyroleSyresource syroleSyresource) throws Exception;

	/**
	 * 根据syresourceId获取SyroleSyresource
	 * @param syresourceId
	 * @return SyroleSyresource
	 */
	public SyroleSyresource querySyroleSyresource(java.lang.String syresourceId) throws Exception;

	/**
	 * 根据对象获取所有的SyroleSyresource集合
	 * @param syroleSyresource
	 * @return List<SyroleSyresource>
	 */
	public List<SyroleSyresource> querySyroleSyresourceList(SyroleSyresource syroleSyresource) throws Exception;

	/**
	 * 根据对象获取所有的SyroleSyresource集合，并且支持分页使用PaginationQueryList对象
	 * @param Map<String,Object> map
	 * @param RowBounds rowBounds
	 * @return List<SyroleSyresource>
	 * <pre>
	 * Map&lt;String,Object&gt; map =new HashMap&lt;String,Object&gt;();
	 * map.put("syroleSyresource", syroleSyresource);
	 * map.put("orderName", orderName);
	 * RowBounds rowBounds = null;
	 * if(0 &lt; pageSize){
	 * 		rowBounds = new RowBounds(currentPage, pageSize, true);
	 * }
	 * List&lt;SyroleSyresource&gt; list = syroleSyresourceMapper.queryForListWithOrderName(map,rowBounds);
	 * Page page = new Page(currentPage, (pageSize&lt;1?1:pageSize), list instanceof PaginationQueryList?((PaginationQueryList) list).getRowTotal():list.size());
	 * PageModel&lt;SyroleSyresource&gt; pageModel = new PageModel&lt;SyroleSyresource&gt;();
	 * pageModel.setData(list);
	 * pageModel.setPage(page);
	 * return pageModel;
	 * </pre>
	 */
	public List<SyroleSyresource> querySyroleSyresourceLists(Map<String, Object> map, RowBounds rowBounds) throws Exception;

}