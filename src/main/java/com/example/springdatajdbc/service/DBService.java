package com.example.springdatajdbc.service;

import com.example.springdatajdbc.model.*;
import com.example.springdatajdbc.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class DBService
{

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    FilmRepository filmRepository;

    @Autowired
    LanguageRepository languageRepository;

    @Autowired
    ActorRepository actorRepository;

    @Autowired
    RentalRepository rentalRepository;

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    CityRepository cityRepository;

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    StaffRepository staffRepository;

    public Iterable<Category> findAllFilmCategoriesSortByName()
    {
        return categoryRepository.findAll(Sort.by("name").ascending());
    }

    public Iterable<Film> findAllFilmByCategory(String category)
    {
        return filmRepository.findAllByFilmCategry(category);
    }

    public Iterable<Film> findAllFilmByLanguage(String lang)
    {
        Long id = languageRepository.findByName(lang).getLanguageId();
        return filmRepository.findAllByLanguage(id);
    }

    public Iterable<Actor> findAllActorByFilm(Long film_id)
    {
        return actorRepository.findAllByFilm(film_id);
    }

    public String checkFilmStatus(Long id) {
        List<Rental> rentals = StreamSupport.stream(rentalRepository.findAllByFilm(id).spliterator(), false)
                .filter(rental -> rental.getReturnDate() != null)
                .sorted(Comparator.comparing(Rental::getReturnDate)).collect(Collectors.toList());
        return rentals.get(rentals.size() - 1).getReturnDate().toLocalDateTime().isAfter(LocalDateTime.now()) ? "Not available" : "Available";
    }

    public Iterable<Payment> findAllPaymentByCustomer(Long id)
    {
        return paymentRepository.findAllPaymentByCustomer(id);
    }

    public String findCustomerAndAddress(Long id)
    {
        Customer customer = customerRepository.findById(id).get();
        Address address = addressRepository.findByAddressId(customer.getAddressId());
        City city = cityRepository.findByCityId(address.getCityId());
        Country country = countryRepository.findByCountryId(city.getCountryId());
        return "Customer: " + customer.getFirstName() + " " + customer.getLastName() + ", email: " +
                 customer.getEmail() + ", address: " + address.getAddress() + " " + address.getAddress2() +
                " " + address.getDistrict() + ", phone: " + address.getPhone() + ", city: "
                + city.getCity() + ", country: " + country.getCountry();
    }

    public String findAllStaffInfo()
    {
        String allStaff = "";
        for (Staff staff : staffRepository.findAll())
        {
            Address address = addressRepository.findByAddressId(staff.getAddressId());
            allStaff = allStaff + "Staff name: " + staff.getLastName() + " " + staff.getFirstName() +
                    ", email: " +  staff.getEmail() + ", address: " + address.getAddress() + " " + address.getAddress2() +
                    ", phone: " + address.getPhone() + ", district: " + address.getDistrict() + "\n";
        }
        return allStaff;
    }

    public Iterable<Film> findAllFilmByActorFirstNameAndLastName(String firstName, String lastName)
    {
        Actor actor = actorRepository.findByFirstNameAndLastName(firstName,lastName);
        return filmRepository.findAllByActorId(actor.getActorId());
    }

    public Iterable<Rental> findAllRentalsByCustomer(Long id)
    {
        return rentalRepository.findAllByCustomerId(id);
    }


}
