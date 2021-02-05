package board.member;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

//dao interface => mapper interface
public interface MemberMapper {
	void addMember(Member m);
	Member getMember(String id);
	ArrayList<Member> getMembers();
	void editMember(Member m);
	void delMember(String id);
}
