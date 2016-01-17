package com.qualifier;

import javax.enterprise.inject.Produces;
 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Resources {
	 @SuppressWarnings("unused")
	 @PersistenceContext
	 @Produces
	 private EntityManager em;
}
