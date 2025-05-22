package com.ccstudent.gcccusuarioservice.feign;

import com.ccstudent.gcccusuarioservice.dto.LibroDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "gccc-libro-service", path = "/libros")
public interface LibroFeign {

    @GetMapping("/{id}")
    @CircuitBreaker(name = "clientByIdCB", fallbackMethod = "libroListarPorIdCB")
    ResponseEntity<LibroDto> buscarLibro(@PathVariable("id") Integer id);

    // Método default para el fallback del CircuitBreaker
    default ResponseEntity<LibroDto> libroListarPorIdCB(Integer id, Throwable e) {
        LibroDto libroFallback = new LibroDto();
        libroFallback.setNombre("Servicio no disponible de cliente");
        return ResponseEntity.ok(libroFallback);
    }
}
