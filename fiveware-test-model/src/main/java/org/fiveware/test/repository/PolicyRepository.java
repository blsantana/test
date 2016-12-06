package org.fiveware.test.repository;

import org.fiveware.test.dao.AbstractDAO;
import org.fiveware.test.dao.PolicyDAO;
import org.fiveware.test.model.Policy;
import org.springframework.stereotype.Repository;

@Repository
public class PolicyRepository extends AbstractDAO implements PolicyDAO{

	@Override
	public void save(Policy policy) {
		persist(policy);
	}

}
