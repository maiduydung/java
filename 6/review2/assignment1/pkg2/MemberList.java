package assignment1.pkg2;
import assignment1.pkg1.Member;
import java.util.List;
import java.util.ArrayList;
// import java.util.Map;
// import java.util.HashMap;

public class MemberList {
    private final List<Member> list;
    public MemberList(){
        this.list = new ArrayList<Member>();
    }

    public void add(Member member){
        list.add(member);
    }

    public Member get(int i){
        return list.get(i);
    }

    public void remove(Member member){
        list.remove(member);
    }

    public int count(){
        return list.size();
    }
}
