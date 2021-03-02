package com.cg.empmgt.dao;
import com.cg.empmgt.entities.Employee;
import java.util.Map;
import java.util.HashMap;

	public class StoreHolder {
		private StoreHolder() {}
		public static Map<Integer,Employee>store=new HashMap<>();

		
}
