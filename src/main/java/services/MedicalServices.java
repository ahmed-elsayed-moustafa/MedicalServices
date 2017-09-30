package services;

public enum MedicalServices {
	XRAY, DIAGNOSIS, BLOODTEST, ECG, VACCINE;

	public String getName() {
		return name().toLowerCase().equals("xray") ? "x-ray" : name().toLowerCase();
	}
}
