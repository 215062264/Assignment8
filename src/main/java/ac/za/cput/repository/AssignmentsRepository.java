package ac.za.cput.repository;

import ac.za.cput.Domain.Assignments;
import java.util.Set;

public interface AssignmentsRepository extends IRepository<Assignments, String> {
    Set<Assignments> getAll();

}