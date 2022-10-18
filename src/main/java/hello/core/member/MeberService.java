package hello.core.member;

public interface MeberService {
  void join(Member member);
  Member findMember(Long memberId);
}
