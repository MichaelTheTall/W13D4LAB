package com.codeclan.example.HorsesForCourses.repositories.CustomerRepository;

import com.codeclan.example.HorsesForCourses.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {
    
    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getCustomerByCourse(Long courseID){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("customerBookingList", "booking");
            cr.add(Restrictions.eq("booking.course.id", courseID));
            results = cr.list();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return results;
    }

    @Transactional
    public List<Customer> getCustomerByTownAndCourse(String town, Long courseID){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);
            cr.add(Restrictions.eq("town", town).ignoreCase());
            cr.createAlias("customerBookingList", "booking");
            cr.add(Restrictions.eq("booking.course.id", courseID));
            results = cr.list();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return results;
    }

}
