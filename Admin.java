package com.simu;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import java.util.Date;

public class Admin {

    public String addTo(int userId, String username, String createdBy, Date createdDate){

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setUserId(userId);
        user.setUsername(username);
        user.setCreatedBy(createdBy);
        user.setCreatedDate(createdDate);

        session.save(user);
        session.getTransaction().commit();

        return "success";


    }
}
