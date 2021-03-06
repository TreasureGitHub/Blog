package com.ffl.blog.biz.service.impl;

import com.ffl.blog.biz.base.AbstractService;
import com.ffl.blog.biz.service.ArticleService;
import com.ffl.blog.dal.base.BaseDaoImpl;
import com.ffl.blog.dal.blog.dao.ArticleDao;
import com.ffl.blog.dal.blog.entity.ArticleDO;
import com.ffl.blog.pojo.param.ArticleParam;
import com.ffl.blog.pojo.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lff
 * @datetime 2020/01/29 20:09
 */
@Service
public class ArticleServiceImpl extends AbstractService<ArticleDO, ArticleVO, ArticleParam> implements ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Override
    public BaseDaoImpl getDao() {
        return new BaseDaoImpl(articleDao);
    }
}
