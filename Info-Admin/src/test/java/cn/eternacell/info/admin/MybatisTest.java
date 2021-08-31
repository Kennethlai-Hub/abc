package cn.eternacell.info.admin;

import cn.eternacell.info.entity.Mobilephone;
import cn.eternacell.info.infoadmin.InfoadminApplication;
import cn.eternacell.info.mapper.MobilephoneMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InfoadminApplication.class)
public class MybatisTest {
    @Resource
    private MobilephoneMapper mobilephoneMapper;

    @Test
    public void testMobile(){
        List<Mobilephone> mobile = mobilephoneMapper.selectAll();
        System.out.println(mobile);
    }
}
