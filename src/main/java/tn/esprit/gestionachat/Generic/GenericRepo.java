package tn.esprit.gestionachat.Generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepo<T,ID> extends JpaRepository<T,ID> {
}
