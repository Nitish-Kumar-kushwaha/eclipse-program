package com.loginTest.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.loginTest.Model.Register;

public interface RegisterService {

	public String AddRegister(Register reg);

	public List<Register> ShowAll();

	public Register showUser(String email);

}
