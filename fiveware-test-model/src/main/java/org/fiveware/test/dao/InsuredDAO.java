package org.fiveware.test.dao;

import java.util.List;

import org.fiveware.test.model.Insured;

public interface InsuredDAO {

	public Insured findInsuredById(Long id);

	public List<Insured> findAll();
	
	public void save(Insured insured);
}
