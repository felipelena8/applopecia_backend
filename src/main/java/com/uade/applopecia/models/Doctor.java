package com.uade.applopecia.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Doctor extends User{

    List<Patient> patientList;

}
