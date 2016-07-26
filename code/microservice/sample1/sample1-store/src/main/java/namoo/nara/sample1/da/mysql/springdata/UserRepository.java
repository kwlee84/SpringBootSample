package namoo.nara.sample1.da.mysql.springdata;


import org.springframework.data.jpa.repository.JpaRepository;

import namoo.nara.sample1.da.mysql.document.UserDoc;


public interface UserRepository extends JpaRepository<UserDoc, String>{
}
