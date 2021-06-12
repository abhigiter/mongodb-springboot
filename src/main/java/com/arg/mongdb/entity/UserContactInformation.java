package com.arg.mongdb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user_contact")
public class UserContactInformation {

	 
		@Id
	    private Integer id;
	    private String mobile;
	    
	 	public UserContactInformation(int i, String string) {
	 		this.id= i ;
	 		this.mobile = string;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
	 	
	 	
}
