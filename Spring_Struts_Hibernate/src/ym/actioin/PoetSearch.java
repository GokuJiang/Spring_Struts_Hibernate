package ym.actioin;

import com.opensymphony.xwork2.ActionSupport;
import ym.service.PoetService;

/**
 * Created by jiangyongming on 5/4/16.
 */
public class PoetSearch extends ActionSupport {

    private PoetService poetService;
    private String searchKey;
    private String searchMethod;

    public PoetSearch() {
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getSearchMethod() {
        return searchMethod;
    }

    public void setSearchMethod(String searchMethod) {
        this.searchMethod = searchMethod;
    }

    public PoetService getPoetService() {
        return poetService;
    }

    public void setPoetService(PoetService poetService) {
        this.poetService = poetService;
    }
}
