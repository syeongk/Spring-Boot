# Spring Boot

## 1. 스프링 MVC
### 스프링 MVC 아키텍처
![2023  12  5  - 205](https://github.com/user-attachments/assets/5da48028-60b4-488c-905c-b94378546a6a)


## 2. 스프링 MVC - 웹 앱 구현
### 동적 뷰
- HTTP 요청 매개변수 <br>
  - /home?key=value
  - @RequestParam
- HTTP 요청 헤더
- 경로 변수
  - /home/red
  - @PathVariable
- HTTP 요청 본문

### HTTP 메소드
- GET
- POST
- PUT
- PATCH
- DELETE


## 3. 웹 스코프
### @RequestScope
요청 스코프 : HTTP 요청마다 동일한 클래스의 새로운 인스턴스를 생성한다.

### @SessionScope
세션 스코프 : 각 사용자는 고유한 세션을 가지며, HTTP 세션 당 동일한 인스턴스를 얻는다.
- 동시성 문제

### @ApplicationScope
애플리케이션 스코프 : 모든 클라이언트 요청이 애플리케이션 스코프 빈을 공유한다.
