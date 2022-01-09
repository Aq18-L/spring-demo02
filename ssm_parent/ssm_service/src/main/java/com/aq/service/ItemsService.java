package com.aq.service;

import com.aq.pojo.Items;

import java.util.List;

/******************************************************************************
 * @Package: [com.aq.service.ItemsService]

 * @ClassName: [ItemsService]

 * @Description: [一句话描述该类的功能]

 * @Author: [liang.wang@founder.com.cn]  

 * @CreateDate: [2022/1/8 17:56]   

 * @UpdateUser: [liang.wang@founder.com.cn (如多次修改保留历史记录，增加修改记录)]   

 * @UpdateDate: [2022/1/8 17:56，(如多次修改保留历史记录，增加修改记录)]   

 * @UpdateRemark: [说明本次修改内容, (如多次修改保留历史记录 ， 增加修改记录)]

 * @Version: [v1.0]

 * ${tags}

 */
public interface ItemsService {

    /**
     * 列表查询
     * @return
     */
    List<Items> findAll();

    /**
     * 保存
     * @param items
     * @return
     */
    int save(Items items);

}
