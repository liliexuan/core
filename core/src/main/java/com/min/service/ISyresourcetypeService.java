/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service;
import java.io.Serializable;

import java.util.*;

import com.min.model.Syresourcetype;

/**
 *
 * @author Jason.Wang
 * @version $Id: ISyresourcetypeService.java, v 0.1 Jason.Wang Exp $.
 */
public interface ISyresourcetypeService extends Serializable{

	/**
	 * 保存Syresourcetype对象
	 * @param syresourcetype
	 */
	public int saveSyresourcetype(Syresourcetype syresourcetype) throws Exception;

	/**
	 * 保存Syresourcetype对象并不插入空数据
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

}