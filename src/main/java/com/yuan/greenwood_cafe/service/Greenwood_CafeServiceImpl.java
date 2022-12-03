package com.yuan.greenwood_cafe.service;

import com.yuan.greenwood_cafe.model.Greenwood_Cafe;
import com.yuan.greenwood_cafe.model.Greenwood_CafeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @avthor yuan
 * @Date 2022/11/30
 */
@Service
public class Greenwood_CafeServiceImpl implements Greenwood_CafeService {

    @Autowired Greenwood_CafeRespository greenwood_cafeRespository;


    @Override // 刪除指定ID資料
    public void deleteById(Integer id) {
        greenwood_cafeRespository.deleteById(id);
    }

    @Override // 儲存資料
    public Greenwood_Cafe save(Greenwood_Cafe data) {
        return greenwood_cafeRespository.save(data);
    }

    @Override // 查詢所有資料
    public List<Greenwood_Cafe> findAll() {
        return greenwood_cafeRespository.findAll();
    }

    @Override
    public Greenwood_Cafe findById(Integer id) {
        return greenwood_cafeRespository.findById(id).get();//
    }
}
