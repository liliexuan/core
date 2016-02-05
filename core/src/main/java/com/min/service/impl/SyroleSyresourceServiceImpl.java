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

import com.min.mapper.SyroleSyresourceMapper;
import com.min.model.SyroleSyresource;
import com.min.service.ISyroleSyresourceService;

/**
 *
 * @author Jason.Wang
 * @version $Id: SyroleSyresourceServiceImpl.java, v 0.1 Jason.Wang Exp $.
 */
@SuppressWarnings("serial")
@Service("syroleSyresourceService")
@Transactional
public class SyroleSyresourceServiceImpl implements ISyroleSyresourceService{
	@Resource 
	private SyroleSyresourceMapper syroleSyresourceMapper;

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleSyresourceService#saveSyroleSyresource(SyroleSyresource)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyroleSyresource(SyroleSyresource syroleSyresource) throws Exception{
		return syroleSyresourceMapper.saveSyroleSyresource(syroleSyresource);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleSyresourceService#saveSyroleSyresourceSelective(SyroleSyresource)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyroleSyresourceSelective(SyroleSyresource syroleSyresource) throws Exception{
		return syroleSyresourceMapper.saveSyroleSyresourceSelective(syroleSyresource);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleSyresourceService#deleteSyroleSyresourceBysyresourceId(java.lang.String)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public void deleteSyroleSyresourceBysyresourceId(java.lang.String syresourceId) throws Exception{
		syroleSyresourceMapper.deleteSyroleSyresourceBysyresourceId(syresourceId);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleSyresourceService#updateSyroleSyresource(SyroleSyresource)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int updateSyroleSyresource(SyroleSyresource syroleSyresource) throws Exception{
		return syroleSyresourceMapper.updateSyroleSyresource(syroleSyresource);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleSyresourceService#querySyroleSyresource(java.lang.String)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public SyroleSyresource querySyroleSyresource(java.lang.String syresourceId) throws Exception{
		return syroleSyresourceMapper.querySyroleSyresource(syresourceId);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyroleSyresourceService#querySyroleSyresourceList(SyroleSyresource)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public List<SyroleSyresource> querySyroleSyresourceList(SyroleSyresource syroleSyresource) throws Exception{
		return syroleSyresourceMapper.querySyroleSyresourceList(syroleSyresource);
	}

}