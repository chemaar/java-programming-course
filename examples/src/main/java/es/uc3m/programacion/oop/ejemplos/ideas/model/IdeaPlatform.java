package es.uc3m.programacion.oop.ejemplos.ideas.model;

public class IdeaPlatform {
	
	String name;
	User [] users;
	Topic [] topics;
	Poll [] polls;
	//Since we do not have lists we keep a pointer to the next free position in every array;
	int nextFreeUserPosition = 0;
	int nextFreeTopicPosition = 0;
	int nextFreePollPosition = 0;
	
	public IdeaPlatform(String name){
		this.name = name;
		this.users = new User[PlatformConstants.MAX_NUMBER_OF_USERS];
		this.topics = new Topic[PlatformConstants.MAX_NUMBER_OF_TOPICS];
		this.polls = new Poll[PlatformConstants.MAX_NUMBER_OF_POLLS];
	}

	public boolean addUser(User u){
		if(this.nextFreeUserPosition<this.users.length && u!=null && !existsUser(u)){
			this.users[this.nextFreeUserPosition] = u;
			this.nextFreeUserPosition++;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	public boolean addTopic(Topic t){
		if(this.nextFreeTopicPosition<this.topics.length && t!= null && !existsTopic(t)){
			this.topics[this.nextFreeTopicPosition] = t;
			this.nextFreeTopicPosition++;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	public boolean addPoll(Poll p){
		if(this.nextFreePollPosition<this.polls.length && p!= null && !existsPoll(p)){
			this.polls[this.nextFreePollPosition] = p;
			this.nextFreePollPosition++;
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
	protected boolean existsUser(User u){
		boolean exists = Boolean.FALSE;
		if(u!=null){
			int i = 0;
			while(!exists && i<this.users.length){
				exists = u.equals(users[i]);
				i++;
			}
		}
		return exists;
	}
	
	protected boolean existsTopic(Topic t){
		boolean exists = Boolean.FALSE;
		if(t!=null){
			int i = 0;
			while(!exists && i<this.topics.length){
				exists = t.equals(topics[i]);
				i++;
			}
		}
		return exists;
	}
	
	protected boolean existsPoll(Poll p){
		boolean exists = Boolean.FALSE;
		if(p!=null){
			int i = 0;
			while(!exists && i<this.polls.length){
				exists = p.equals(polls[i]);
				i++;
			}
		}
		return exists;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User[] getUsers() {
		return users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}

	public Topic[] getTopics() {
		return topics;
	}

	public void setTopics(Topic[] topics) {
		this.topics = topics;
	}

	public Poll[] getPolls() {
		return polls;
	}

	public void setPolls(Poll[] polls) {
		this.polls = polls;
	}
	
	
}
