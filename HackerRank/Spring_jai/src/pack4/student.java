package pack4;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import pack3.Address;

public class student {
	String name;
	Integer rollNumber;
	List<Integer> marks;
	List<address> adr;
	Set set;
	Map<Integer, String> map;
	Properties p;

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getRollNumber() {
		return rollNumber;
	}



	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}



	public List<Integer> getMarks() {
		return marks;
	}



	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}



	public List<address> getAdr() {
		return adr;
	}



	public void setAdr(List<address> adr) {
		this.adr = adr;
	}



	public Set getSet() {
		return set;
	}



	public void setSet(Set set) {
		this.set = set;
	}



	public Map<Integer, String> getMap() {
		return map;
	}



	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}



	public Properties getP() {
		return p;
	}



	public void setP(Properties p) {
		this.p = p;
	}



	@Override
	public String toString() {
		return "student [name=" + name + ", rollNumber=" + rollNumber + ", marks=" + marks + ", adr=" + adr + ", set="
				+ set + ", map=" + map + ", p=" + p + "]";
	}

}
