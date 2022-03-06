package rateexes.webapi.Data.Repositories.Contracts;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import rateexes.webapi.Data.Entities.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Long> {}
