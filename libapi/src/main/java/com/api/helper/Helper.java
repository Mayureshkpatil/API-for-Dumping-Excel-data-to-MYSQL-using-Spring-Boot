package com.api.helper;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import com.api.entity.Employee;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Helper {

   
    public static boolean checkExcelFormat(MultipartFile file) {
        String contentType = file.getContentType();
        return contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    }

   
    public static List<Employee> convertExcelToListOfEmployee(InputStream is) {
        List<Employee> list = new ArrayList<>();

        try (XSSFWorkbook workbook = new XSSFWorkbook(is)) {
            XSSFSheet sheet = workbook.getSheet("data");
            Iterator<Row> iterator = sheet.iterator();

            int rowNumber = 0;
            while (iterator.hasNext()) {
                Row row = iterator.next();

                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cells = row.iterator();
                Employee employee = new Employee();

                int cid = 0;
                while (cells.hasNext()) {
                    Cell cell = cells.next();

                    switch (cid) {
                        case 0:
                            employee.setEmployeeNumber(getCellValueAsString(cell));
                            break;
                        case 1:
                            employee.setName(getCellValueAsString(cell));
                            break;
                        case 2:
                            employee.setJoiningDate(getCellValueAsString(cell));
                            break;
                        case 3:
                            employee.setDateOfBirth(getCellValueAsString(cell));
                            break;
                        case 4:
                            employee.setBirthday(getCellValueAsString(cell));
                            break;
                        case 5:
                            employee.setEmployeeStatus(getCellValueAsString(cell));
                            break;
                        case 6:
                            employee.setEmployeeReferenceNumber(getCellValueAsString(cell));
                            break;
                        case 7:
                            employee.setGender(getCellValueAsString(cell));
                            break;
                        case 8:
                            employee.setConfirmationDate(getCellValueAsString(cell));
                            break;
                        case 9:
                            employee.setNickName(getCellValueAsString(cell));
                            break;
                        case 10:
                            employee.setExtensionNumber(getCellValueAsString(cell));
                            break;
                        case 11:
                            employee.setFirstName(getCellValueAsString(cell));
                            break;
                        case 12:
                            employee.setMiddleName(getCellValueAsString(cell));
                            break;
                        case 13:
                            employee.setLastName(getCellValueAsString(cell));
                            break;
                        case 14:
                            employee.setEmailAddress(getCellValueAsString(cell));
                            break;
                        case 15:
                            employee.setPersonalEmailAddress(getCellValueAsString(cell));
                            break;
                        case 16:
                            employee.setPANNumber(getCellValueAsString(cell));
                            break;
                        case 17:
                            employee.setMaritalStatus(getCellValueAsString(cell));
                            break;
                        case 18:
                            employee.setMarriageDate(getCellValueAsString(cell));
                            break;
                        case 19:
                            employee.setBloodGroup(getCellValueAsString(cell));
                            break;
                        case 20:
                            employee.setManagersEmployeeNo(getCellValueAsString(cell));
                            break;
                        case 21:
                            employee.setFathersName(getCellValueAsString(cell));
                            break;
                        case 22:
                            employee.setSpouseName(getCellValueAsString(cell));
                            break;
                        case 23:
                            employee.setIPAddress(getCellValueAsString(cell));
                            break;
                        case 24:
                            employee.setLoginUserName(getCellValueAsString(cell));
                            break;
                        case 25:
                            employee.setProbationPeriod(getCellValueAsString(cell));
                            break;
                        case 26:
                            employee.setNoticePeriod(getCellValueAsString(cell));
                            break;
                        case 27:
                            employee.setIsPhysicallyChallenged(getCellValueAsString(cell));
                            break;
                        case 28:
                            employee.setIsInternationalEmployee(getCellValueAsString(cell));
                            break;
                        case 29:
                            employee.setBackgroundCheckStatus(getCellValueAsString(cell));
                            break;
                        case 30:
                            employee.setBackgroundVerificationCompletedOn(getCellValueAsString(cell));
                            break;
                        case 31:
                            employee.setAgencyName(getCellValueAsString(cell));
                            break;
                        case 32:
                            employee.setBackgroundCheckRemarks(getCellValueAsString(cell));
                            break;
                        case 33:
                            employee.setEmergencyContactName(getCellValueAsString(cell));
                            break;
                        case 34:
                            employee.setEmergencyContactNumber(getCellValueAsString(cell));
                            break;
                        case 35:
                            employee.setBankAccountNumber(getCellValueAsString(cell));
                            break;
                        case 36:
                            employee.setIFSCCode(getCellValueAsString(cell));
                            break;
                        case 37:
                            employee.setBankAccountType(getCellValueAsString(cell));
                            break;
                        case 38:
                            employee.setBankName(getCellValueAsString(cell));
                            break;
                        case 39:
                            employee.setBankBranch(getCellValueAsString(cell));
                            break;
                        case 40:
                            employee.setSalaryPaymentMode(getCellValueAsString(cell));
                            break;
                        case 41:
                            employee.setDDPayableAt(getCellValueAsString(cell));
                            break;
                        case 42:
                            employee.setNameAsPerBankRecords(getCellValueAsString(cell));
                            break;
                        case 43:
                            employee.setIBAN(getCellValueAsString(cell));
                            break;
                        case 44:
                            employee.setIsEmployeeEligibleForPF(getCellValueAsString(cell));
                            break;
                        case 45:
                            employee.setPFNumber(getCellValueAsString(cell));
                            break;
                        case 46:
                            employee.setPFScheme(getCellValueAsString(cell));
                            break;
                        case 47:
                            employee.setPFJoiningDate(getCellValueAsString(cell));
                            break;
                        case 48:
                            employee.setIsEmployeeEligibleForExcessEPFContribution(getCellValueAsString(cell));
                            break;
                        case 49:
                            employee.setIsEmployeeEligibleForExcessEPSContribution(getCellValueAsString(cell));
                            break;
                        case 50:
                            employee.setIsExistingMemberOfPF(getCellValueAsString(cell));
                            break;
                        case 51:
                            employee.setIsEmployeeEligibleForESI(getCellValueAsString(cell));
                            break;
                        case 52:
                            employee.setESINumber(getCellValueAsString(cell));
                            break;
                        case 53:
                            employee.setIsEmployeeCoveredUnderLWF(getCellValueAsString(cell));
                            break;
                        case 54:
                            employee.setAadhaarCardEnrolmentNo(getCellValueAsString(cell));
                            break;
                        case 55:
                            employee.setNameAsOnAadhaarCard(getCellValueAsString(cell));
                            break;
                        case 56:
                            employee.setAadhaarCardNumber(getCellValueAsString(cell));
                            break;
                        case 57:
                            employee.setUniversalAccountNumber(getCellValueAsString(cell));
                            break;
                        case 58:
                            employee.setMobileNumber(getCellValueAsString(cell));
                            break;
                        case 59:
                            employee.setCountryOfOrigin(getCellValueAsString(cell));
                            break;
                        case 60:
                            employee.setCountryOfOrigin(getCellValueAsString(cell));
                            break;
                        case 61:
                            employee.setDesignation(getCellValueAsString(cell));
                            break;
                        case 62:
                            employee.setDepartment(getCellValueAsString(cell));
                            break;
                        case 63:
                            employee.setLocation(getCellValueAsString(cell));
                            break;
                        default:
                            break;
                    }
                    cid++;
                }
                list.add(employee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    private static String getCellValueAsString(Cell cell) {
        CellType cellType = cell.getCellType();
        switch (cellType) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            default:
                return "";
        }
    }
}
