package de.slag.fin.tools.persist;

import java.util.Collection;

public interface Persister<T> {
	
	void save(T t);
	
	T loadById();
	
	Collection<Long> selectAllIds();
}
