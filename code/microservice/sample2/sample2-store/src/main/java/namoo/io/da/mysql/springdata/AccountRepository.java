package namoo.io.da.mysql.springdata;


import org.springframework.data.jpa.repository.JpaRepository;

import namoo.io.da.mysql.document.AccountDoc;

public interface AccountRepository extends JpaRepository<AccountDoc, String>{
}
