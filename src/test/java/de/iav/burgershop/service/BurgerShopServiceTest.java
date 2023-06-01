package de.iav.burgershop.service;

import de.iav.burgershop.exception.MenuIsEmptyException;
import de.iav.burgershop.model.Menu;
import de.iav.burgershop.repository.MenusRepository;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BurgerShopServiceTest {

    MenusRepository menusRepository = mock(MenusRepository.class);
    BurgerShopService burgerShopService = new BurgerShopService(menusRepository);

    @Test
    void getAllMenus_whenMenuExist_thenReturnMenus() {
        //GIVEN
        List<Menu> expectedListOfMenus = List.of(new Menu("1", "Cheeseburger", 14.99F,"Burger", "fries", "coke"), new Menu("2", "Beefburger", 19.99F,"Burger", "fries", "sprite"));
        when(menusRepository.getAllMenus()).thenReturn(expectedListOfMenus);

        //WHEN
        List<Menu> actualListOfMenus = burgerShopService.getAllMenus();

        //THEN
        assertEquals(expectedListOfMenus, actualListOfMenus);

        verify(menusRepository).getAllMenus();
    }

    @Test
    void getSingleMenuById_whenMenuIdExist_thenReturnSingleMenu() {
        //GIVEN
        Menu expectedMenu = new Menu("1", "Cheeseburger", 14.99F,"Burger", "fries", "coke");
        when(menusRepository.getSingleMenuById(expectedMenu.id())).thenReturn(expectedMenu);

        //WHEN
        Menu actualMenu = burgerShopService.getSingleMenuById(expectedMenu.id());

        //THEN
        assertEquals(expectedMenu, actualMenu);
        verify(menusRepository).getSingleMenuById(any());
    }

    @Test
    void addMenu_whenMenuIsAdded_thenVerifyMethodCall() {
        //GIVEN
        Menu expectedMenu = new Menu("1", "Cheeseburger", 14.99F,"Burger", "fries", "coke");

        //WHEN + THEN
        burgerShopService.addMenu(expectedMenu);
        //THEN
        verify(menusRepository).addMenu(expectedMenu);
    }

    @Test
    void updateMenu() {
        //GIVEN
    }

    @Test
    void deleteMenu() {
    }
}