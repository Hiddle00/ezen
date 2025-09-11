
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