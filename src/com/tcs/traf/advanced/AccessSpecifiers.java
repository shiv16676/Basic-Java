package com.tcs.traf.advanced;

public class AccessSpecifiers {
		
		/* There are four types of Access Specifiers
		 * 1. private :-  accessed only within same class
		 * 2. public :-   accessed from anywhere
		 * 3. protected:- accessed from any subclass and same package
		 * 4. default:-   same package only.
		 * This all access specifiers applies to the instance variables and not to the classes
		 * */
		
		private String name;
		public int ID;
		protected String type;
		boolean manageable;
		
		//constructor
		public AccessSpecifiers(){
			this.name ="Shiv";
			this.ID =11;
			this.type = "Disciplined";
			this.manageable = true;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public boolean isManageable() {
			return manageable;
		}

		public void setManageable(boolean manageable) {
			this.manageable = manageable;
		}		
}
