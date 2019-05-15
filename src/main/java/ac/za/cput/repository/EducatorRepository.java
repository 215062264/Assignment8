package ac.za.cput.repository;

import ac.za.cput.domain.people.Educator;
import java.util.Set;

public interface EducatorRepository extends IRepository<Educator, String> {
    Set<Educator> getAll();

}
