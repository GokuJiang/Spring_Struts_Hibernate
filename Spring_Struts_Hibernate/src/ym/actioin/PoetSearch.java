package ym.actioin;

import com.opensymphony.xwork2.ActionSupport;
import ym.model.PoetriesModel;
import ym.model.PoetsModel;
import ym.service.PoetService;

import java.util.List;

/**
 * Created by jiangyongming on 5/4/16.
 */
public class PoetSearch extends ActionSupport {

    private PoetService poetService;
    private String searchKey;
    private String searchMethod;

    public PoetSearch() {
    }


    @Override
    public String execute() throws Exception {

        if (searchKey.equals("")||searchKey==null){
            return "error";
        }

        if (searchMethod.equals("name")){

            List<PoetsModel> poets = poetService.getPoet(searchKey);
            if (poets==null || poets.size()==0){
                return "error";
            }
            return "name";
        }
        else if (searchMethod.equals("title")){
            List<PoetriesModel> poetriesModels = poetService.getPoetriesByTitle(searchKey);
            if (poetriesModels==null || poetriesModels.size()==0){
                return "error";
            }

            return "title";

        }else if (searchMethod.equals("content")){
            List<PoetriesModel> poetriesModels = poetService.getPoetriesByContent(searchKey);

            if (poetriesModels==null || poetriesModels.size()==0){
                return "error";
            }
            return "content";

        }else {
            return "error";
        }
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
