package namoo.nara.da.mysql.springdata;


import org.springframework.data.jpa.repository.JpaRepository;

import namoo.nara.da.mysql.document.UserDoc;

public interface UserRepository extends JpaRepository<UserDoc, Long>{
}
