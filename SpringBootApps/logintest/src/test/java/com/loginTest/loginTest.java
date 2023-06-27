package com.loginTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.loginTest.Model.Register;
import com.loginTest.Service.RegisterServiceImpl;

@SpringBootTest
public class loginTest {

    @Autowired
    private RegisterServiceImpl regServiceImpl;

    // @Test
    // public void testByEmail() {
    // Register reg = new Register();
    // reg.setEmail("rashu@gmail.com");
    // reg.setUserName("rashu_1813");
    // reg.setPassword("12345");

    // String res = regServiceImpl.AddRegister(reg);
    // System.out.println(res);
    // assertEquals("Success", res);

    // }

    @Test
    public void loginTest() {
        Register reg = regServiceImpl.showUser("rashu@gmail.com");

        assertTrue(reg.getPassword().equals("12345"));
    }

    @Test
    public void loginTestNegative() {
        Register reg = regServiceImpl.showUser("rashu@gmail.com");

        assertFalse(reg.getPassword().equals("12354678"));
    }

    @Test
    public void passwordNotNull() {
        List<Register> user = regServiceImpl.ShowAll();
        for (Register u : user) {
            assertNotNull(u.getPassword());
        }
    }

    @Test
    public void nameNotNull() {
        List<Register> user = regServiceImpl.ShowAll();
        for (Register u : user) {
            assertNotNull(u.getUserName());
        }
    }

    @Test
    public void emailNotNull() {
        List<Register> user = regServiceImpl.ShowAll();
        for (Register u : user) {
            assertNotNull(u.getEmail());
        }
    }
}
