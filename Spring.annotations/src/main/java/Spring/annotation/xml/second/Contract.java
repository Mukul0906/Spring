package Spring.annotation.xml.second;

import org.springframework.stereotype.Component;

@Component

public class Contract implements Employee {
	public void knowInfor() {
		System.out.println("He is a contract employee");
	}

}
