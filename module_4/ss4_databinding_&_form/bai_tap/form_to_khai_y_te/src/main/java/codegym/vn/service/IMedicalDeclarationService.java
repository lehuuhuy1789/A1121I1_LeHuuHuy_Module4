package codegym.vn.service;

import codegym.vn.entity.MedicalDeclaration;

import java.util.List;

public interface IMedicalDeclarationService {
    public List<MedicalDeclaration> showAll();
    public MedicalDeclaration findById(Integer id);
    public boolean update(MedicalDeclaration medicalDeclaration);
    public boolean create(MedicalDeclaration medicalDeclaration);
}
