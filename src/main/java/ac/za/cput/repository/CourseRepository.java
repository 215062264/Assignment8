package ac.za.cput.repository;

import ac.za.cput.Domain.Course;

import java.util.Set;

public interface CourseRepository extends IRepository<Course, String> {
    Set<Course> getAll();
}
