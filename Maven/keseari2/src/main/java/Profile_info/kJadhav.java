package Profile_info;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class kJadhav {
	@Value("${fname}")
	private String firdtname;
	@Value("${lname}")
	private String lastname;
	@Value("${form}")
	private String form;
	@Value("${team}")
	private String team;
	@Value("${age}")
	private Integer age;

	public String getFirdtname() {
		return firdtname;
	}

	public void setFirdtname(String firdtname) {
		this.firdtname = firdtname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public Integer getTeam() {
		return team;
	}

	public void setTeam(Integer team) {
		this.team = team;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@PostConstruct
	public void init() {
		System.out.println("I am int methord");
	}

	@PreDestroy
	public void deleatall() {
		System.out.println("I am deleat all methord");
	}

	@Override
	public String toString() {
		return "kJadhav [firdtname=" + firdtname + ", lastname=" + lastname + ", form=" + form + ", team=" + team
				+ ", age=" + age + "]";
	}

}
