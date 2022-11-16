package tn.esprit.gestionachat.Generic;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IGenericService<T,ID>{
        public List<T> retrieveAll();

        public T add (T entity);

        public T update (T entity);

        public T retrieveById (ID id);

        public void remove(ID id);
}
