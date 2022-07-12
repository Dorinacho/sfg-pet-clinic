package services;

import model.Owner;
import org.springframework.context.annotation.Bean;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
