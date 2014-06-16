package allcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import services.Logger2;

public class InitializeSystem {

	public static SiteManager init(String superAdminName, String password, String email){
		
		DataBaseInit.initialize();
		
		Password.setQuestions();
		
		SiteManager sm= new SiteManager(superAdminName, password, email);
		SuperAdminConnection c=sm.openSuperAdminConnection();
		
		Logger2.initLogSystem();
		Logger2.initLogUser();

		c.addNewForum("food", "");
		c.addNewForum("sport", "");
		c.addNewForum("judaism", "the right way to go");
		
		
		UserConnection uc=sm.openNewConnection();
		UserConnection uc2=sm.openNewConnection();
		
		List<Forum> forums=(List<Forum>) uc.getForums().getMe();
		
		Forum f=forums.get(0);
		f.createSubForum("tomato1", "red");
		f.createSubForum("tomato2", "red");
		f.createSubForum("tomato3", "red");
		f.createSubForum("tomato4", "red");

		f=forums.get(1);
		f.createSubForum("ping pong1", "white");
		f.createSubForum("ping pong2", "white");
		f.createSubForum("ping pong3", "white");
		f.createSubForum("ping pong4", "white");
		
		uc.enterForum(f.get_forumName());
		uc.registerToForum("oriya", "oriya", "oriya1989@walla.com","is it works?", "no");
		uc.enterSubforum("ping pong1");
		uc.login("oriya", "oriya");
		uc.writePost("First post", "Hibernate: delete from old_passwords where memberID=? Hibernate: insert into all_posts (subForum_index, _index, _allPosts_post_index) values (?, ?, ?) Hibernate: insert into responds (original_post_index,");
		uc.writePost("Second post", "Hibernate: update subForum set description=?, father_forum=?, deleteLastModerator=?, deleteMessageAdmin=?, deleteMessageModerator=?, d");
		uc.writePost("Thired post", "Hibernate: select post_.post_index, post_.post_content as post_con2_3_, post_.member_id as member_i4_3_, post_.root_post as root_pos5_3_, post_.post_title as post_tit3_3_ from Post post_ where post_.post_index=?");
		uc.writePost("Fourth post", "oriya check our project 4th time");
		
		uc.exitForum();
		
		
		
		uc2.enterForum(f.get_forumName());
		uc2.registerToForum("Eran", "1234", "eacountz@walla.co.il", "old question method", "cat");
		uc2.enterSubforum("ping pong1");
		uc2.login("Eran", "1234");
		uc2.writePost("My first post", "Eran checks our web project inaal dinak");
		uc2.writePost("My second post", "Eran checks our web project 2nd post");
		uc2.enterPost(0);
		uc2.writeResponsePost("First response", "Hibernate: select post_.post_index, post_.post_content as post_con2_3_, post_.member_id as member_i4_3_, post_.root_post as root_pos5_3_, post_.post_title as post_tit3_3_ from Post post_ where post_.post_index=");
		uc2.writeResponsePost("2nd response", "Checking if the responses are showed well in the web applet");
		uc2.writeResponsePost("3nd response", "Hibernate connection pool size: 1 (min=1) 16, 2014 5:54:38 PM com.microsoft.sqlserver.jdbc.AuthenticationJNI <clinit>");
		uc2.exitForum();
		
		sm.closeConnection(uc2.getID());
		sm.closeConnection(uc.getID());
		sm.closeConnection(c.getID());
		return sm;
	}	
}

