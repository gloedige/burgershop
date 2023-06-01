package de.iav.burgershop.service;

import de.iav.burgershop.model.Menu;
import de.iav.burgershop.repository.MenusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BurgerShopService {
    private MenusRepository menusRepository;

    public BurgerShopService(MenusRepository menusRepository) {
        this.menusRepository = menusRepository;
    }
    public List<Menu> getAllMenus() {return menusRepository.getAllMenus(); }
    public Menu getSingleMenuById(String id) {return menusRepository.getSingleMenuById(id); }
    public void addMenu(Menu menuToAdd) { menusRepository.addMenu(menuToAdd);}
    public void updateMenu(Menu otherMenu, String id){menusRepository.updateMenu(otherMenu, id);}
    public void deleteMenu(String id){menusRepository.deleteMenuById(id);}

}
