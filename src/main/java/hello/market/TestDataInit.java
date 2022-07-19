package hello.market;

import hello.market.domain.item.Item;
import hello.market.domain.item.ItemRepository;
import hello.market.domain.member.Member;
import hello.market.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestDataInit {

    private final ItemRepository itemRepository;
    private final MemberRepository memberRepository;

    @PostConstruct
    public void init() {
        itemRepository.save(new Item("itemA", 20000, 1));
        itemRepository.save(new Item("itemB", 30000, 2));

        Member member = new Member();
        member.setLoginId("test");
        member.setPassword("test!");
        member.setName("유저A");

        memberRepository.save(member);
    }

}
