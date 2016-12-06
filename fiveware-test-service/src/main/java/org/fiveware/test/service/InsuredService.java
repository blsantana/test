package org.fiveware.test.service;

import java.util.List;

import org.fiveware.test.model.Insured;

public interface InsuredService {

	public Insured findInsuredById(Long id);

	public List<Insured> findAll();
	
	public void save(Insured insured);
	
}
