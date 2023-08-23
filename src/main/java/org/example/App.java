package org.example;

import org.example.persistence.configurations.JpaManager;
import org.example.persistence.models.views.ActorInfo;
import org.example.persistence.models.views.CustomerList;
import org.example.persistence.models.views.FilmList;
import org.example.services.*;
import org.example.services.dtos.actor.ActorWithCategoriesDto;
import org.example.services.dtos.customer.CustomerWithRentedFilmsDto;
import org.example.services.dtos.film.FilmWithRentals;
import org.example.services.dtos.store.StoreWithFilmsDto;


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
        System.out.println(CategoryService.INSTANCE.getAllSalesByFilmCategory());
        JpaManager.close();
    }
}
