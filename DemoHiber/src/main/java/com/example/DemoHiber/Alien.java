package com.example.DemoHiber;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

//import jakarta.persistence.Cacheable;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.Table;
//import jakarta.persistence.Transient;

//1)class name, 2)Entity name, 3)Table name=>Here 3 different layers
//@Entity(name="alien_table")//Entity+Table name in db, would be alien_table

//@Entity
//@Table(name="alien_table")//Table is derived from Entity(Only Table would be named not Entity)
//@Cacheable

@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
@Entity
public class Alien {
	
	@Id
	private int Aid; //primary key
	
	//@Column(name="alien_name")
	private String Aname;
	
	//@Transient           //it won't store the column in db as we have made it transient
	//@Column(name="alien_color")
	private String Acolour;
	
	//@Column(name="alien_address")
	//private Address address;

	//@Column(name="laptops")
	//by default fetch type is Lazy, so two queries are fired at different times=>one for fetching Alien then for Laptops
	//@OneToMany(mappedBy="alien", fetch=FetchType.EAGER)//if eager only 1 query is fired with left outer join
	//private List<Laptop> laptos = new ArrayList<>();
	
	public Alien() {
		
	}

	public Alien(int aid, String aname, String acolour, List<Laptop> laptos) {
		super();
		Aid = aid;
		Aname = aname;
		Acolour = acolour;
		//this.laptos = laptos;
	}

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}

	public String getAcolour() {
		return Acolour;
	}

	public void setAcolour(String acolour) {
		Acolour = acolour;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}


//	public List<Laptop> getLaptos() {
//		return laptos;
//	}
//
//
//	public void setLaptos(List<Laptop> laptos) {
//		this.laptos = laptos;
//	}


	@Override
	public String toString() {
		return "Alien [Aid=" + Aid + ", Aname=" + Aname + ", Acolour=" + Acolour +"]";
	}
}
