package com.java.oa.domain;

import java.io.Serializable;

public class Person implements Serializable{
		private Long pid;
		private String name;
		/**
		 * @return the pid
		 */
		public Long getPid() {
			return pid;
		}
		/**
		 * @param pid the pid to set
		 */
		public void setPid(Long pid) {
			this.pid = pid;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		
		
}
