package com.HealthCare.HealthCare.service;

import com.HealthCare.HealthCare.model.entities.Bill;
import com.HealthCare.HealthCare.repository.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    private final BillRepository billRepository;

    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public List<Bill> getBills() {
        return billRepository.findAll();
    }

    public Bill getBill(Long id) {
        return billRepository.findById(id);
    }

    public Bill createBill(Bill bill) {

        return billRepository.save(bill);
    }

    public void deleteBill(Long id) {
        billRepository.delete(billRepository.findById(id));
    }

    public void updateBill(Bill bill) {
        billRepository.save(bill);
    }
}
