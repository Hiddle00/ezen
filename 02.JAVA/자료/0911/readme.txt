
1. Spring Legacy Project 생성

2. 첨부파일 업로드 / 다운로드 

3. pom.xml에 아래의 설정   
		<!-- 서블릿 3.0이상 사용 가능한 파일 업로드 api-->
		<dependency>
		    <groupId>commons-fileupload</groupId>
		    <artifactId>commons-fileupload</artifactId>
		    <version>1.3.1</version>
		</dependency>
		
		<!-- commons-io -->
		<dependency>
		    <groupId>commons-io</groupId>
		    <artifactId>commons-io</artifactId>
		    <version>2.4</version>
		</dependency>
		
4. 서블릿 config XML에 다음을 설정한다.
	<beans:bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
      
      <beans:property name="maxUploadSize" value="10485760" />
      <beans:property name="defaultEncoding" value="utf-8" />
   
   </beans:bean>		
   
   