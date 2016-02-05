/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service;
import java.io.Serializable;

import java.util.*;

import com.min.model.Syuser;

/**
 *
 * @author Jason.Wang
 * @version $Id: ISyuserService.java, v 0.1 Jason.Wang Exp $.
 */
public interface ISyuserService extends Serializable{

	/**
	 * 保存Syuser对象
	 * @param syuser
	 */
	public int saveSyuser(Syuser syuser) throws Exception;

	/**
	 * 保存Syuser对象并不插入空数据
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

}