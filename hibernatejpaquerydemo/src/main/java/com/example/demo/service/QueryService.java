package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;
import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.List;

@Service
public class QueryService {

    @PersistenceContext
    private EntityManager em;

    public List<Employee> getEmployeesUsingCriteria(double minSalary) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
        Root<Employee> root = cq.from(Employee.class);
        cq.select(root).where(cb.gt(root.get("salary"), minSalary));
        return em.createQuery(cq).getResultList();
    }
}