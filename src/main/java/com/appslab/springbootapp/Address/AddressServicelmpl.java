package com.appslab.springbootapp.Address;

public class AddressServicelmpl implements  AddressService{
    AddressRepository addressRepository;

    @Override
    public void saveAddress(Address address) { addressRepository.save(address);}
}
