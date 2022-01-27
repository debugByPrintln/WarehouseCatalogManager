package com.melnikov.warehousecatalogmanager.service;

import com.melnikov.warehousecatalogmanager.dao.ContentDAO;
import com.melnikov.warehousecatalogmanager.entities.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService{

    @Autowired
    private ContentDAO contentDAO;

    @Override
    @Transactional
    public List<Content> getAllContent() {
        return contentDAO.getAllContent();
    }

    @Override
    @Transactional
    public void saveOrUpdateContent(Content content) {
        contentDAO.saveOrUpdateContent(content);
    }

    @Override
    @Transactional
    public Content getContentById(int id) {
        return contentDAO.getContentById(id);
    }

    @Override
    @Transactional
    public void deleteContentById(int id) {
        contentDAO.deleteContentById(id);
    }
}
