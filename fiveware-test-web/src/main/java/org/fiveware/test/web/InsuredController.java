package org.fiveware.test.web;

import java.util.EnumSet;

import org.fiveware.test.model.Insured;
import org.fiveware.test.model.Policy;
import org.fiveware.test.model.enums.GenreType;
import org.fiveware.test.model.enums.InsuranceType;
import org.fiveware.test.service.InsuredService;
import org.fiveware.test.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InsuredController {

	@Autowired
	private InsuredService insuredService;
	
	@Autowired
	private PolicyService policyService;
	
	private EnumSet<InsuranceType> allInsurances = EnumSet.allOf( InsuranceType.class );
	private EnumSet<GenreType> genres = EnumSet.allOf( GenreType.class );
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView form(){
		ModelAndView model = new ModelAndView("index");
		model.addObject("insurances", allInsurances);
		model.addObject("genres", genres);
		model.addObject("insured", new Insured());
		return model;
	}
	
	@RequestMapping(value = "insured/save", method = RequestMethod.POST)
	public void cadastrar(@RequestParam("name") String name,
						  @RequestParam("lastName") String lastName,
						  @RequestParam("insuranceType") String insuranceType,
						  @RequestParam("ageGroup") String ageGroup,
						  @RequestParam("genre") String genre,
						  @RequestParam("termOfAccept") String termOfAccept){
		
		Policy policy = new Policy();
		Insured insured = new Insured();
		
		insured.setAgeGroup(ageGroup);
		insured.setName(lastName);
		insured.setLastName(lastName);
		insured.setGenreType(GenreType.getValue(genre));
		policy.setInsured(insured);
		policy.setInsuranceType(InsuranceType.getValue(insuranceType));
		policy.setTermOfAccept(termOfAccept);
		insuredService.save(insured);
		policyService.save(policy);
		
		
	}
}
