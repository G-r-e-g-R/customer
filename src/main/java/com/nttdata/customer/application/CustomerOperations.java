package com.nttdata.customer.application;

import com.nttdata.customer.domain.Customer;
import com.nttdata.customer.infraestructure.model.dao.CustomerDao;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * CUSTOMEROPERATIONS.
 * Define las operaciones (CRUD) del Cliente (Customer).
 */

public interface CustomerOperations {
    /**
     * Creación de un cliente.
     * @param customer Cliente.
     * @return Mono<Customer>
     */
    Mono<Customer> create(Customer customer);

    /**
     * Actualización de datos del cliente.
     * @param id Codigo de cliente.
     * @param customer Cliente.
     * @return Mono<Customer>
     */
    Mono<Customer> update(String id, Customer customer);

    /**
     * Eliminación de un cliente.
     * @param id Codigo de cliente.
     * @return Mono<CustomerDao>
     */
    Mono<Void> delete(String id);

    /**
     * Busqueda por Id de cliente.
     * @param id Codigo de cliente.
     * @return Mono<Customer>
     */
    Mono<Customer> findById(String id);

    /**
     * Búsqueda de todos los clientes.
     * @return Flux<Customer>
     */
    Flux<Customer> findAll();
}
