package com.example.demo.model;

import lombok.Data;

@Data
public class Order{
    private String patientName;
    private double patientWeight;
    private int doctorId;
    private int drugId;
}
