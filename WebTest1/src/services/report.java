package services;

public enum report {
	OK,
	NO_FORUM,
	NO_MEMBER,
	NO_SUBFORUM,
	NOT_LOGGED,
	NO_POST,
	
	ALREADY_MEMBER_EXIST,
	ALREADY_EMAIL_EXIST,
	ALREADY_FORUM_EXIST,
	ALREADY_SUBFORUM_EXIST,
	MEMBER_ALREADY_IN_FORUM,
	EMPTY_FIELD,
	NULL_FIELD,
	
	IS_NOT_ADMIN,
	IS_NOT_MODERATOR,
	IS_NOT_SUPERADMIN,
	
	NO_SUCH_SUBFORUM,
	NO_SUCH_USER_NAME,
	NO_SUCH_FORUM,
	NO_SUCH_POST,
	NOT_POST_OWNER,
	
	INVALID_PASSWORD,
	INVALID_ANSWER,
	INVALID_USER_NAME,
	INVALID_EMAIL_PATTERN,
	PASSWORD_ALREADY_BEEN_USED,
	WRONG_PASSWORD_ANSWER,
	NULL_ARGUMENTS,
	NOT_ALLOWED,
	DENIED_BY_POLICY,
	
	FAIL,
	
}
