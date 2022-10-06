package com.financialinstitutioninfor.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.financialinstitutioninfor.dto.FinancialInstitutionDto;

@Repository
public interface FinancialInstitutionRepo extends JpaRepository<FinancialInstitutionDto, Long> {

	@Query("select fi.institution_name as name_of_mfi,b.branch_name as date_of_branchOpening,\n"
			+ "b.branch_location  as branchch_location, mv.clients as client_out_reach,\n"
			+ "mv.reasons as key_reasons_for_default,\n" + "od.pos as pos, od.par as par\n" + "from financial_info f\n"
			+ "inner join financial_info fi on fi.finformation_id = f.info_id\n"
			+ "inner join branch_premise b on b.branch_premise_id = f.info_id\n"
			+ "inner join major_villages mv on mv.mpar_id = f.info_id\n"
			+ "inner join operational_details od  on od.details_id = f.info_id")
	public List<FinancialInstitutionDto> getFinancialInstitutionInfo(long financialinstitutiondto);

}
