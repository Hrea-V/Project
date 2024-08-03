package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionService {

    DoctorRepository doctorRepository;
    DrugRepository drugRepository;

    @Autowired
    public PrescriptionService(DoctorRepository doctorRepository, DrugRepository drugRepository) {
        this.doctorRepository = doctorRepository;
        this.drugRepository = drugRepository;
    }

    //When a patient is issued a prescription, the patient's name, weight, drugId and doctorId are sent to the Controller which then calls the fillOrder method in the Prescription service.
    //
    //The fillOrder method
    //
    //    retrieves the drug name and dosageRate from the database and the doctor's name from the database
    //    calculates the correct dosage based on patient weight and dosageRate (weight * dosageRate)
    //    returns a PrescriptionOrderForm to object with the patient name, doctor name, dosage and drug name
//Order order = new Order("Chris", 100, 1, 1);
    public PrescriptionOrderForm fillOrder(Order order){
        Drug drug = drugRepository.findById(order.getDrugId()).get();
        Doctor doctor = doctorRepository.findById(order.getDoctorId()).get();
        double dosage = order.getPatientWeight() * drug.getDosageRate();
        return new PrescriptionOrderForm(order.getPatientName(), doctor.getName(), dosage, drug.getName());
    }


}
