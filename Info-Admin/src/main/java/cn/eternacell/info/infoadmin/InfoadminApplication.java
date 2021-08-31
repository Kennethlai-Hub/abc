package cn.eternacell.info.infoadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan("cn.eternacell.info")
@MapperScan({"cn.eternacell.info.mapper"})
@EnableTransactionManagement
public class InfoadminApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfoadminApplication.class,args);
    }
}
