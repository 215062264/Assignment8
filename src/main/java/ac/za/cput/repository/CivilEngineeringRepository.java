package ac.za.cput.repository;

import ac.za.cput.domain.schoolSubjects.CivilEngineering;

import java.util.Set;

public interface CivilEngineeringRepository extends IRepository<CivilEngineering, String> {
    Set<CivilEngineering> getAll();

}