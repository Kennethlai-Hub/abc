package cn.eternacell.info.service;

import cn.eternacell.info.entity.Mobilephone;

import java.util.List;

public interface MobilephoneService {
    List<Mobilephone> select(int page, int pageSize, String query);
}
