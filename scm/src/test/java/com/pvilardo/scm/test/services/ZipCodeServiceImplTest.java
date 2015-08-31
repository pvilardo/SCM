package com.pvilardo.scm.test.services;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.pvilardo.scm.model.ZipCode;
import com.pvilardo.scm.services.IZipCodeService;
import com.pvilardo.scm.test.config.MongoTestConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MongoTestConfig.class, loader=AnnotationConfigContextLoader.class)
public class ZipCodeServiceImplTest {

	@Autowired
	IZipCodeService zipCodeService; 
	
	@Test
	public void testFindAll() {
		zipCodeService.insert(new ZipCode("850001", "850001"));
		zipCodeService.insert(new ZipCode("850002", "850002"));
		List<ZipCode> zipCodeList = zipCodeService.findAll();
		assertEquals(zipCodeList.size(), 2); ;
	}
	
	@Test
	public void testFindOne() {
		zipCodeService.insert(new ZipCode("850001", "850001"));
		zipCodeService.insert(new ZipCode("850002", "850002"));
		ZipCode zipCode= zipCodeService.findByCode("850001");
		
		assertNotNull(zipCode);
		assertEquals(zipCode.getCode(), "850001");
	}


}
