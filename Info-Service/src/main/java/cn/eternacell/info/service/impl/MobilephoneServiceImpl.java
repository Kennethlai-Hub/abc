package cn.eternacell.info.service.impl;

import cn.eternacell.info.entity.Mobilephone;
import cn.eternacell.info.mapper.MobilephoneMapper;
import cn.eternacell.info.service.MobilephoneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MobilephoneServiceImpl implements MobilephoneService {

    @Resource
    private MobilephoneMapper mobilephoneMapper;

    @Override
    public List<Mobilephone> select(int page, int pageSize, String query){
        return mobilephoneMapper.selectByQuery((page - 1) * pageSize, pageSize, "%" + query + "%");
    }

}
