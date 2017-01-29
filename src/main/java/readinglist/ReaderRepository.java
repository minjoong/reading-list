package readinglist;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by minjoong on 2017. 1. 29..
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
