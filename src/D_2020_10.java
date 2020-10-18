
public class D_2020_10 {

	
	/*
	 * ---------------------------------- 개발일지 ----------------------------------
	 * 
	 * 2020년 10월
	 * 
	 *  10-09 금
	 *  
	 *  * 개인 공부
	 *  * JAVA
	 *  - 개발일지 등록시작
	 *  - spring handler와 interceptor개념 및 웹소켓 공부
	 * 
	 * 	* 파이널 프로젝트(학원)
	 *  - 학원 파이널 프로젝트 회웝가입,아이디 비번 찾기 화면 수정
	 * 
	 *___________________________________________________________________________
	 *
	 *	10-10 토
	 *	
	 *	* 개인 공부
	 *	* JAVA
	 *	- spring-websocket을 활용한 소켓통신 공부
	 *	- 결과 정리
	 *	1. HttpSession과 WebSocketSession은 다른것
	 *	2. HttpSession의 아이디값으로 채팅기능을 구현하기 위해선 WebSocketSession과의 연결점이 필요함
	 *	3. JSP에 session=false 잘보자 이 것 때문에 하루 날렸다.(왜 세션값을 못받아오는지  ㅋㅎㅋㅎ)
	 *	
	 *	- 추후 예정
	 *	1. interceptor를 통한 세션 가로채기로 아이디값 가져와서 채팅에 사용자 아이디 넣어 채팅 구현하기
	 *	2. Spring - pojo, DTO, Porxy, shcema, spirng-context-support 공부
	 *	
	 * ___________________________________________________________________________
	 * 
	 * 10-11 일
	 * 
	 * 휴식
	 * 
	 * ___________________________________________________________________________
	 * 
	 * 10-12 월
	 * 
	 * * 개인 공부
	 * 
	 * * 파이널 프로젝트(학원)
	 * - HTML 종합 정리
	 * - DB설계 
	 * - 기능 분담
	 * 		
	 * ___________________________________________________________________________
	 * 
	 * 10-13 화
	 * * 개인공부
	 * - 스키마(shcema)의 정의:
	 * 		1. DB의 구조와 제약조건에 관한 전반적인 명세를 기술한 메타데이터
	 * 		2. DB를 구성하는 개체(Entity), 속성(Attribute), 관계(Relationship)
	 * 		       및 데이터 조작 시 데이터 값들이 갖는 제약조건등에 관해 전반적으로 정의함
	 * 		3. 관점에 따라 외부,개념,내부 스키마로 나뉨
	 * 
	 * * 파이널 프로젝트(학원)
	 * - DB구상중 HTML 구현 안된부분이 있어 구현중
	 * 
	 * 일지를 작성하고 커밋을 안했다. 집중하자....
	 * 
	 * ___________________________________________________________________________
	 * 
	 * 10-14 수
	 * * 개인공부
	 * - Pojo(Plain Old Java Object)의 정의:
	 * 		1. 마틴 파울러가 EJB보다 단순한 자바 오브젝트에 도메인 로직을 넣어 사용하는 것이 여러가지 장점이 있는데 
	 * 		   사용하지 않는 것에 대해 이름이 없어서라 생각하여 pojo라고 이름을 붙임
	 * 		2. 구글링을 하면 정의는 단순하게 getter/setter를 가진 단순한 자바 오브젝트(Bean)라 함
	 * 		3. 특징
	 * 			- 클래스 상속을 강제하지 않는다.
	 * 			- 인터페이스 구현을 강제하지 않는다.
	 * 			- 어노테이션 사용을 강제하지 않는다.
	 * 			- 이러한 제약들이 없는 일반적인 객체를 말함
	 * 
	 * * 파이널 프로젝트(학원)
	 * - HTML 끝
	 * - DB설계 끝
	 * ___________________________________________________________________________
	 * 
	 * 10-15 목
	 * * 개인공부
	 * - 실시간 채팅: 
	 * 		1. spring 웹소켓을 사용하여 실시간 채팅 만듬
	 * 		2. HttpSession이랑 WebsocketSession이랑 Map객체를 사용하여 연동시켜서 메세지 출력시
	 * 		   httpSession값 사용할 수 있게 만듬
	 * 
	 * * 파이널 프로젝트(학원)
	 * - 프로젝트 생성 및 login.jsp에서 로그인 후 home.jsp로 가도록 구현 완료 
	 * - 팀원들에게 배포 
	 * 
	 * ___________________________________________________________________________
	 * 
	 * 10-16 금
	 * * 개인공부
	 * - 회원가입 이메일 인증:
	 * 		1. spring에 di주입
	 * 		2. 인증번호 생성 메소드 생성
	 * 		3. 보내기 
	 * 
	 * * 파이널 프로젝트(학원)
	 * - 회원가입(memberJoinForm.jsp)
	 * 		1. 스크립트
	 * 		- 아이디 중복체크
	 * 		- 비밀번호 같은지 확인
	 * 		- 이메일 select누르면 value 나오기
	 * 		- 이메일 인증번호 보내기 누르면 인증하기 버튼나오게하기
	 * 
	 * ___________________________________________________________________________
	 * 
	 * 10-17 토
	 * * 개인공부
	 * - 휴식
	 * 
	 * * 파이널 프로젝트(학원)
	 * - 회원가입(memberJoinForm.jsp)
	 * 		1. 정규표현식외 모든 예외처리 코드 작성
	 * 			- 약관동의
	 * 			- 중복체크
	 * 			- 아이디 
	 * 			- 비번1, 비번2
	 * 			- 이메일 인증
	 * 			- 관심사 선택
	 * 			했는지 안했으면 alert 띄어서 false주기
	 *  - 아이디 비번찾기(memberFindForm.jsp)
	 *  - 아이디찾기 완료 (ajax로 값을 받아와 성공하면 모달띄우기)
	 *  - 비번찾기 완료(ajax으로 비번 난수로 변경후 그 난수 이메일로 전송)
	 *  
	 *  ___________________________________________________________________________
	 *  
	 *  10-18 일
	 *  * 개인 공부
	 *  - Spring Websocket
	 *  	1. Handler에서 Controller로 값을 잘 넘기는지 확인
	 *  	2. 채팅 로직
	 *  		- 화면에서 상대방을 클릭했을 때 채팅방 화면으로 가는데 이 때, 채팅방이 없으면 생성 있으면 말고
	 *  		- 그 채팅방 기준으로 메세지 리턴 
	 *  
	 *  * 파이널 프로젝트(학원)
	 *  - 회원가입 및 로그인 페이지 정규표현식 추가 /^[a-z\d]{4-11}/; 이런식으로
	 *  - 회원가입 및 아이디 비번찾기 진짜 끝 만약 예외처리 덜된거 있으면 추가할듯 
	 */
}
