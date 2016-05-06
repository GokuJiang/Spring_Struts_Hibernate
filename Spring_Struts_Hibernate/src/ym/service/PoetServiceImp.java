package ym.service;

import ym.dao.PoetDAO;
import ym.model.PoetriesModel;
import ym.model.PoetsModel;

import java.util.List;

/**
 * Created by jiangyongming on 5/4/16.
 */
public class PoetServiceImp implements PoetService {

    private PoetDAO poetDAO;


    public PoetServiceImp() {
    }

    @Override
    public List<PoetsModel> getPoet(String name) {
        return poetDAO.getPoetByName(name);
    }


    @Override
    public List<PoetriesModel> getPoetriesByContent(String content) {
        return poetDAO.getPoetriesByContent(content);
    }

    @Override
    public List<PoetriesModel> getPoetriesByTitle(String title) {
        return poetDAO.getPoetriesByTitle(title);
    }

    public PoetDAO getPoetDAO() {
        return poetDAO;
    }

    public void setPoetDAO(PoetDAO poetDAO) {
        this.poetDAO = poetDAO;
    }
}
