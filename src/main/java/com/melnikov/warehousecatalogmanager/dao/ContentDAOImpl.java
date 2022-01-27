package com.melnikov.warehousecatalogmanager.dao;

import com.melnikov.warehousecatalogmanager.entities.Content;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Repository
public class ContentDAOImpl implements ContentDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Content> getAllContent() {
        Session session = sessionFactory.getCurrentSession();

        List<Content> resultList = session.createQuery("from Content").getResultList();

        return resultList;
    }

    @Override
    public void saveOrUpdateContent(Content content) {
        Session session = sessionFactory.getCurrentSession();

        //Setting dateOfAdd to content, so it could be seen to our user without need to type it by yourself
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        content.setDateOfAdd(LocalDateTime.now().format(formatter));

        session.saveOrUpdate(content);
    }

    @Override
    public Content getContentById(int id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Content.class, id);
    }

    @Override
    public void deleteContentById(int id) {
        Session session = sessionFactory.getCurrentSession();

        session.createQuery("delete  from Content where id=:contentId")
                .setParameter("contentId", id)
                .executeUpdate();
    }
}
