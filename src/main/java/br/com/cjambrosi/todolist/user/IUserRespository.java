package br.com.cjambrosi.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRespository extends JpaRepository<UserModel, UUID> {
  UserModel findByUsername(String username);
}
