package Impl;

import org.fiveware.test.dao.PolicyDAO;
import org.fiveware.test.model.Insured;
import org.fiveware.test.model.Policy;
import org.fiveware.test.repository.PolicyRepository;
import org.fiveware.test.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PolicyRepository policyRepository;
	
	

	@Override
	public void save(Policy policy) {
		
		policyRepository.save(policy);
	}
	
	

}