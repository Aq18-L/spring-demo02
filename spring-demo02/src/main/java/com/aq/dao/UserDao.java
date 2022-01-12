package com.aq.dao;

import com.aq.pojo.User;

import java.util.List;

/******************************************************************************
 * @Package: [com.aq.dao.UserDao]

 * @ClassName: [UserDao]

 * @Description: [一句话描述该类的功能]

 * @Author: [liang.wang@founder.com.cn]  

 * @CreateDate: [2022/1/12 14:59]   

 * @UpdateUser: [liang.wang@founder.com.cn (如多次修改保留历史记录，增加修改记录)]   

 * @UpdateDate: [2022/1/12 14:59，(如多次修改保留历史记录，增加修改记录)]   

 * @UpdateRemark: [说明本次修改内容, (如多次修改保留历史记录 ， 增加修改记录)]

 * @Version: [v1.0]

 * ${tags}

 */


public interface UserDao {
    public List<User> findAllUser();
}
