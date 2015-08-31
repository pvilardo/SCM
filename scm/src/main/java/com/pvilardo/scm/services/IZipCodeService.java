package com.pvilardo.scm.services;
import java.util.List;

import com.pvilardo.scm.model.ZipCode;

public interface IZipCodeService {

	public List<ZipCode> findAll();
	public long count();
	public ZipCode insert(ZipCode zipCode);
	public ZipCode findByCode(String code);
}
