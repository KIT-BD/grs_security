package gov.bd.grs_security.auth.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OfficeInformation {
    private Long officeId;
    private String officeNameBangla;
    private String officeNameEnglish;
    private Long officeMinistryId;
    private Long officeOriginId;
    private String name;
    private String designation;
    private Long employeeRecordId;
    private Long officeUnitOrganogramId;
    private Long layerLevel;
    private Long geoDivisionId;
    private Long geoDistrictId;
}
