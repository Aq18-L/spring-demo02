package com.aq.controller;

import com.aq.pojo.Items;
import com.aq.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/******************************************************************************
 * @Package: [com.aq.controller.ItemController]

 * @ClassName: [ItemController]

 * @Description: [一句话描述该类的功能]

 * @Author: [liang.wang@founder.com.cn]  

 * @CreateDate: [2022/1/8 18:34]   

 * @UpdateUser: [liang.wang@founder.com.cn (如多次修改保留历史记录，增加修改记录)]   

 * @UpdateDate: [2022/1/8 18:34，(如多次修改保留历史记录，增加修改记录)]   

 * @UpdateRemark: [说明本次修改内容, (如多次修改保留历史记录 ， 增加修改记录)]

 * @Version: [v1.0]

 * ${tags}

 */

@Controller
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping(value = "/list")
    public String list(Model model) {
        List<Items> itemsList = itemsService.findAll();
        model.addAttribute("items", itemsList);
        return "items";
    }
}
