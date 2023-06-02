package de.iav.burgershop.controller;

import de.iav.burgershop.model.Menu;
import de.iav.burgershop.service.BurgerShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/burgershop")
public class BurgerShopController {

    private final BurgerShopService burgerShopService;

    public BurgerShopController(BurgerShopService burgerShopService) {
        this.burgerShopService = burgerShopService;
    }
    @GetMapping("/Menus")
    public List<Menu> getAllMenus(){return burgerShopService.getAllMenus();}

    @GetMapping("Menus/{id}")
    Menu getSingleMenuById(String id){return burgerShopService.getSingleMenuById(id);}

    @PostMapping ("/Menus")
    public void addMenu(Menu menuToAdd){burgerShopService.addMenu(menuToAdd);}

    @PostMapping ("/Menus/{id}")
    public void updateMenu(Menu otherMenu, String id){burgerShopService.updateMenu(otherMenu, id);}

    @DeleteMapping ("/Menus")
    public void deleteMenu(String id){burgerShopService.deleteMenu(id);}
}
