package de.iav.burgershop.repository;

import de.iav.burgershop.exception.MenuNotFoundException;
import de.iav.burgershop.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MenusRepository {

    private List<Menu> menus;

    public MenusRepository(){
        menus = new ArrayList<>();
    }

    public MenusRepository(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Menu> getAllMenus() {
        return menus;
    }

    public Menu getSingleMenuById(String id){
        for(Menu singleMenuFromList : menus){
            if(singleMenuFromList.id().equals(id)){
                return singleMenuFromList;
            }
        }
        throw new MenuNotFoundException(id);
    }

    public void addMenu(Menu menuToAdd){
        menus.add(menuToAdd);
    }
    public void updateMenu(Menu otherMenu, String id){
        for(Menu menuToChange : menus){
            if(menuToChange.id().equals(id)){
                int index=menus.indexOf(menuToChange);
                menus.set(index, otherMenu);
            }
        }
        throw new MenuNotFoundException(id);
    }
    public void deleteMenuById(String id) {
        for (Menu menuToDelete : menus) {
            if (menuToDelete.id().equals(id)) {
                menus.remove(menuToDelete);
            }
        }
        throw new MenuNotFoundException(id);
    }
}
