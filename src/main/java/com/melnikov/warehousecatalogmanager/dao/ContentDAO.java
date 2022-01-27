package com.melnikov.warehousecatalogmanager.dao;

import com.melnikov.warehousecatalogmanager.entities.Content;

import java.util.List;

public interface ContentDAO {
    public List<Content> getAllContent();

    public void saveOrUpdateContent(Content content);

    public Content getContentById(int id);

    public void deleteContentById(int id);
}
