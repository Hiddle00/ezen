[ 참고 URL : https://kimdirector1090.tistory.com/129 ]

1. Filter, Interceptor, AOP의 차이점
   가. Filter(필터) 
       핸들러 동작의 전 후 과정에 부가로직 처리, 웹 컨테이너에서 관리
   나. Interceptor(인터셉터) 
       Spring MVC 프레임워크에서 제공하는 기능으로, 컨트롤러의 실행 전후 또는 뷰가 렌더링되기 전후에 특정한 작업을 
       수행할 수 있다. 주로 로깅, 권한 검사, 트랜잭션 관리 등의 업무를 처리한다.
   다. AOP(관점 지향 프로그래밍) 
      AOP는 관점 지향 프로그래밍의 약자로, 애플리케이션의 횡단 관심사를 모듈화하는 프로그래밍 패러다임이다. 
      AOP를 사용하면 핵심 비즈니스 로직과 공통 기능을 분리하여 코드의 중복을 최소화하고 관리를 용이하게 할 수 있다. 
   라. readme.png의 전체적인 흐름도 참고

2. Interceptor 구현

   가. Spring Legacy Project 생성

   나. Spring Interceptor 설명 
   
      org.springframework.web.servlet.HandlerInterceptor 구현체로 처리 가능
   
   다. servlet-context.xml 에 Interceptor 설정

    <interceptors>
           <interceptor>
               <mapping path="/**"/>
                   <beans:bean id="commonInterceptor" class="com.ezen.control.HomeController"/>
        </interceptor>
    </interceptors>   
    