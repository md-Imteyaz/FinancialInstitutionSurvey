package com.financialinstitutioninfor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.financialinstitutioninfor.dto.FinancialInstitutionDto;
import com.financialinstitutioninfor.repo.FinancialInstitutionRepo;

@RestController
@RequestMapping("/api")
public class FinancialInstitutionController {

	@Autowired
	private FinancialInstitutionRepo financialinstitutionrepo;

	@GetMapping("/getBranchsetup")
	public List<FinancialInstitutionDto> findAll() {
		return financialinstitutionrepo.findAll();
	}

}