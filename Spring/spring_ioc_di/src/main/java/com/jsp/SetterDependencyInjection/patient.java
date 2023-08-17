package com.jsp.SetterDependencyInjection;

public class patient {
Doctor doctor;

public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}
public void run() {
	doctor.call();
}

}
