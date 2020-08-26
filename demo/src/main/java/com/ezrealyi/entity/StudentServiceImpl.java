package com.ezrealyi.entity;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	@Override
	public void getName() {
		System.out.println("StudentServiceImpl");
	}
}
