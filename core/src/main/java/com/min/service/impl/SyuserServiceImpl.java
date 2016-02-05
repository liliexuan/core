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

import com.min.mapper.SyuserMapper;
import com.min.model.Syuser;
import com.min.service.ISyuserService;

/**
 *
 * @author Jason.Wang
 * @version $Id: SyuserServiceImpl.java, v 0.1 Jason.Wang Exp $.
 */
@SuppressWarnings("serial")
@Service("syuserService")
@Transactional
public class SyuserServiceImpl implements ISyuserService{
	@Resource 
	private SyuserMapper syuserMapper;

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyuserService#saveSyuser(Syuser)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyuser(Syuser syuser) throws Exception{
		return syuserMapper.saveSyuser(syuser);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyuserService#saveSyuserSelective(Syuser)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int saveSyuserSelective(Syuser syuser) throws Exception{
		return syuserMapper.saveSyuserSelective(syuser);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyuserService#deleteSyuserByid(java.lang.String)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public void deleteSyuserByid(java.lang.String id) throws Exception{
		syuserMapper.deleteSyuserByid(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyuserService#updateSyuser(Syuser)
	 */
	@Transactional(readOnly=false,rollbackFor={Exception.class})
	public int updateSyuser(Syuser syuser) throws Exception{
		return syuserMapper.updateSyuser(syuser);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyuserService#querySyuser(java.lang.String)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public Syuser querySyuser(java.lang.String id) throws Exception{
		return syuserMapper.querySyuser(id);
	}

	/*
	 * (non-Javadoc)
	 * @see com.somnus.jason.service.ISyuserService#querySyuserList(Syuser)
	 */
	@Transactional(readOnly=true,rollbackFor={Exception.class})
	public List<Syuser> querySyuserList(Syuser syuser) throws Exception{
		return syuserMapper.querySyuserList(syuser);
	}

}