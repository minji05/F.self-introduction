# 🙆‍♀️자기소개 앱
로그인, 회원가입, 자기소개 페이지로 구성된 자기소개 앱 입니다.

✔️ 로그인 페이지 및 회원가입 페이지
-------------
<div>
<img width="184" alt="image" src="https://github.com/minji05/F.self-introduction/assets/65258441/0d1188d7-7831-4f4c-b56c-359b9d190796"/>
<img width="185" alt="image" src="https://github.com/minji05/F.self-introduction/assets/65258441/2f407726-5dc9-4fc4-b165-f0cb7a4b623f"/>
</div>

<br />
 
+ 비밀번호 EditText는 입력 내용 숨기기
+ 입력 텍스트가 하나라도 비어 있다면 정보를 모두 입력해 달라는 토스트 메세지 출력
+ 버튼을 누르면 Activity 전환 (Extra로 아이디를 넘겨주기)
  
<br/>

✔️ 자기소개 페이지
-------------
<div>
<img width="185" alt="image" src="https://github.com/minji05/F.self-introduction/assets/65258441/c0f133d5-2754-4a81-9d00-607363cbd92e"/>
<img width="181" alt="image" src="https://github.com/minji05/F.self-introduction/assets/65258441/afad36d3-fc3d-451e-93cf-123ab3e24264"/>
</div>

<br />
 
+ SignInActivity에서 받은 extra data(아이디)를 화면에 표시
+ 종료 버튼이 눌리면 SignInActivity로 이동(finish 활용)
+ 자기 소개 랜덤 사진(Random 활용)
  
<br/>

➕ registerForActivityResult
-------------
<div>
<img width="185" alt="image" src="https://github.com/minji05/F.self-introduction/assets/65258441/f6214c17-3f92-402e-beb3-fbf320d89316"/>
<img width="184" alt="image" src="https://github.com/minji05/F.self-introduction/assets/65258441/4d77d04a-71eb-4aed-88ea-b8e737a54aaa"/>
</div>

<br />
 
+ 회원 가입페이지에서 입력한 아이디/비밀번호가 로그인 화면으로 돌아올 때 자동 입력
  
