package com.zion.school.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

import java.util.Set;

/**
 * Created by Lenovo on 01-03-2021.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REGISTRATION_ID")
    private Integer registrationId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "FATHER_NAME")
    private String fatherName;

    @Column(name = "MOTHER_NAME")
    private String motherName;

    @Column(name = "MOBILE_NUMBER")
    private BigInteger mobileNumber;

    @Column(name = "PRESENT_ADDRESS")
    private String presentAddress;

    @Column(name = "PERMENT_ADDRESS")
    private String permanentAddress;

    @Column(name = "SAMAGRA_ID")
    private String samagraId;

    @Column(name = "DATE_OF_ADMISSION")
    private Date dateOfAdmission;

    @Column(name = "CLASS_TO_JOIN")
    private String classToJoin;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Column(name = "MARKS_OF_IDENTIFICATION")
    private String marksOfIdentification;

    @Column(name = "RELIGION")
    private String religion;

    @Column(name = "CASTE")
    private String caste;

    @Column(name = "CAST_ID")
    private String castId;

    @Column(name = "AADHAR_NUMBER")
    private String aadharNumber;

    @Column(name = "BANK_ACCOUNT_NUMBER")
    private String bankAccountNumber;

    @Column(name = "IFSC_CODE")
    private String ifscCode;

    @Column(name = "CHILD_HANDICAPPED")
    private Boolean childHandicapped;

    @Column(name = "FATHER_MOTHER_EXPIRED")
    private Boolean fatherMotherExpired;

    @Column(name = "SIBLINGS")
    private Boolean siblings = false;

    @Column(name = "RTE_STUDENTS")
    private Boolean rteStudent = false;


    @OneToMany(targetEntity = SiblingInformation.class, cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "Student_Sibling_fk", referencedColumnName = "REGISTRATION_ID", nullable = false, updatable = false)
    private Set<SiblingInformation> siblingInformation;


}
