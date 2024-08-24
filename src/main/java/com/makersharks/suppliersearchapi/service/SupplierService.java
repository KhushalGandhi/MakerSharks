package com.makersharks.suppliersearchapi.service;

import com.makersharks.suppliersearchapi.model.Supplier;
import com.makersharks.suppliersearchapi.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getSuppliers(String location, String natureOfBusiness, String manufacturingProcesses) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcesses(location, natureOfBusiness, manufacturingProcesses);
    }
}
