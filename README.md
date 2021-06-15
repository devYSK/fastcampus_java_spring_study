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


# POJO Java?

POJO (Plain Old Java Object)
순수한 자바 오브젝트 

## 특징
1. 특정 규약에 종속되지 않는다.
   * 특정 Library, Module에서 정의된 클래스를 상속 받아서 구현하지 않아도 됨. 
   * POJO가 되기 위해서는 외부에 의존성을 두지 않고 순수한 JAVA로 구성해야함.
     
2. 특정 환경에 종속되지 않는다. 
    * 만일 특정 비즈니스 로직을 처리하는 부분에 외부 종속적인 http request, session등 POJO를 위배한 것으로 간주 
    * @Anotation 기반으로 설정하는 부분도 엄연히는 POJO라고 볼 수 없다. 


# 디자인 패턴

자주 사용하는 설계 패턴을 정형화 해서 이를 휴형별로 가장 최적의 방법으로 개발을 할 수 있도록 정해둔 설계  
알고리즘과 유사 하지만, 명확하게 정답이 있는 형태는 아니며 프로젝트의 상황에 맞추어 적용 가능 하다.

### Gof 디자인 패턴
SW를 설계할 때는 기존에 경험이 매우 중요. 그러나 모든 사람들이 다양한 경험을 가지고 있을 수는 없다.  
이러한 지식을 공유하기 위해서 나온것이 GOF의 디자인 패턴. 
총 23가지다.


## 디자인 패턴의 장점
* 개발자(설계자)와의 원활한 소통
* 소프트웨어 구조 파악 용이
* 재사용을 통한 개발 시간 단축
* 설계 변경 요청에 대한 유연한 대처 

## 디자인 패턴의 단점
* 객체지향 설계 / 구현
* 초기 투자 비용 부담 

# 디자인 패턴의 종류들

## 생성 패턴
객체를 생성하는 것과 관련된 패턴으로, 객체의 생성과 변경이 전체 시스템에 미치는 영향을 최소화 하고, 코드의 유연성을 높여 준다.

* Factory Method
* Singleton
* Prototype
* Builder
* Abstract Factory
* Chaining

## 구조 패턴
프로그램 내의 자료구조나 인터페이스 구조 등 프로그램 구조를 설계하는데 활용  
클래스, 객체들의 구성을 통해 더 큰 구조를 만들 수 있게 해줌   

* Adapter
* Composite
* Bridge
* Decorator
* Facade
* Flyweight
* Proxy

## 행위 패턴

반복적으로 사용되는 객체들의 상호작용을 패턴화한 것으로, 클래스나 객체들이 상호작용하는 방법과 책임을 분산하는 방법을 제공. 행위 패턴은 행위 관련 패턴을 사용하여 독립적으로 일을 처리하고자 할 때 사용

* Template Method
* Interpreter
* Iterator
* Observer
* Strategy
* Visitor
* Chain of responsibility
* Command
* Mediator
* State
* Memento


# Singleton Pattern
싱글톤 패턴은 어떠한 클래스(객체)가 유일하게 1개만 존재할 때 사용

이를 주로 사용하는 곳은 서로 자원을 공유 할 때 사용하는데, 실세계에서는 프린터가 해당, 실제 프로그래밍에서는 TCP Socket 통신에서 서버와 연결된 connect 객체에 주로 사용

```java
public class SocketClient {

    private static SocketClient socketClient = null;

    // default 생성자 막기
    private SocketClient(){}

    public static SocketClient getInstance(){

        if(socketClient == null){
            socketClient = new SocketClient();
            System.out.println("socket new instance");
        }

        return socketClient;
    }

    public void connect(){
        System.out.println("socket");
    }

}

```
# Adapter Pattern

호환성이 없는 기존 클래스의 인터페이스를 변환하여 재사용 할 수 있도록 한다.  
SOLID중에서 개방 폐쇄의 원칙(OCP)를 따른다.


# Proxy Pattern

Proxy는 대리인 이라는 뜻으로써, 뭔가를 대신해서 처리하는 것
Proxy Class를 통해서 대신 전달 하는 형태로 설계 되며, 실제 Client는 Proxy로부터 결과를 받는다. - Cache의 기능오로도 활용 가능  
SOLID 중에서 개방 폐쇄의 원칙(OCP)와 의존 역전 원칙(DIP)를 따름.





