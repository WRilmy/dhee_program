package edu.hit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
/*
人员实体类

*/


@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {

    private Integer peopleId;
    private short idType;
    private String id;
    private String name;
    private short sex;
    private String nationality;
    private LocalDate birthday;
    private LocalDate workDate;
    private LocalDate retirementDate;
    private short retirement;
    private int residenceType;
    private String residenceAddress;
    private short education;
    private short politicalStatus;
    private String identity;
    private short employment;
    private short technicalPosition;
    private short workerLevel;
    private short marriage;
    private short administrativePosition;
    private String note;
    private String companyId;
    private short medicalPersonnel;
    private short health;
    private boolean modelWorker;
    private boolean cadre;
    private boolean civilServant;
    private boolean authorizedStrength;
    private short residentType;
    private boolean flexibleEmployment;
    private boolean migrantWorker;
    private boolean employer;
    private boolean militaryPersonnel;
    private String socialSecurityId;
    private String medinsId;

}

