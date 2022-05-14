package fileIOBasic;

import java.io.Serializable;

public class Employee implements Serializable {
int id;
String name;
public Employee() {
	
}
public Employee(int id,String name) {
	this.id=id;
	this.name=name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}

}
