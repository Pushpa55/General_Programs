package com.sritech.clone.com;

public class Test implements Cloneable {
        private int userID;
        private String userName;
        public Test()
        {
        	userID=0;
        	userName=null;
        }
        public Test(int userID,String userName)
        {
        	this.userID=userID;
        	this.userName=userName;
        }
		public int getUserID() {
			return userID;
		}
		public void setUserID(int userID) {
			this.userID = userID;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		@Override
		public String toString() {
			return userID +"\t"+userName;
		}
        
}
