package com.git.velocity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class NewGit {

	public static void main(String[] args) {
		{
			
			ArrayList<String> annimation_teachers_list = new ArrayList<>();
			
			annimation_teachers_list.add("Shetty");
			annimation_teachers_list.add("Talwar");
			annimation_teachers_list.add("Bhosle");
			annimation_teachers_list.add("sonawane");
			
			ArrayList<String> web_teachers_list = new ArrayList<>();
			
			web_teachers_list.add("Shinde");
			web_teachers_list.add("Ingle");
			web_teachers_list.add("Pisal");
			web_teachers_list.add("sonar");
			
			ArrayList<String> AI_teacher_list = new ArrayList<>();
			
			AI_teacher_list.add("Chamle");
			AI_teacher_list.add("Kasle");
			AI_teacher_list.add("Dounkar");
			AI_teacher_list.add("patil");
			
			HashMap<String, ArrayList<String>> Department = new HashMap<>();
			
			Department.put("Annimation", annimation_teachers_list);
			Department.put("Web",  web_teachers_list);
			Department.put("AI",AI_teacher_list );
			
			
			
			HashMap<String, HashMap<String, ArrayList<String>>> collage = new HashMap<>();
			collage.put("Rammayya Collage", Department);
			
			Set<String> collkey = collage.keySet();
			
			Iterator<String> itr = collkey.iterator();
			
			for(String str : collkey)
			{
				System.out.println("Collage" + str);
			}
			
		Set<String> depkey = Department.keySet();
			
			Iterator<String> itr2 = depkey.iterator();
			
			while(itr2.hasNext())
			{
				String next2=itr2.next();
				System.out.println("Department  :"  + next2);
				System.out.println("Teacher Name  :"  + Department.get(next2));
			
			}
			
		}
			
		}

	}


