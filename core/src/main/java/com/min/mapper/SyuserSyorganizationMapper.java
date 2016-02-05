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
 * @version $Id: SyuserSyorganizationMapper.java, v 0.1 Jason.Wang Exp $.
 */
public interface SyuserSyorganizationMapper extends Serializable{

	/**
	 * 保存SyuserSyorganization对象
	 * @param syuserSyorganization
	 */
	public int saveSyuserSyorganization(SyuserSyorganization syuserSyorganization) throws Exception;

	/**
	 * 保存SyuserSyorganization对象
	 * @param syuserSyorganization
	 */
	public int saveSyuserSyorganizationSelective(SyuserSyorganization syuserSyorganization) throws Exception;

	/**
	 * 根据syuserId删除SyuserSyorganization
	 * @param syuserId
	 */
	public void deleteSyuserSyorganizationBysyuserId(java.lang.String syuserId) throws Exception;

	/**
	 * 更新对象SyuserSyorganization
	 * @param syuserSyorganization
	 */
	public int updateSyuserSyorganization(SyuserSyorganization syuserSyorganization) throws Exception;

	/**
	 * 根据syuserId获取SyuserSyorganization
	 * @param syuserId
	 * @return SyuserSyorganization
	 */
	public SyuserSyorganization querySyuserSyorganization(java.lang.String syuserId) throws Exception;

	/**
	 * 根据对象获取所有的SyuserSyorganization集合
	 * @param syuserSyorganization
	 * @return List<SyuserSyorganization>
	 */
	public List<SyuserSyorganization> querySyuserSyorganizationList(SyuserSyorganization syuserSyorganization) throws Exception;

	/**
	 * 根据对象获取所有的SyuserSyorganization集合，并且支持分页使用PaginationQueryList对象
	 * @param Map<String,Object> map
	 * @param RowBounds rowBounds
	 * @return List<SyuserSyorganization>
	 * <pre>
	 * Map&lt;String,Object&gt; map =new HashMap&lt;String,Object&gt;();
	 * map.put("syuserSyorganization", syuserSyorganization);
	 * map.put("orderName", orderName);
	 * RowBounds rowBounds = null;
	 * if(0 &lt; pageSize){
	 * 		rowBounds = new RowBounds(currentPage, pageSize, true);
	 * }
	 * List&lt;SyuserSyorganization&gt; list = syuserSyorganizationMapper.queryForListWithOrderName(map,rowBounds);
	 * Page page = new Page(currentPage, (pageSize&lt;1?1:pageSize), list instanceof PaginationQueryList?((PaginationQueryList) list).getRowTotal():list.size());
	 * PageModel&lt;SyuserSyorganization&gt; pageModel = new PageModel&lt;SyuserSyorganization&gt;();
	 * pageModel.setData(list);
	 * pageModel.setPage(page);
	 * return pageModel;
	 * </pre>
	 */
	public List<SyuserSyorganization> querySyuserSyorganizationLists(Map<String, Object> map, RowBounds rowBounds) throws Exception;

}