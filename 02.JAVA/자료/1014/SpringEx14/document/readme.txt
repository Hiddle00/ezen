
1. Spring Legacy Project 생성

2. 게시판 구현

3.@ResponseBody로 처리할 경우 디폴트 컨텐츠 타입은 text/plain; charset=ISO-8859-1 이기 때문에 
   한글도 인식이 되지 않을뿐더러 JQuery에서 받아올 시 객체로 인식될 수 없다. 
   때문에 servlet-context.xml 에 아래를 추가
	
	<annotation-driven>
		<message-converters>
			<beans:bean class="org.springframework.http.converter.StringHttpMessageConverter">
		            <beans:property name="supportedMediaTypes">
		                <beans:list>
		                    <beans:value>text/html;charset=UTF-8</beans:value>
		               </beans:list>
		           </beans:property>
			</beans:bean>
		</message-converters>
	</annotation-driven>
	
4. 회원가입시 e-mail 인증
   가. 아래의 블로그 참고 
      https://m.blog.naver.com/hj_kim97/222423081128
   나. 블로그에서 Javax Mail 라이브러리 사용하여 구현
   다. pom.xml에 의존성 라이브러리 추가 
	<dependency>
		<groupId>javax.mail</groupId>
		<artifactId>mail</artifactId>
		<version>1.4.7</version>
	</dependency>
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-context-support</artifactId>
		<version>${org.springframework-version}</version>
	</dependency>
   나. root-context.xml 파일에 이메일 서버 설정을 위한 bean 생성
	<bean id="mailSender" class="org.springframework.mail.javamail.JavaMailSenderImpl">
		<property name="host" value="smtp.naver.com" />
		<property name="port" value="465" />
		<property name="username" value="username" />
		<property name="password" value="password" />
		<property name="defaultEncoding" value="utf-8" />
		<property name="javaMailProperties">
			<props>
				<prop key="mail.debug">true</prop>
				<prop key="mail.smtp.starttls.enable">true</prop>
				<prop key="mail.smtps.ssl.checkserveridentity">true</prop>
				<prop key="mail.smtp.auth">true</prop>
				<prop key="mail.smtps.ssl.trust">*</prop>
				<prop key="mail.smtp.socketFactory.class">javax.net.ssl.SSLSocketFactory</prop>
			</props>
		</property>
	</bean>   
   다. BoardController.java에서 sendMail() 메쏘드 구현
      [ 주의사항 ] 네이버 2단계 인증에 사용하는 모바일 기기를 변경하거나,
      애플리케이션 비밀번호를 설정해야 한다.

