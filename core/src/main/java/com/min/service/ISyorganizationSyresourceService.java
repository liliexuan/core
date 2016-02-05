/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service;
import java.io.Serializable;

import java.util.*;

import com.min.model.SyorganizationSyresource;

/**
 *
 * @author Jason.Wang
 * @version $Id: ISyorganizationSyresourceService.java, v 0.1 Jason.Wang Exp $.
 */
public interface ISyorganizationSyresourceService extends Serializable{

	/**
	 * 保存SyorganizationSyresource对象
	 * @param syorganizationSyresource
	 */
	public int saveSyorganizationSyresource(SyorganizationSyresource syorganizationSyresource) throws Exception;

	/**
	 * 保存SyorganizationSyresource对象并不插入空数据
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

}