package de.iav.burgershop.repository;

import de.iav.burgershop.exception.MenueNotFoundException;
import de.iav.burgershop.model.Menus;

import java.util.ArrayList;
import java.util.List;

public class MenuesRepository {

    private List<Menus> menus;

    public MenuesRepository(){
        menus = new ArrayList<>();
    }

    public MenuesRepository(List<Menus> menus) {
        this.menus = menus;
    }

    public List<Menus> getAllMenus() {
        return menus;
    }

    public Menus getSingleMenuById(String id){
        for(Menus singleMenuFromList : menus){
            if(singleMenuFromList.id().equals(id)){
                return singleMenuFromList;
            }
        }
        throw new MenueNotFoundException(id);
    }

    public void addMenu(Menus menuToAdd){
        menus.add(menuToAdd);
    }


}
