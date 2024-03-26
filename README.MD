# 1일차
- Entity 외래키에 memberId가 아니라 Member객체를 쓰는 이유는 객체로 선언해놓으면 값을 찾은 뒤 member.getName()으로 바로 값을 찾기 때문. memberId인경우 다시 memberId로 find해야한다.