package ai.ineuron.JpaAssignment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
@Data
public class StudentEntity {
	@Id
	@Column(name = "sid")
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(name = "sname")
	private String name;
	@Column(name = "age")
	private int age;

}
