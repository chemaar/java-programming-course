package es.uc3m.programacion.oop.ejemplos.ideas.main;

import java.util.GregorianCalendar;

import es.uc3m.programacion.oop.ejemplos.ideas.model.*;



public class IdeaScaleMain {

	public static void main(String []args){
		//Create the platform...
		IdeaPlatform ideaScale = new IdeaPlatform("IdeaScale");
		User nasa = new Company("nasa@nasa.us","NASA","AAA-BBB-111");
		User lebron = new Person("lebron@cavaliers.com","Lebron","The Chosen One");
		ideaScale.addUser(nasa);
		ideaScale.addUser(lebron);
		Topic t = new Topic("Technology", "This topic is about technology.");
		ideaScale.addTopic(t);
		Poll p = new Poll("Technology & capabilities for exploration of Mars", "A new poll...", 
				nasa, 
				GregorianCalendar.getInstance().getTime(), 
				GregorianCalendar.getInstance().getTime(),t);
		ideaScale.addPoll(p);
		
		Idea idea1 = new Idea("Oxygen", 
				"Are we developing a air compressor which can divide O2 from the rest "
				+ "of atmosphere at least we dont have to cary O2 for the time the "
				+ "crew stands on mars", lebron);
		
		Idea idea2 = new Idea("What are Curisoity's wheels made of?",
				"Curiosity has \"cleats\" "
				+ "on its aluminum wheels supported by titanium springs,"
				+ " but what are the surface of the cleats made of? "
				+ "NASA websites describe it as a \"high traction\" material "
				+ "but what exactly is it made of?", nasa);
		
	
		Vote vote = new Vote(Boolean.TRUE, lebron);
		Vote vote1 = new Vote(Boolean.TRUE, nasa);
		idea1.addVote(vote);
		idea1.addVote(vote1);
		
		p.addIdea(idea1);
		p.addIdea(idea2);

		//Show users...
		System.out.println("The platform: "+ideaScale.getName()+" has the following users...");
		for(User user:ideaScale.getUsers()){
			if(user!=null){
				System.out.println("\t"+user);
			}
		}

		System.out.println("The platform: "+ideaScale.getName()+" has the following topics...");
		//Show topics...
		for(Topic topic:ideaScale.getTopics()){
			if(topic !=null){
				System.out.println("\t"+topic);	
			}

		}

		System.out.println("The platform: "+ideaScale.getName()+" has the following polls...");
		
		//Show polls...
		for(Poll poll:ideaScale.getPolls()){
			if(poll!=null){
				System.out.println("\t"+poll);
				System.out.println("\t\t The Best Idea is:");
				System.out.println("\t\t\t"+poll.selectBestIdea());
			}

		}
	}
}
