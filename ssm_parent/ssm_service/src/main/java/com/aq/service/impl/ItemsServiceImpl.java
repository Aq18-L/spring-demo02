package com.aq.service.impl;

import com.aq.dao.ItemsDao;
import com.aq.pojo.Items;
import com.aq.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/******************************************************************************
 * @Package: [com.aq.service.impl.ItemsServiceImpl]

 * @ClassName: [ItemsServiceImpl]

 * @Description: [一句话描述该类的功能]

 * @Author: [liang.wang@founder.com.cn]  

 * @CreateDate: [2022/1/8 17:58]   

 * @UpdateUser: [liang.wang@founder.com.cn (如多次修改保留历史记录，增加修改记录)]   

 * @UpdateDate: [2022/1/8 17:58，(如多次修改保留历史记录，增加修改记录)]   

 * @UpdateRemark: [说明本次修改内容, (如多次修改保留历史记录 ， 增加修改记录)]

 * @Version: [v1.0]

 * ${tags}

 */

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Transactional
    public int save(Items items) {
        int account = itemsDao.save(items);
        System.out.println(account);
        int a = 10/0;
        return account;
    }
}
