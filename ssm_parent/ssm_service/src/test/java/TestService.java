import com.aq.pojo.Items;
import com.aq.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/******************************************************************************
 * @Package: [PACKAGE_NAME.TestService]

 * @ClassName: [TestService]

 * @Description: [一句话描述该类的功能]

 * @Author: [liang.wang@founder.com.cn]  

 * @CreateDate: [2022/1/8 18:01]   

 * @UpdateUser: [liang.wang@founder.com.cn (如多次修改保留历史记录，增加修改记录)]   

 * @UpdateDate: [2022/1/8 18:01，(如多次修改保留历史记录，增加修改记录)]   

 * @UpdateRemark: [说明本次修改内容, (如多次修改保留历史记录 ， 增加修改记录)]

 * @Version: [v1.0]

 * ${tags}

 */
public class TestService {

    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsServiceImpl = (ItemsService)applicationContext.getBean("itemsServiceImpl");

        System.out.println(itemsServiceImpl.findAll());
        Items items = new Items();
        items.setName("测试事务");
        itemsServiceImpl.save(items);
    }
}
