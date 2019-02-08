package com.dts.cinema_demo.Repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseReponsitory {
    @PersistenceContext
    protected EntityManager entityManager;
}
