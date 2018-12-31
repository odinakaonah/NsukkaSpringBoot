package nsk.cath.com.nsukka.repo.contact;

import nsk.cath.com.nsukka.model.contact.Deanery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface DeaneryRepo extends JpaRepository<Deanery,Long> {
    @Query("select d from Deanery c where c.name =:name")
    Deanery findByName(@Param("name") String name);

    @Query("select d from Deanery d where d.deaneryCode =:deaneryCode")
    Deanery findByDeaneryCode(@Param("deaneryCode") String deaneryCode);

    @Query("select d from Deanery d where d.deaneryCode =:diocese")
    Page<Deanery> findAllByDiocese(@Param("diocese") Long diocese, Pageable pageable);

    @Query("select d from Deanery d where d.deaneryCode =:diocese")
    List<Deanery> findAllByDiocese(@Param("diocese") Long diocese);

}