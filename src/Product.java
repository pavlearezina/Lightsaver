public class Product{
	
	//Constructor
	public Product(String ID,String partner,String brand,String name,String number,String use,String site,String technology, String type,String output,String input,String atSource,String outFixture,String temperature, String colorQuality,String life,String sources,String features,String dateAvailable,String dateCertified,String markets){
		ID(ID);
		life(life);
		partner(partner);
		brand(brand);
		name(name);
		number(number);
		use(use);
		site(site);
		technology(technology);
		type(type);
		output(output);
		input(input);
		atSource(atSource);
		outFixture(outFixture);
		temperature(temperature);
		colorQuality(colorQuality);
		sources(sources);
		features(features);
		dateAvailable(dateAvailable);
		dateCertified(dateCertified);
		markets(markets);
	}

	//Private variables of each product:
	private String ID;
	private String partner;
	private String brand;
	private String name;
	private String number;
	private String use;
	private String site;
	private String technology;
	private String type;
	private String output;
	private String input;
	private String atSource;
	private String outFixture;
	private String temperature;
	private String colorQuality;
	private String life;
	private String sources;
	private String features;
	private String dateAvailable;
	private String dateCertified;
	private String markets;

	//Setters: (Measuring units added when applicable)
	private void ID(String ID){
		this.ID=ID;
	}

	private void partner(String partner){
		this.partner=partner;
	}

	private void brand(String brand){
		this.brand=brand;
	}

	private void name(String name){
		this.name=name;
	}

	private void number(String number){
		this.number=number;
	}

	private void use(String use){
		this.use=use;
	}

	private void site(String site){
		this.site=site;
	}

	private void technology(String technology){
		this.technology=technology;
	}

	private void type(String type){
		this.type=type;
	}

	private void output(String output){
		this.output=output;
		if(!output.equals("N/A")) this.output+=" lumens"; //Checks if it is appropriate to add units
	}

	private void input(String input){
		this.input=input;
		if(!input.equals("N/A")) this.input+=" Watt";
	}

	private void atSource(String atSource){
		this.atSource=atSource;
		if(!atSource.equals("N/A")) this.atSource+=" lumens/Watt";
	}

	private void outFixture(String outFixture){
		this.outFixture=outFixture;
		if(!outFixture.equals("N/A")) this.outFixture+=" lumens/Watt";
	}

	private void temperature(String temperature){
		this.temperature=temperature;
		if(!temperature.equals("N/A")) this.temperature+=" K";
	}

	private void colorQuality(String colorQuality){
		this.colorQuality=colorQuality;
		if(!colorQuality.equals("N/A")) this.colorQuality+=" CRI";
	}

	private void life(String life){
		this.life=life;
		if(!life.equals("N/A")) this.life+=" hours";
	}

	private void sources(String sources){
		this.sources=sources;
	}

	private void features(String features){
		this.features=features;
	}

	private void dateAvailable(String dateAvailable){
		this.dateAvailable=dateAvailable;
	}

	private void dateCertified(String dateCertified){
		this.dateCertified=dateCertified;
	}

	private void markets(String markets){
		this.markets=markets;
	}

	//Getters:
	public String ID(){
		return ID;
	}

	public String partner(){
		return partner;
	}

	public String brand(){
		return brand;
	}

	public String name(){
		return name;
	}

	public String number(){
		return number;
	}

	public String use(){
		return use;
	}

	public String site(){
		return site;
	}

	public String technology(){
		return technology;
	}

	public String type(){
		return type;
	}

	public String output(){
		return output;
	}

	public String input(){
		return input;
	}

	public String atSource(){
		return atSource;
	}

	public String outFixture(){
		return outFixture;
	}

	public String temperature(){
		return temperature;
	}

	public String colorQuality(){
		return colorQuality;
	}

	public String life(){
		return life;
	}

	public String sources(){
		return sources;
	}

	public String features(){
		return features;
	}

	public String dateAvailable(){
		return dateAvailable;
	}

	public String dateCertified(){
		return dateCertified;
	}

	public String markets(){
		return markets;
	}

	//Formats the information nicely for any printing command
	public String toString(){
		String string="Energy Star Unique ID: "+ID+"\n\nEnergy Star Partner: "+partner+"\n\nBrand Name: "+brand+
				"\n\nModel Name: "+name+"\n\nModel Number: "+number+"\n\nRecommended Use: "+use+"\n\nRecommended Site: "+site+
				"\n\nTechnology Used: "+technology+"\n\nFixture Type: "+type+"\n\nTotal Light Output: "+output+
				"\n\nTotal Input Power: "+input+"\n\nEnergy Efficiency- Measured At The Source: "+atSource+
				"\n\nEnergy Efficiency- Measured Outside The Fixture: "+outFixture+"\n\nColor Temperature: "+temperature+
				"\n\nColor Quality: "+colorQuality+"\n\nLight Source Life: "+life+"\n\nLight Sources: "+sources+
				"\n\nAdditional Information: "+features+"\n\nRelease Date: "+dateAvailable+"\n\nCertification Date: "+dateCertified+
				"\n\nMarket(s): "+markets;
		return string;
	}
}