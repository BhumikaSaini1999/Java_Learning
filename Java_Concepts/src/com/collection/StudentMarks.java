package com.collection;

import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks>{
	private int maths;
	private int physics;
	
	
	public StudentMarks(int maths, int physics) {
		super();
		this.maths = maths;
		this.physics = physics;
	}


	public int getMaths() {
		return maths;
	}


	public int getPhysics() {
		return physics;
	}


	@Override
	public String toString() {
		return "StudentMarks [maths=" + maths + ", physics=" + physics + "]";
	}


	public int compareTo(StudentMarks obj) {
		// TODO Auto-generated method stub
//		if(this.getMaths() < obj.getMaths())
//			return -1;
//		else if(this.getMaths() > obj.getMaths())
//			return 1;
//		else
//		    return 0;
		
		//return this.maths - obj.maths;
		return obj.maths - this.maths;
	}


	@Override
	public int hashCode() {
		return Objects.hash(maths, physics);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentMarks other = (StudentMarks) obj;
		return maths == other.maths && physics == other.physics;
	}
	
	
}
