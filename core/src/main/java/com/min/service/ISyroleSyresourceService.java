/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service;
import java.io.Serializable;

import java.util.*;

import com.min.model.SyroleSyresource;

/**
 *
 * @author Jason.Wang
 * @version $Id: ISyroleSyresourceService.java, v 0.1 Jason.Wang Exp $.
 */
public interface ISyroleSyresourceService extends Serializable{

	/**
	 * 保存SyroleSyresource对象
	 * @param syroleSyresource
	 */
	public int saveSyroleSyresource(SyroleSyresource syroleSyresource) throws Exception;

	/**
	 * 保存SyroleSyresource对象并不插入空数据
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

}