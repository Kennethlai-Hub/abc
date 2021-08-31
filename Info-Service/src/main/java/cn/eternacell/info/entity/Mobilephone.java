package cn.eternacell.info.entity;

import lombok.Data;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class Mobilephone implements Serializable {

    @Id
    private Integer id;
    private String name;
    private String model;
    private String purchasetype;
    private Date orderdate;
    private Date expiredate;
    private String sn;
    private Integer userid;
    private Integer serviceid;
    private Integer status;
    private String remark;

}
