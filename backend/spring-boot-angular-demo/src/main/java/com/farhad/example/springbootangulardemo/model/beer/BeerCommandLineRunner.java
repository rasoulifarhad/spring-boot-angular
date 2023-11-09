package com.farhad.example.springbootangulardemo.model.beer;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;


@Component
@RequiredArgsConstructor
public class BeerCommandLineRunner implements CommandLineRunner {

	private final BeerREpository beerREpository;
	@Override
	public void run(String... args) throws Exception {
		Stream.of("Kentucky Brunch Brand Stout", "Good Morning", "Very Hazy", "King Julius",
                "Budweiser", "Coors Light", "PBR").forEach(name ->
                beerREpository.save(new Beer(name))
        );
        beerREpository.findAll().forEach(System.out::println);
	}
	
}
