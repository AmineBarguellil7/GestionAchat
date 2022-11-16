package tn.esprit.gestionachat.service;

import org.springframework.stereotype.Service;
import tn.esprit.gestionachat.Generic.IGenericServiceImpl;
import tn.esprit.gestionachat.entities.DetailFacture;

@Service
public class DetailFactureService extends IGenericServiceImpl<DetailFacture,Long> implements IDetailFactureService{
}
