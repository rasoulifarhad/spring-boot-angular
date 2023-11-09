package com.farhad.example.springbootangulardemo.model.beer;

import static java.util.stream.Collectors.toList;

import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BeerController {
	
	private final BeerREpository beerREpository;

	@GetMapping("/good-beers")
	@CrossOrigin(origins = "http://localhost:4200")
	public Collection<Beer> goodBeers() {
		return beerREpository.findAll().stream()
					.filter(this::isGreat)
					.collect(toList());
	}

	private boolean isGreat(Beer beer) {
        return !beer.getName().equals("Budweiser") &&
                !beer.getName().equals("Coors Light") &&
                !beer.getName().equals("PBR");
    }
}
