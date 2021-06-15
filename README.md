# 정리
복습하기 위해 패스트캠퍼스 java-spring 완전정복을 공부하면서 정리한 Repository



# 객체지향의 등장

객체지향의 개념은 1970년대에 들어 용어가 나옴.
* 이전에는 c언어처럼 순서대로 명령어를 처리함 -> 절차지향 
* 절차지향의 문제점 - 프로그램의 복잡도가 증가하면서 이에 유지보수, 개발기간 등 다양한 부분에서 비효율이 발생
* 객체지향의 특성
  * 추상화
  * 상속
  * 은닉
  * 재사용
  * 인터페이스

* 현실의 사물을 그대로 모델링하여 행위와 속성을 정의
* 사물 - 객체
* 사물의 행위 - 메소드
* 사물의 속성 - 변수 

## 객체의 3가지요소
* 상태 유지 (객체의 상태)
  * 상태정보를 저장하고 유지되어져야 하며 속성은 변수로 정의 되어져야 한다. 속성값이 바뀜으로 인하여 객체의 상태가 변경될 수 있어야 한다

* 기능 제공 (객체의 책임) 
  * 객체는 기능 제공해야함 - 메소드로 제공
  * 캡슐화와 연관이 있으며, 외부로 부터 직접 속성을 접근하지 않고, 제공하는 메소드로 기능이 제공 되어야함

* 고유 식별자 제공(객체의 유일성) 
  * 각각의 객체는 고유한 식별자를 가져야 한다.(ex unique, primary key)


## 객체지향의 4대 특성

1. 캡슐화
 * 객체의 속성을 보호하기 위해서 사용
 * getter / setter method
 * CRUD method
 * Business Logic Method
 * 생명주기 처리 method
   * destory(), disconnect(), quit()
 * 객체의 영구성 관리 method - private method 
   * 외부에서 접근이 불가능하도록 하고, 내부의 다른 메소드를 통해서 사용되도록 한다. 
 * 장점 : 추상화 제공, 재 사용성 향상 - 유지보수 효율성 향상 
 * 무결성 
   * 변수 : private, method public (보통의경우)
   * public method는 입력되 ㄴ매개변수를 validation 한 후 실행하는 것을 기본으로 한다.    
   

2. 상속
* 객체지향에서의 상속은, 속성의 상속이 아닌, 하위로 내려갈 수록 구체화 되는 것
* 상속의 효과
  * 프로그램 구조에 대한 이해도 향상
    * 최상위 클래스 구조를 보고, 하위 클래스 동작 이해 가능
  * 재사용성 향상
    * 해당 클래스에 필요한 속성 및 메소드를 모두 정의 하지 않고, 상속 받아서 사용 가능
  * 확장성 향상
    * 일관된 형태의 클래스 객체를 추가 할 수 있어, 간단하게 프로그램 확장 가능
  * 유지보수성 향상
    * 일관된 형태로 작성이 가능

3. 다형성
* 하나의 개체가 여러개의 형태로 변화하는것.
* 오버라이딩 통해서 가능  

4. 추상화
* 객체지향에서 추상화는 모델링
* 공통적인 부분, 특정 특성을 분리해서 재조합 하는 부분이 추상화
* 앞에서 배운 다형성, 상속 모두 추상화에 속함     



# 객체지향 설계 5원칙 SOLID 

1. SRP(Single Responsibility Principle) - 단일 책임 원칙
* 어떠한 클래스를 변경해야 하는 이유는 한 가지 뿐이여야 한다. 

2. OCP( Open Closed Principle) - 개방 폐쇄 원칙
* 자신의 확장에는 열려 있고, 주변의 변화에 대해서는 닫혀 있어야 한다.
* 상위 클래스 또는 인터페이스를 중간에 둠으로써, 자신의 변화에 대해서는 폐쇠적이지만, 인터페이스는 외부의 변화에 대해서 확장을 개방해 줄 수 있다.

* JDBC, Mybatis, Hibernate등 에서 찾아 볼 수 있다.

3. LSP(Liskov Substitution Principle) 리스코프 치환 원칙
* 서브 타입은 항상 자신의 상위 타입으로 교체할 수 있어야 한다. 


4. ISP (Interface Segregation Principle) 인터페이스 분리 원칙
* 클라이언트는 자신이 사용하지 않는 메서드에 의존 관계를 맺으면 안된다.
* 프로젝트 요구 사항과 설계에 따라서 SRP / ISP 를 선택한다. 

5. DIP (Dependency Inversion Principle) 의존성 역전 원칙
* 자신보다 변하기 쉬운 것에 의존하지 말아야 한다. 
