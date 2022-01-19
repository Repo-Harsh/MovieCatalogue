package io.javabrains.moviecatalogservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.moviecatalogservice.modal.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
	
	@Autowired
	CatalogService catalogServie;
	/**
	 * https://github.com/koushikkothagal/spring-boot-microservices-workshop
	 * @param userId
	 * @return
	 */
	@GetMapping("/{userId}")
	public List<CatalogItem> fetchCatalogByUserId(@PathVariable String userId) {
		return catalogServie.connectToMovieInfo(userId);
		
	}

}
