
enum Services {
	xray, diagnosis, bloodtest, ecg, vaccine;
	
	public String getname(){
		return name().equals("xray")?"x-ray":name();
	}
}
