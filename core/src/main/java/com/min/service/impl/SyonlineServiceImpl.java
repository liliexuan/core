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

import com.min.mapper.SyonlineMapper;
import com.min.model.Syonline;
import com.min.service.ISyonlineService;

/**
 *
 * @author Jason.Wang
 * @version $Id: SyonlineServiceImpl.java, v 0.1 Jason.Wang Exp $.
 */
@SuppressWarnings("serial")
@Service("syonlineService")
@Transactional
public class SyonlineServiceImpl implements ISyonlineService{
	@Resource 
	private SyonlineMapper syonlineMapper;

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyonlineService#saveSyonline(Syonline)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyonline(Syonline syonline) throws Exception{
		return syonlineMapper.saveSyonline(syonline);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyonlineService#saveSyonlineSelective(Syonline)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyonlineSelective(Syonline syonline) throws Exception{
		return syonlineMapper.saveSyonlineSelective(syonline);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyonlineService#deleteSyonlineByid(java.lang.String)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public void deleteSyonlineByid(java.lang.String id) throws Exception{
		syonlineMapper.deleteSyonlineByid(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyonlineService#updateSyonline(Syonline)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int updateSyonline(Syonline syonline) throws Exception{
		return syonlineMapper.updateSyonline(syonline);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyonlineService#querySyonline(java.lang.String)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public Syonline querySyonline(java.lang.String id) throws Exception{
		return syonlineMapper.querySyonline(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyonlineService#querySyonlineList(Syonline)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public List<Syonline> querySyonlineList(Syonline syonline) throws Exception{
		return syonlineMapper.querySyonlineList(syonline);
	}

}