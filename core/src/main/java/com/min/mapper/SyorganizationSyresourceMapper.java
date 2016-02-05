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
 * @version $Id: SyorganizationSyresourceMapper.java, v 0.1 Jason.Wang Exp $.
 */
public interface SyorganizationSyresourceMapper extends Serializable{

	/**
	 * 保存SyorganizationSyresource对象
	 * @param syorganizationSyresource
	 */
	public int saveSyorganizationSyresource(SyorganizationSyresource syorganizationSyresource) throws Exception;

	/**
	 * 保存SyorganizationSyresource对象
	 * @param syorganizationSyresource
	 */
	public int saveSyorganizationSyresourceSelective(SyorganizationSyresource syorganizationSyresource) throws Exception;

	/**
	 * 根据syorganizationId删除SyorganizationSyresource
	 * @param syorganizationId
	 */
	public void deleteSyorganizationSyresourceBysyorganizationId(java.lang.String syorganizationId) throws Exception;

	/**
	 * 更新对象SyorganizationSyresource
	 * @param syorganizationSyresource
	 */
	public int updateSyorganizationSyresource(SyorganizationSyresource syorganizationSyresource) throws Exception;

	/**
	 * 根据syorganizationId获取SyorganizationSyresource
	 * @param syorganizationId
	 * @return SyorganizationSyresource
	 */
	public SyorganizationSyresource querySyorganizationSyresource(java.lang.String syorganizationId) throws Exception;

	/**
	 * 根据对象获取所有的SyorganizationSyresource集合
	 * @param syorganizationSyresource
	 * @return List<SyorganizationSyresource>
	 */
	public List<SyorganizationSyresource> querySyorganizationSyresourceList(SyorganizationSyresource syorganizationSyresource) throws Exception;

	/**
	 * 根据对象获取所有的SyorganizationSyresource集合，并且支持分页使用PaginationQueryList对象
	 * @param Map<String,Object> map
	 * @param RowBounds rowBounds
	 * @return List<SyorganizationSyresource>
	 * <pre>
	 * Map&lt;String,Object&gt; map =new HashMap&lt;String,Object&gt;();
	 * map.put("syorganizationSyresource", syorganizationSyresource);
	 * map.put("orderName", orderName);
	 * RowBounds rowBounds = null;
	 * if(0 &lt; pageSize){
	 * 		rowBounds = new RowBounds(currentPage, pageSize, true);
	 * }
	 * List&lt;SyorganizationSyresource&gt; list = syorganizationSyresourceMapper.queryForListWithOrderName(map,rowBounds);
	 * Page page = new Page(currentPage, (pageSize&lt;1?1:pageSize), list instanceof PaginationQueryList?((PaginationQueryList) list).getRowTotal():list.size());
	 * PageModel&lt;SyorganizationSyresource&gt; pageModel = new PageModel&lt;SyorganizationSyresource&gt;();
	 * pageModel.setData(list);
	 * pageModel.setPage(page);
	 * return pageModel;
	 * </pre>
	 */
	public List<SyorganizationSyresource> querySyorganizationSyresourceLists(Map<String, Object> map, RowBounds rowBounds) throws Exception;

}