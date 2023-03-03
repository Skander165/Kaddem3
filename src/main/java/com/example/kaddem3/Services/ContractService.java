package com.example.kaddem3.Services;

import com.example.kaddem3.Models.Contrat;
import com.example.kaddem3.Repository.ContractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContractService implements IContractService {
    @Autowired
    private final ContractRepository _contractRepository;

    @Override
    public void addContract(Contrat c) {
        _contractRepository.save(c);

    }

    @Override
    public void updateContract(Contrat c) {
        _contractRepository.save(c);
    }

    @Override
    public List<Contrat> getAllContracts() {
        return _contractRepository.findAll();
    }

    @Override
    public Contrat getContractById(Integer id) {
        return _contractRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteContract(Integer id) {
        _contractRepository.deleteById(id);

    }
}
