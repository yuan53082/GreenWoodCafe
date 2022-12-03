package com.yuan.greenwood_cafe.controller;

import com.yuan.greenwood_cafe.model.Greenwood_Cafe;
import com.yuan.greenwood_cafe.service.Greenwood_CafeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @avthor yuan
 * @Date 2022/11/28
 */
@RestController
@RequestMapping("/")
public class Greedwood_CafeController {

    @Autowired //NEW一個介面出來使用
    private Greenwood_CafeService greenwood_cafeService;

    /*
    要NEW interface介面，不能NEW impl實作
    @Autowired
    private Greenwood_CafeServiceimpl greenwood_cafeServiceimpl;*/

    @PostMapping("/update")// 更新指定ID資料
    public String update(@RequestParam("id") Integer id, Greenwood_Cafe greenwood_cafe) {
        Greenwood_Cafe data = greenwood_cafeService.findById(id);// 用變數來裝撈出來的資料
        data.setDate(greenwood_cafe.getDate());// 把.get資料set進變數中
        data.setTime(greenwood_cafe.getTime());
        data.setName(greenwood_cafe.getName());
        data.setPhone(greenwood_cafe.getPhone());
        data.setPeople(greenwood_cafe.getPeople());
        data.setTable_num(greenwood_cafe.getTable_num());
        greenwood_cafeService.save(data);// 儲存
        return "更新成功！";
    }

    @PostMapping("/delete")// 接收前端ID並調用impl的delete進行指定資料刪除
    public String delete(@RequestParam("id") Integer id) {
        greenwood_cafeService.deleteById(id);
        return "刪除成功！";
    }

    @GetMapping("/booking")// 導到booking頁面
    public ModelAndView add() {
        return new ModelAndView("booking");
    }

    @PostMapping("/save")// 接收前端的資料並調用impl的save進行資料儲存
    public String save(Greenwood_Cafe greenwood_cafe) {
        greenwood_cafeService.save(greenwood_cafe);
        return "預約成功！";
    }

    @GetMapping("/read")// 讀取資料庫中全部資料
    public List<Greenwood_Cafe> read() {
        return greenwood_cafeService.findAll();
    }
}
