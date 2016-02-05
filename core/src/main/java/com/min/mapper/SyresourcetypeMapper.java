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
 * @version $Id: SyresourcetypeMapper.java, v 0.1 Jason.Wang Exp $.
 */
public interface SyresourcetypeMapper extends Serializable{

	/**
	 * 保存Syresourcetype对象
	 * @param syresourcetype
	 */
	public int saveSyresourcetype(Syresourcetype syresourcetype) throws Exception;

	/**
	 * 保存Syresourcetype对象
	 * @param syresourcetype
	 */
	public int saveSyresourcetypeSelective(Syresourcetype syresourcetype) throws Exception;

	/**
	 * 根据id删除Syresourcetype
	 * @param id
	 */
	public void deleteSyresourcetypeByid(java.lang.String id) throws Exception;

	/**
	 * 更新对象Syresourcetype
	 * @param syresourcetype
	 */
	public int updateSyresourcetype(Syresourcetype syresourcetype) throws Exception;

	/**
	 * 根据id获取Syresourcetype
	 * @param id
	 * @return Syresourcetype
	 */
	public Syresourcetype querySyresourcetype(java.lang.String id) throws Exception;

	/**
	 * 根据对象获取所有的Syresourcetype集合
	 * @param syresourcetype
	 * @return List<Syresourcetype>
	 */
	public List<Syresourcetype> querySyresourcetypeList(Syresourcetype syresourcetype) throws Exception;

	/**
	 * 根据对象获取所有的Syresourcetype集合，并且支持分页使用PaginationQueryList对象
	 * @param Map<String,Object> map
	 * @param RowBounds rowBounds
	 * @return List<Syresourcetype>
	 * <pre>
	 * Map&lt;String,Object&gt; map =new HashMap&lt;String,Object&gt;();
	 * map.put("syresourcetype", syresourcetype);
	 * map.put("orderName", orderName);
	 * RowBounds rowBounds = null;
	 * if(0 &lt; pageSize){
	 * 		rowBounds = new RowBounds(currentPage, pageSize, true);
	 * }
	 * List&lt;Syresourcetype&gt; list = syresourcetypeMapper.queryForListWithOrderName(map,rowBounds);
	 * Page page = new Page(currentPage, (pageSize&lt;1?1:pageSize), list instanceof PaginationQueryList?((PaginationQueryList) list).getRowTotal():list.size());
	 * PageModel&lt;Syresourcetype&gt; pageModel = new PageModel&lt;Syresourcetype&gt;();
	 * pageModel.setData(list);
	 * pageModel.setPage(page);
	 * return pageModel;
	 * </pre>
	 */
	public List<Syresourcetype> querySyresourcetypeLists(Map<String, Object> map, RowBounds rowBounds) throws Exception;

}