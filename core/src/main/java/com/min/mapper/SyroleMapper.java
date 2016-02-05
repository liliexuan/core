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
 * @version $Id: SyroleMapper.java, v 0.1 Jason.Wang Exp $.
 */
public interface SyroleMapper extends Serializable{

	/**
	 * 保存Syrole对象
	 * @param syrole
	 */
	public int saveSyrole(Syrole syrole) throws Exception;

	/**
	 * 保存Syrole对象
	 * @param syrole
	 */
	public int saveSyroleSelective(Syrole syrole) throws Exception;

	/**
	 * 根据id删除Syrole
	 * @param id
	 */
	public void deleteSyroleByid(java.lang.String id) throws Exception;

	/**
	 * 更新对象Syrole
	 * @param syrole
	 */
	public int updateSyrole(Syrole syrole) throws Exception;

	/**
	 * 根据id获取Syrole
	 * @param id
	 * @return Syrole
	 */
	public Syrole querySyrole(java.lang.String id) throws Exception;

	/**
	 * 根据对象获取所有的Syrole集合
	 * @param syrole
	 * @return List<Syrole>
	 */
	public List<Syrole> querySyroleList(Syrole syrole) throws Exception;

	/**
	 * 根据对象获取所有的Syrole集合，并且支持分页使用PaginationQueryList对象
	 * @param Map<String,Object> map
	 * @param RowBounds rowBounds
	 * @return List<Syrole>
	 * <pre>
	 * Map&lt;String,Object&gt; map =new HashMap&lt;String,Object&gt;();
	 * map.put("syrole", syrole);
	 * map.put("orderName", orderName);
	 * RowBounds rowBounds = null;
	 * if(0 &lt; pageSize){
	 * 		rowBounds = new RowBounds(currentPage, pageSize, true);
	 * }
	 * List&lt;Syrole&gt; list = syroleMapper.queryForListWithOrderName(map,rowBounds);
	 * Page page = new Page(currentPage, (pageSize&lt;1?1:pageSize), list instanceof PaginationQueryList?((PaginationQueryList) list).getRowTotal():list.size());
	 * PageModel&lt;Syrole&gt; pageModel = new PageModel&lt;Syrole&gt;();
	 * pageModel.setData(list);
	 * pageModel.setPage(page);
	 * return pageModel;
	 * </pre>
	 */
	public List<Syrole> querySyroleLists(Map<String, Object> map, RowBounds rowBounds) throws Exception;

}