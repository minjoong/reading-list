package readinglist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by minjoong on 2017. 1. 26..
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(Reader reader);
}
