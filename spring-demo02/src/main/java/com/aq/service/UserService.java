package com.aq.service;

import com.aq.pojo.User;

import java.util.List;

/******************************************************************************
 * @Package: [com.aq.service.UserService]

 * @ClassName: [UserService]

 * @Description: [一句话描述该类的功能]

 * @Author: [liang.wang@founder.com.cn]  

 * @CreateDate: [2022/1/12 15:11]   

 * @UpdateUser: [liang.wang@founder.com.cn (如多次修改保留历史记录，增加修改记录)]   

 * @UpdateDate: [2022/1/12 15:11，(如多次修改保留历史记录，增加修改记录)]   

 * @UpdateRemark: [说明本次修改内容, (如多次修改保留历史记录 ， 增加修改记录)]

 * @Version: [v1.0]

 * ${tags}

 */
public interface UserService {

    /**
     * 查询所有
     * @return
     */
    public List<User> findAllUser();
}
