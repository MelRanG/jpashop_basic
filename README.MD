# 1
- Entity 외래키에 memberId가 아니라 Member객체를 쓰는 이유는 객체로 선언해놓으면 값을 찾은 뒤 member.getName()으로 바로 값을 찾기 때문. memberId인경우 다시 memberId로 find해야한다.
- hibername.dialect 설정은 DB에 맞는 방언을 설정하는 부분이다. h2, mysql, oracle등 DB에 맞춰서 사용한다.
- EntityManager는 한 쓰레드에서만 사용해야한다.(공유 X)
- __JPA의 모든 데이터 변경은 트랜잭션 안에서__ 실행해야함.
# 2
- 영속성 전이와 Cascade