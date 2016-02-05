/**
 * 使用自动化工具生成 version 1.0 
 * @author Jason.Wang
 * @blog http://kany.me
 * @email kzone.wang@gmail.com
 */
package com.min.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

import com.min.mapper.SyresourceMapper;
import com.min.model.Syresource;
import com.min.service.ISyresourceService;

/**
 *
 * @author Jason.Wang
 * @version $Id: SyresourceServiceImpl.java, v 0.1 Jason.Wang Exp $.
 */
@SuppressWarnings("serial")
@Service("syresourceService")
@Transactional
public class SyresourceServiceImpl implements ISyresourceService{
	@Resource 
	private SyresourceMapper syresourceMapper;

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourceService#saveSyresource(Syresource)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyresource(Syresource syresource) throws Exception{
		return syresourceMapper.saveSyresource(syresource);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourceService#saveSyresourceSelective(Syresource)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyresourceSelective(Syresource syresource) throws Exception{
		return syresourceMapper.saveSyresourceSelective(syresource);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourceService#deleteSyresourceByid(java.lang.String)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public void deleteSyresourceByid(java.lang.String id) throws Exception{
		syresourceMapper.deleteSyresourceByid(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourceService#updateSyresource(Syresource)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int updateSyresource(Syresource syresource) throws Exception{
		return syresourceMapper.updateSyresource(syresource);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourceService#querySyresource(java.lang.String)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public Syresource querySyresource(java.lang.String id) throws Exception{
		return syresourceMapper.querySyresource(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyresourceService#querySyresourceList(Syresource)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public List<Syresource> querySyresourceList(Syresource syresource) throws Exception{
		return syresourceMapper.querySyresourceList(syresource);
	}

}