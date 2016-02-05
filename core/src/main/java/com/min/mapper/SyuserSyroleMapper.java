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
 * @version $Id: SyuserSyroleMapper.java, v 0.1 Jason.Wang Exp $.
 */
public interface SyuserSyroleMapper extends Serializable{

	/**
	 * 保存SyuserSyrole对象
	 * @param syuserSyrole
	 */
	public int saveSyuserSyrole(SyuserSyrole syuserSyrole) throws Exception;

	/**
	 * 保存SyuserSyrole对象
	 * @param syuserSyrole
	 */
	public int saveSyuserSyroleSelective(SyuserSyrole syuserSyrole) throws Exception;

	/**
	 * 根据syuserId删除SyuserSyrole
	 * @param syuserId
	 */
	public void deleteSyuserSyroleBysyuserId(java.lang.String syuserId) throws Exception;

	/**
	 * 更新对象SyuserSyrole
	 * @param syuserSyrole
	 */
	public int updateSyuserSyrole(SyuserSyrole syuserSyrole) throws Exception;

	/**
	 * 根据syuserId获取SyuserSyrole
	 * @param syuserId
	 * @return SyuserSyrole
	 */
	public SyuserSyrole querySyuserSyrole(java.lang.String syuserId) throws Exception;

	/**
	 * 根据对象获取所有的SyuserSyrole集合
	 * @param syuserSyrole
	 * @return List<SyuserSyrole>
	 */
	public List<SyuserSyrole> querySyuserSyroleList(SyuserSyrole syuserSyrole) throws Exception;

	/**
	 * 根据对象获取所有的SyuserSyrole集合，并且支持分页使用PaginationQueryList对象
	 * @param Map<String,Object> map
	 * @param RowBounds rowBounds
	 * @return List<SyuserSyrole>
	 * <pre>
	 * Map&lt;String,Object&gt; map =new HashMap&lt;String,Object&gt;();
	 * map.put("syuserSyrole", syuserSyrole);
	 * map.put("orderName", orderName);
	 * RowBounds rowBounds = null;
	 * if(0 &lt; pageSize){
	 * 		rowBounds = new RowBounds(currentPage, pageSize, true);
	 * }
	 * List&lt;SyuserSyrole&gt; list = syuserSyroleMapper.queryForListWithOrderName(map,rowBounds);
	 * Page page = new Page(currentPage, (pageSize&lt;1?1:pageSize), list instanceof PaginationQueryList?((PaginationQueryList) list).getRowTotal():list.size());
	 * PageModel&lt;SyuserSyrole&gt; pageModel = new PageModel&lt;SyuserSyrole&gt;();
	 * pageModel.setData(list);
	 * pageModel.setPage(page);
	 * return pageModel;
	 * </pre>
	 */
	public List<SyuserSyrole> querySyuserSyroleLists(Map<String, Object> map, RowBounds rowBounds) throws Exception;

}