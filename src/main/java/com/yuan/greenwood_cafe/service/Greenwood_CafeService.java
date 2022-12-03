package com.yuan.greenwood_cafe.service;

import com.yuan.greenwood_cafe.model.Greenwood_Cafe;

import java.util.List;
import java.util.Optional;

/**
 * @avthor yuan
 * @Date 2022/11/28
 */
public interface Greenwood_CafeService {

    void deleteById(Integer id); // 刪除指定ID資料

    Greenwood_Cafe save(Greenwood_Cafe data);// 儲存資料

    List<Greenwood_Cafe> findAll();// 查詢所有資料

    Greenwood_Cafe findById(Integer id);// 查詢單筆資料
}
