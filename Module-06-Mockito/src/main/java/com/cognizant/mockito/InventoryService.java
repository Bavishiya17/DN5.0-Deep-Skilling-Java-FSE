package com.cognizant.mockito;

public interface InventoryService {
    void reserve(String item);
    void confirm(String item);
}
