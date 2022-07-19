# Market_Project
spring boot &amp; Thymeleaf 를 사용한 market 아이템 추가 및 수정 Project
# 프로젝트 계획이유
### Thymeleaf 를 사용한 project를 만들어 본 적이 없어 project를 만들어보며 정리를 하기 위해 만들게 되었습니다.
### 간단한 상품 추가 및 수정 기능을 만들었고 회원관련 부분은 회원가입 및 로그인 기능을 구현하였습니다. Spring boot 와 Thymeleaf를 사용하여 구현하였으며 Lombok을 사용하여 코드 간결화를 해주었습니다.
------------
# Market Project 기능
1. 비회원 -> 아이템 확인, 로그인, 회원가입
2. 회원 -> 아이템 확인, 아이템 추가 및 수정, 로그아웃
------------
# 주요 기능
-1. Item Add
  - Item 의 이름, 수량, 가격을 입력하여 추가하는 기능
  - Validation을 사용하여 범위 설정
  - Form 객체를 활용하여 상품 추가시 사용하는 범위 설정

-2. Item Update
  - Item의 이름을 수정하는 기능
  - Item의 수량을 수정하는 기능
  - Item의 가격을 수정하는 기능
  - Validation을 사용하여 범위 설정
  - Form 객체를 사용해 UpdateForm으로 수정시 사용하는 범위 설정

-3. Login
  - Validation을 이용한 Login 기능 설정
  - Login 성공시 Session에 회원 정보 저장
  - Login Form을 이용해 Validation 설정

-4. SignUp
  - 회원가입 성공시 전에 들어간 곳으로 redirect
  
-----------------
# Thymeleaf
- Thymeleaf 문법을 사용하여 페이지 구현
 - th:object, th:field를 사용해 코드 단축
 
-----------------
# ASW 배포
ASW EC2를 사용하여 Spring boot 배포하였습니다.
