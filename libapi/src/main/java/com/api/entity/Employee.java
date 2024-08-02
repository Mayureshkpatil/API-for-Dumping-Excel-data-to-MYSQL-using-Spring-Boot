package com.api.entity;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private String EmployeeNumber;
	public String getEmployeeNumber() {
		return EmployeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		EmployeeNumber = employeeNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getJoiningDate() {
		return JoiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		JoiningDate = joiningDate;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public String getEmployeeStatus() {
		return EmployeeStatus;
	}
	public void setEmployeeStatus(String employeeStatus) {
		EmployeeStatus = employeeStatus;
	}
	public String getEmployeeReferenceNumber() {
		return EmployeeReferenceNumber;
	}
	public void setEmployeeReferenceNumber(String employeeReferenceNumber) {
		EmployeeReferenceNumber = employeeReferenceNumber;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getConfirmationDate() {
		return ConfirmationDate;
	}
	public void setConfirmationDate(String confirmationDate) {
		ConfirmationDate = confirmationDate;
	}
	public String getNickName() {
		return NickName;
	}
	public void setNickName(String nickName) {
		NickName = nickName;
	}
	public String getExtensionNumber() {
		return ExtensionNumber;
	}
	public void setExtensionNumber(String extensionNumber) {
		ExtensionNumber = extensionNumber;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	public String getPersonalEmailAddress() {
		return PersonalEmailAddress;
	}
	public void setPersonalEmailAddress(String personalEmailAddress) {
		PersonalEmailAddress = personalEmailAddress;
	}
	public String getPANNumber() {
		return PANNumber;
	}
	public void setPANNumber(String pANNumber) {
		PANNumber = pANNumber;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public String getMarriageDate() {
		return MarriageDate;
	}
	public void setMarriageDate(String marriageDate) {
		MarriageDate = marriageDate;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	public String getManagersEmployeeNo() {
		return ManagersEmployeeNo;
	}
	public void setManagersEmployeeNo(String managersEmployeeNo) {
		ManagersEmployeeNo = managersEmployeeNo;
	}
	public String getFathersName() {
		return FathersName;
	}
	public void setFathersName(String fathersName) {
		FathersName = fathersName;
	}
	public String getSpouseName() {
		return SpouseName;
	}
	public void setSpouseName(String spouseName) {
		SpouseName = spouseName;
	}
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
	public String getLoginUserName() {
		return LoginUserName;
	}
	public void setLoginUserName(String loginUserName) {
		LoginUserName = loginUserName;
	}
	public String getProbationPeriod() {
		return ProbationPeriod;
	}
	public void setProbationPeriod(String probationPeriod) {
		ProbationPeriod = probationPeriod;
	}
	public String getNoticePeriod() {
		return NoticePeriod;
	}
	public void setNoticePeriod(String noticePeriod) {
		NoticePeriod = noticePeriod;
	}
	public String getIsPhysicallyChallenged() {
		return IsPhysicallyChallenged;
	}
	public void setIsPhysicallyChallenged(String isPhysicallyChallenged) {
		IsPhysicallyChallenged = isPhysicallyChallenged;
	}
	public String getIsInternationalEmployee() {
		return IsInternationalEmployee;
	}
	public void setIsInternationalEmployee(String isInternationalEmployee) {
		IsInternationalEmployee = isInternationalEmployee;
	}
	public String getBackgroundCheckStatus() {
		return BackgroundCheckStatus;
	}
	public void setBackgroundCheckStatus(String backgroundCheckStatus) {
		BackgroundCheckStatus = backgroundCheckStatus;
	}
	public String getBackgroundVerificationCompletedOn() {
		return BackgroundVerificationCompletedOn;
	}
	public void setBackgroundVerificationCompletedOn(String backgroundVerificationCompletedOn) {
		BackgroundVerificationCompletedOn = backgroundVerificationCompletedOn;
	}
	public String getAgencyName() {
		return AgencyName;
	}
	public void setAgencyName(String agencyName) {
		AgencyName = agencyName;
	}
	public String getBackgroundCheckRemarks() {
		return BackgroundCheckRemarks;
	}
	public void setBackgroundCheckRemarks(String backgroundCheckRemarks) {
		BackgroundCheckRemarks = backgroundCheckRemarks;
	}
	public String getEmergencyContactName() {
		return EmergencyContactName;
	}
	public void setEmergencyContactName(String emergencyContactName) {
		EmergencyContactName = emergencyContactName;
	}
	public String getEmergencyContactNumber() {
		return EmergencyContactNumber;
	}
	public void setEmergencyContactNumber(String emergencyContactNumber) {
		EmergencyContactNumber = emergencyContactNumber;
	}
	public String getBankAccountNumber() {
		return BankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		BankAccountNumber = bankAccountNumber;
	}
	public String getIFSCCode() {
		return IFSCCode;
	}
	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}
	public String getBankAccountType() {
		return BankAccountType;
	}
	public void setBankAccountType(String bankAccountType) {
		BankAccountType = bankAccountType;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getBankBranch() {
		return BankBranch;
	}
	public void setBankBranch(String bankBranch) {
		BankBranch = bankBranch;
	}
	public String getSalaryPaymentMode() {
		return SalaryPaymentMode;
	}
	public void setSalaryPaymentMode(String salaryPaymentMode) {
		SalaryPaymentMode = salaryPaymentMode;
	}
	public String getDDPayableAt() {
		return DDPayableAt;
	}
	public void setDDPayableAt(String dDPayableAt) {
		DDPayableAt = dDPayableAt;
	}
	public String getNameAsPerBankRecords() {
		return NameAsPerBankRecords;
	}
	public void setNameAsPerBankRecords(String nameAsPerBankRecords) {
		NameAsPerBankRecords = nameAsPerBankRecords;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public String getIsEmployeeEligibleForPF() {
		return IsEmployeeEligibleForPF;
	}
	public void setIsEmployeeEligibleForPF(String isEmployeeEligibleForPF) {
		IsEmployeeEligibleForPF = isEmployeeEligibleForPF;
	}
	public String getPFNumber() {
		return PFNumber;
	}
	public void setPFNumber(String pFNumber) {
		PFNumber = pFNumber;
	}
	public String getPFScheme() {
		return PFScheme;
	}
	public void setPFScheme(String pFScheme) {
		PFScheme = pFScheme;
	}
	public String getPFJoiningDate() {
		return PFJoiningDate;
	}
	public void setPFJoiningDate(String pFJoiningDate) {
		PFJoiningDate = pFJoiningDate;
	}
	public String getIsEmployeeEligibleForExcessEPFContribution() {
		return IsEmployeeEligibleForExcessEPFContribution;
	}
	public void setIsEmployeeEligibleForExcessEPFContribution(String isEmployeeEligibleForExcessEPFContribution) {
		IsEmployeeEligibleForExcessEPFContribution = isEmployeeEligibleForExcessEPFContribution;
	}
	public String getIsEmployeeEligibleForExcessEPSContribution() {
		return IsEmployeeEligibleForExcessEPSContribution;
	}
	public void setIsEmployeeEligibleForExcessEPSContribution(String isEmployeeEligibleForExcessEPSContribution) {
		IsEmployeeEligibleForExcessEPSContribution = isEmployeeEligibleForExcessEPSContribution;
	}
	public String getIsExistingMemberOfPF() {
		return IsExistingMemberOfPF;
	}
	public void setIsExistingMemberOfPF(String isExistingMemberOfPF) {
		IsExistingMemberOfPF = isExistingMemberOfPF;
	}
	public String getIsEmployeeEligibleForESI() {
		return IsEmployeeEligibleForESI;
	}
	public void setIsEmployeeEligibleForESI(String isEmployeeEligibleForESI) {
		IsEmployeeEligibleForESI = isEmployeeEligibleForESI;
	}
	public String getESINumber() {
		return ESINumber;
	}
	public void setESINumber(String eSINumber) {
		ESINumber = eSINumber;
	}
	public String getIsEmployeeCoveredUnderLWF() {
		return IsEmployeeCoveredUnderLWF;
	}
	public void setIsEmployeeCoveredUnderLWF(String isEmployeeCoveredUnderLWF) {
		IsEmployeeCoveredUnderLWF = isEmployeeCoveredUnderLWF;
	}
	public String getAadhaarCardEnrolmentNo() {
		return AadhaarCardEnrolmentNo;
	}
	public void setAadhaarCardEnrolmentNo(String aadhaarCardEnrolmentNo) {
		AadhaarCardEnrolmentNo = aadhaarCardEnrolmentNo;
	}
	public String getNameAsOnAadhaarCard() {
		return NameAsOnAadhaarCard;
	}
	public void setNameAsOnAadhaarCard(String nameAsOnAadhaarCard) {
		NameAsOnAadhaarCard = nameAsOnAadhaarCard;
	}
	public String getAadhaarCardNumber() {
		return AadhaarCardNumber;
	}
	public void setAadhaarCardNumber(String aadhaarCardNumber) {
		AadhaarCardNumber = aadhaarCardNumber;
	}
	public String getUniversalAccountNumber() {
		return UniversalAccountNumber;
	}
	public void setUniversalAccountNumber(String universalAccountNumber) {
		UniversalAccountNumber = universalAccountNumber;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getCountryOfOrigin() {
		return CountryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		CountryOfOrigin = countryOfOrigin;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	private String Name;
	private String JoiningDate;
	private String DateOfBirth;
	private String Birthday;
	private String EmployeeStatus;
	private String EmployeeReferenceNumber;
	private String Gender;
	private String ConfirmationDate;
	private String NickName;
	private String ExtensionNumber;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String EmailAddress;
	private String PersonalEmailAddress;
	private String PANNumber;
	private String MaritalStatus;
	private String MarriageDate;
	private String BloodGroup;
	private String ManagersEmployeeNo;
	private String FathersName;
	private String SpouseName;
	private String IPAddress;
	private String LoginUserName;
	private String ProbationPeriod;
	private String NoticePeriod;
	private String IsPhysicallyChallenged;
	private String IsInternationalEmployee;
	private String BackgroundCheckStatus;
	private String BackgroundVerificationCompletedOn;
	private String AgencyName;
	private String BackgroundCheckRemarks;
	private String EmergencyContactName;
	private String EmergencyContactNumber;
	private String BankAccountNumber;
	private String IFSCCode;
	private String BankAccountType;
	private String BankName;
	private String BankBranch;
	private String SalaryPaymentMode;
	private String DDPayableAt;
	private String NameAsPerBankRecords;
	private String IBAN;
	private String IsEmployeeEligibleForPF;
	private String PFNumber;
	private String PFScheme;
	private String PFJoiningDate;
	private String IsEmployeeEligibleForExcessEPFContribution;
	private String IsEmployeeEligibleForExcessEPSContribution;
	private String IsExistingMemberOfPF;
	private String IsEmployeeEligibleForESI;
	private String ESINumber;
	private String IsEmployeeCoveredUnderLWF;
	private String AadhaarCardEnrolmentNo;
	private String NameAsOnAadhaarCard;
	private String AadhaarCardNumber;
	private String UniversalAccountNumber;
	private String MobileNumber;
	private String CountryOfOrigin;
	private String Designation;
	private String Department;
	private String Location;


}
