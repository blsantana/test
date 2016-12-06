package org.fiveware.test.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.fiveware.test.model.enums.InsuranceType;

@Entity
@Table(name = "policy")
public class Policy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@Enumerated(EnumType.STRING)
	private InsuranceType insuranceType;
	
	@OneToOne
	@JoinColumn(name = "insuredId")
	private Insured insured;

	private String termOfAccept;
	
	public Insured getInsured() {
		return insured;
	}

	public void setInsured(Insured insured) {
		this.insured = insured;
	}

	public Long getId() {
		return id;
	}

	public InsuranceType getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}

	public String getTermOfAccept() {
		return termOfAccept;
	}

	public void setTermOfAccept(String termOfAccept) {
		this.termOfAccept = termOfAccept;
	}


	
	
	
}
