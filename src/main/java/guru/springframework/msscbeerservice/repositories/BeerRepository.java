package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Projet:  mssc-beer-service
 * Cree par: Brice dymas
 * Date Creation: 2020, Tuesday 15 of December
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
