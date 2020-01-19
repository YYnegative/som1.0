package com.ebig.som.tool.config;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.TestCase;

@RunWith(SpringRunner.class)    //底层用junit的 SpringJUnit4ClassRunner
@SpringBootTest(classes = {SomToolConfigApplicationTest.class})
public class SomToolConfigApplicationTest extends TestCase {
	
	@Test
    public void jasyptEncryptor() {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("som");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("mon");
        String password = textEncryptor.encrypt("mon");
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }
}
