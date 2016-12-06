package Impl;

import java.util.List;

import org.fiveware.test.model.Insured;
import org.fiveware.test.repository.InsuredRepository;
import org.fiveware.test.service.InsuredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class InsuredServiceImpl implements InsuredService {
	
	@Autowired
	private InsuredRepository insuredRepository;

	@Override
	public Insured findInsuredById(Long id) {
		// TODO Auto-generated method stub
		return insuredRepository.findInsuredById(id);
	}

	@Override
	public List<Insured> findAll() {
		// TODO Auto-generated method stub
		return insuredRepository.findAll();
	}

	@Override
	public void save(Insured insured) {
		insuredRepository.save(insured);
		
	}
	

}