package com.griddynamics;

import lombok.*;

import java.util.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String username;
    private String firstName = "Vasya";
    private String lastName = "Petrov";
    private String room;
    private String internalPhone;
    private String socialCastContact;
    private String gitHubContact;
    private String dockerCloudId;
    private String comments;
    private String department;
    private Employee manager;
    private boolean deleted;
    private boolean hasActiveForeignPassport;
    private Date dismissalDate;
    private String fullName;
    private String nativeFullName;
    private String jobRequisitionNumber;
    private Long bambooHRid;
    private String location = "Saratov";
    @Singular
    private List<String> projects = new ArrayList();
    private Date birthday = new GregorianCalendar(2018, 11, 19).getTime();
    private String gradeAsString = "Senior Automation Quality Engineer";
    private String fullNameStartedWithLastName;
    private String specialization = "Automation";
    private String workProfile = "Quality Engineer";
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
