package com.question_4;

public class Laptop {
private	String color;
private	String companyName;
private	String name;
private	String purpose;
private	CPU cpu;
private	GraphicCard graphicCard;
public void	displayDetails(){
		
	}

public Laptop() {
	// TODO Auto-generated constructor stub
}

public Laptop(String color, String companyName, String name, String purpose, CPU cpu, GraphicCard graphicCard) {
	super();
	this.color = color;
	this.companyName = companyName;
	this.name = name;
	this.purpose = purpose;
	this.cpu = cpu;
	this.graphicCard = graphicCard;
}

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPurpose() {
	return purpose;
}
public void setPurpose(String purpose) {
	this.purpose = purpose;
}
public CPU getCpu() {
	return cpu;
}
public void setCpu(CPU cpu) {
	this.cpu = cpu;
}
public GraphicCard getGraphicCard() {
	return graphicCard;
}
public void setGraphicCard(GraphicCard graphicCard) {
	this.graphicCard = graphicCard;
}

}
