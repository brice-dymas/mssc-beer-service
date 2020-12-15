package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Projet:  mssc-beer-service
 * Cree par: Brice dymas
 * Date Creation: 2020, Tuesday 15 of December
 */
@Slf4j
@Component
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                .id(UUID.randomUUID())
                .beerName("Origin")
                .beerStyle("Herbal drink")
                .quantityToBrew(200)
                .upc(211546684L)
                .price(new BigDecimal("700.00"))
                .build());

            beerRepository.save(Beer.builder()
                .id(UUID.randomUUID())
                .beerName("Guinness")
                .beerStyle("Malt drink")
                .quantityToBrew(200)
                .upc(211546654L)
                .price(new BigDecimal("1100.00"))
                .build());

            beerRepository.save(Beer.builder()
                .id(UUID.randomUUID())
                .beerName("Guinness Smooth")
                .beerStyle("Malt drink")
                .quantityToBrew(20)
                .upc(451546654L)
                .price(new BigDecimal("650.00"))
                .build());
        }
    }
}
