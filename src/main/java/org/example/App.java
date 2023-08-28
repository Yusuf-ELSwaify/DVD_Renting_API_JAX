package org.example;

import org.example.business.dtos.actor.ActorWithFilmsDto;
import org.example.business.dtos.film.FilmAddDto;
import org.example.business.dtos.film.FilmDto;
import org.example.business.dtos.language.LanguageDto;
import org.example.business.services.*;
import org.example.persistence.configurations.JpaManager;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Arrays;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ActorService service = new ActorService.INSTANCE;
//        System.out.println(actor);
/*        RentalService service = new RentalService.INSTANCE;
        PaymentService pservice = new PaymentService.INSTANCE;
//        ActorAddDto insert = service.insert(new ActorAddDto("y", "y"));
        RentalDto rental = service.get(1476);
        PaymentDto payment = pservice.get(5);
        System.out.println(rental);
        System.out.println("_________________________________________________");
        System.out.println("_________________________________________________");
        System.out.println(payment);*/
/*        FilmService filmService = new FilmService.INSTANCE;
*//*        FilmWithActorsDto actorWithFilms = filmService.getFilmWithActors(1);
        System.out.println(actorWithFilms);*//*
        FilmWithStores filmWithStores = filmService.getFilmWithStores(1);
        System.out.println(filmWithStores);*/

/*        ActorService actorService = new ActorService.INSTANCE;
        ActorWithFilmsDto f = actorService.getActorWithFilms(1);
        System.out.println(f);*/

/*        CountryService countryService = new CountryService.INSTANCE;
        countryService.insert(new CountryAddDto("eg"));*/
/*        StoreService storeService = new StoreService.INSTANCE;
        StoreWithFilmsDto storeWithFilms = storeService.getStoreWithFilms((short) 1);
        System.out.println(storeWithFilms);*/
/*
        ActorService service = new ActorService.INSTANCE;
        System.out.println(service.getActorWithFilms(1));*/
/*        FilmService filmService = new FilmService.INSTANCE;
        FilmWithRentals filmWithRentals = filmService.getFilmWithRentals(1);
        System.out.println(filmWithRentals);*/

/*        CustomerService customerService = new CustomerService.INSTANCE;
        CustomerWithRentedFilmsDto customerWithRentedFilms = customerService.getCustomerWithRentedFilms(1);
        System.out.println(customerWithRentedFilms);*/

/*        ActorWithCategoriesDto actorWithCategories = ActorService.INSTANCE.getActorWithCategories(1);
        System.out.println(actorWithCategories);*/
/*        ActorInfo actorInfo = ActorService.INSTANCE.getActorInfo(1);
        System.out.println(actorInfo);*/

/*        CustomerList customerList = CustomerService.INSTANCE.getCustomerList(1);
        System.out.println(customerList);

        FilmList filmList = FilmService.INSTANCE.getFilmList(1);
        System.out.println(filmList);*/
//        System.out.println(StoreService.INSTANCE.getSalesByStore("Woodridge,Australia"));
//        System.out.println(CategoryService.INSTANCE.getCategoryWithFilms((short) 1));
//        System.out.println(CategoryService.INSTANCE.getAllSalesByFilmCategory());
 /*       FilmService filmService = FilmService.INSTANCE;
        LanguageDto z = new LanguageDto();
        z.setId((short) 1);
        z.setName("yuu");
        z.setLastUpdate(Instant.now());
        LanguageDto x = new LanguageDto();
        x.setId((short) 1);
        FilmDto insert = filmService.insert(new FilmAddDto("a",
                "a",
                2000,
                z, x, (short) 1,
                new BigDecimal(1),
                10, new BigDecimal(10),
                "G", "Trailers,Deleted Scenes"));
        System.out.println(insert);*/
/*        List<FilmDto> list = FilmService.INSTANCE.getList(1, 10);
        System.out.println(list);*/
        //System.out.println(ActorService.INSTANCE.get(1));
//        System.out.println(Arrays.toString(AddressService.INSTANCE.get(1).getLocation()));
//        System.out.println(StoreService.INSTANCE.getStoreWithCustomers((short) 1));

        System.out.println(LanguageService.INSTANCE.getLanguageWithFilms((short) 1));
        JpaManager.close();
    }
}
