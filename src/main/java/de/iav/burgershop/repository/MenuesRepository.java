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
    public void changeMenuById(Menus otherMenu, String id){
        for(Menus menuToChange : menus){
            if(menuToChange.id().equals(id)){
                int index=menus.indexOf(menuToChange);
                menus.set(index, otherMenu);
            }
        }
        throw new MenueNotFoundException(id);
    }
    public void deleteMenuById(String id) {
        for (Menus menuToDelete : menus) {
            if (menuToDelete.id().equals(id)) {
                menus.remove(menuToDelete);
            }
        }
        throw new MenueNotFoundException(id);
    }
}
