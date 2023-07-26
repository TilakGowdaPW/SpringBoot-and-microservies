package ai.ineuron.JpaAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaRunner implements CommandLineRunner {

	@Autowired
	Repo repo;

	@Override
	public void run(String... args) throws Exception {
//		StudentEntity entity = new StudentEntity();
//		entity.setName("Kumar");
//		entity.setAge(20);
//		repo.save(entity);

		repo.deleteById(2);

	}
}
