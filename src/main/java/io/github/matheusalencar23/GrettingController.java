package io.github.matheusalencar23;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrettingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/gretting")
	public Gretting gretting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Gretting(counter.incrementAndGet(), String.format(template, name));
	}
}
