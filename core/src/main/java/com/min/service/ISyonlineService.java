/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service;
import java.io.Serializable;

import java.util.*;

import com.min.model.Syonline;

/**
 *
 * @author Jason.Wang
 * @version $Id: ISyonlineService.java, v 0.1 Jason.Wang Exp $.
 */
public interface ISyonlineService extends Serializable{

	/**
	 * 保存Syonline对象
	 * @param syonline
	 */
	public int saveSyonline(Syonline syonline) throws Exception;

	/**
	 * 保存Syonline对象并不插入空数据
	 * @param syonline
	 */
	public int saveSyonlineSelective(Syonline syonline) throws Exception;

	/**
	 * 根据id删除Syonline
	 * @param id
	 */
	public void deleteSyonlineByid(java.lang.String id) throws Exception;

	/**
	 * 更新对象Syonline
	 * @param syonline
	 */
	public int updateSyonline(Syonline syonline) throws Exception;

	/**
	 * 根据id获取Syonline
	 * @param id
	 * @return Syonline
	 */
	public Syonline querySyonline(java.lang.String id) throws Exception;

	/**
	 * 根据对象获取所有的Syonline集合
	 * @param syonline
	 * @return List<Syonline>
	 */
	public List<Syonline> querySyonlineList(Syonline syonline) throws Exception;

}