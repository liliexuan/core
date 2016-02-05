/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service;
import java.io.Serializable;

import java.util.*;

import com.min.model.Syresource;

/**
 *
 * @author Jason.Wang
 * @version $Id: ISyresourceService.java, v 0.1 Jason.Wang Exp $.
 */
public interface ISyresourceService extends Serializable{

	/**
	 * 保存Syresource对象
	 * @param syresource
	 */
	public int saveSyresource(Syresource syresource) throws Exception;

	/**
	 * 保存Syresource对象并不插入空数据
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

}