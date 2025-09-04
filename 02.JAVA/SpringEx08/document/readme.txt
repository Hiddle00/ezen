1. @Component란?
@Component는 스프링(Spring) 프레임워크에서 클래스를 자동으로 빈(Bean)으로 등록하기 위해 클래스 레벨에 붙이는 어노테이션입니다. 이 어노테이션이 붙은 클래스의 인스턴스를 스프링 컨테이너가 생성하여 관리하고, 애플리케이션 내에서 재사용 가능한 독립적인 기능 단위인 '컴포넌트'로서 활용할 수 있도록 합니다. 

2. 사용방법
  가. spring xml 파일에 Namespaces 에서 context 를 추가한다.

  나. spring xml 파일에 다음과 같이 선언하여 사용 
      <context:component-scan base-package="ezen.di"></context:component-scan>

  다. <context:annotation-config /> 는 필요없으므로 삭제


