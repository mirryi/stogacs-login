package net.edt.persistence.repository;

import net.edt.persistence.domain.SignInSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignInSessionRepository extends JpaRepository<SignInSession, String> {



}
