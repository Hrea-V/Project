package com.example.demo.model;

import lombok.Data;

@Data
public class PrescriptionOrderForm{
    private String patientName;
    private String doctorName;
    private double dosage;
    private String drugName;


    public PrescriptionOrderForm(String patientName, String doctorName, double dosage, String drugName) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.dosage = dosage;
        this.drugName = drugName;
    }
}