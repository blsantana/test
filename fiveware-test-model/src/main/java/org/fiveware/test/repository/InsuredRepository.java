package org.fiveware.test.repository;

import java.util.List;

import org.fiveware.test.dao.AbstractDAO;
import org.fiveware.test.dao.InsuredDAO;
import org.fiveware.test.model.Insured;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository
public class InsuredRepository extends AbstractDAO implements InsuredDAO{

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Insured> findAll() {
		Query query = getSession().createQuery("FROM Insured");
		return query.list();
	}

	@Override
	public Insured findInsuredById(Long id) {
		// TODO Auto-generated method stub
		return (Insured) getSession().get(Insured.class, id);
	}

	@Override
	public void save(Insured insured) {
		
		persist(insured);
		
	}

}
