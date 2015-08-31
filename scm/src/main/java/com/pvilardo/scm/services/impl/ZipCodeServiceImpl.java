package com.pvilardo.scm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvilardo.scm.model.ZipCode;
import com.pvilardo.scm.repository.ZipCodeRepository;
import com.pvilardo.scm.services.IZipCodeService;

@Service
public class ZipCodeServiceImpl implements IZipCodeService{

	@Autowired
	ZipCodeRepository zipCodeRepository;
	
	@Override
	public List<ZipCode> findAll() {
		return zipCodeRepository.findAll();
	}

	@Override
	public ZipCode insert(ZipCode zipCode) {
		return zipCodeRepository.insert(zipCode);
	}

	@Override
	public long count() {
		return zipCodeRepository.count();
	}

	@Override
	public ZipCode findByCode(String code) {
		return zipCodeRepository.findByCode(code);
	}
	
	
	
	

}
