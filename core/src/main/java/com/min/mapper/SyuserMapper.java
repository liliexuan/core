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
 * @version $Id: SyuserMapper.java, v 0.1 Jason.Wang Exp $.
 */
public interface SyuserMapper extends Serializable{

	/**
	 * 保存Syuser对象
	 * @param syuser
	 */
	public int saveSyuser(Syuser syuser) throws Exception;

	/**
	 * 保存Syuser对象
	 * @param syuser
	 */
	public int saveSyuserSelective(Syuser syuser) throws Exception;

	/**
	 * 根据id删除Syuser
	 * @param id
	 */
	public void deleteSyuserByid(java.lang.String id) throws Exception;

	/**
	 * 更新对象Syuser
	 * @param syuser
	 */
	public int updateSyuser(Syuser syuser) throws Exception;

	/**
	 * 根据id获取Syuser
	 * @param id
	 * @return Syuser
	 */
	public Syuser querySyuser(java.lang.String id) throws Exception;

	/**
	 * 根据对象获取所有的Syuser集合
	 * @param syuser
	 * @return List<Syuser>
	 */
	public List<Syuser> querySyuserList(Syuser syuser) throws Exception;

	/**
	 * 根据对象获取所有的Syuser集合，并且支持分页使用PaginationQueryList对象
	 * @param Map<String,Object> map
	 * @param RowBounds rowBounds
	 * @return List<Syuser>
	 * <pre>
	 * Map&lt;String,Object&gt; map =new HashMap&lt;String,Object&gt;();
	 * map.put("syuser", syuser);
	 * map.put("orderName", orderName);
	 * RowBounds rowBounds = null;
	 * if(0 &lt; pageSize){
	 * 		rowBounds = new RowBounds(currentPage, pageSize, true);
	 * }
	 * List&lt;Syuser&gt; list = syuserMapper.queryForListWithOrderName(map,rowBounds);
	 * Page page = new Page(currentPage, (pageSize&lt;1?1:pageSize), list instanceof PaginationQueryList?((PaginationQueryList) list).getRowTotal():list.size());
	 * PageModel&lt;Syuser&gt; pageModel = new PageModel&lt;Syuser&gt;();
	 * pageModel.setData(list);
	 * pageModel.setPage(page);
	 * return pageModel;
	 * </pre>
	 */
	public List<Syuser> querySyuserLists(Map<String, Object> map, RowBounds rowBounds) throws Exception;

}