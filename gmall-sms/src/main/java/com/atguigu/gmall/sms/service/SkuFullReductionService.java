package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SkuFullReductionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品满减信息
 *
 * @author caining
 * @email 1113885942@qq.ccom
 * @date 2019-10-29 06:31:23
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageVo queryPage(QueryCondition params);
}

