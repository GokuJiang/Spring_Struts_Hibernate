package ym.service;

import ym.model.PoetsModel;

import java.util.List;

/**
 * Created by jiangyongming on 5/4/16.
 */
public interface PoetService {

    public List<PoetsModel> getPoet(String name);

}
