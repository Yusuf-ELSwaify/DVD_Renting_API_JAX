package org.example;

import org.example.persistence.configurations.JpaManager;
import org.example.persistence.models.Film;
import org.example.persistence.models.views.FilmList;
import org.example.persistence.repositories.FilmRepository;
import org.example.persistence.repositories.views.FilmListRepository;

import java.util.List;
import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ///System.out.println( "Hello World!" );
//        Film film = new FilmRepository().find(1).get();
//        Actor actor = new ActorRepository().find(1).get();
        // ActorInfo actorInfo = new ActorInfoRepository().find(1).get();
        // SalesByStore salesByStore = new SalesByStoreRepository().find("Woodridge,Australia").get();
//         List salesByStore = new SalesByStoreRepository().findAll();
//        System.out.println(actor);
//        List<Film> films = new FilmRepository().findAll();
//        System.out.println(films.size());

/*        FilmRepository filmRepository = new FilmRepository();
        Optional<Film> film = filmRepository.find(1000);
        String title = film.get().getTitle();
//        film.get().setTitle(title + "2");
        film.get().setTitle(title.replace("2", ""));
        filmRepository.update(film.get());
        System.out.println(film.get());*/

        List<FilmList> all = new FilmListRepository().findAll();
        System.out.println(all);

        JpaManager.close();
    }
}
