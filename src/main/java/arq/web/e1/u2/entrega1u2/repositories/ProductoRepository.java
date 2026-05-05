package arq.web.e1.u2.entrega1u2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import arq.web.e1.u2.entrega1u2.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, String>{
    
}
