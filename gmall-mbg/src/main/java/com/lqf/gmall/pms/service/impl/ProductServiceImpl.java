package com.lqf.gmall.pms.service.impl;

import com.lqf.gmall.pms.entity.Product;
import com.lqf.gmall.pms.mapper.ProductMapper;
import com.lqf.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Lqf
 * @since 2019-12-29
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
