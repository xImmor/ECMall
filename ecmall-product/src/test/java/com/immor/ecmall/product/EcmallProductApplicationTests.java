package com.immor.ecmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.immor.ecmall.product.entity.BrandEntity;
import com.immor.ecmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

@SpringBootTest
class EcmallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("HUAWEI");
//        brandService.save(brandEntity);

//        brandEntity.setBrandId(2L);
//        brandEntity.setDescript("HUAWEI");
//        brandEntity.setName("华为");
//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(System.out::println);
    }

}
