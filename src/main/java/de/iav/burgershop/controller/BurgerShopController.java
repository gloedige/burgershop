package de.iav.burgershop.controller;

import de.iav.burgershop.service.BurgerShopService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/burgershop")
public class BurgerShopController {

    private final BurgerShopService burgerShopService;

    public BurgerShopController(BurgerShopService burgerShopService) {
        this.burgerShopService = burgerShopService;
    }

}
